package lk.ijse.dep.orm.dao;

import lk.ijse.dep.orm.entity.SuperEntity;

import javax.persistence.EntityManager;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

public abstract class CrudDAOImpl<T extends SuperEntity, K extends Serializable> implements CrudDAO<T,K>  {

    private EntityManager em;
    private Class<T> entityObj;

    public CrudDAOImpl() {
        entityObj = (Class<T>) (((ParameterizedType) (this.getClass().getGenericSuperclass())).getActualTypeArguments()[0]);
    }

    public void setEntityManager(EntityManager em) {
        this.em = em;
    }

    public void save(T entity) throws Exception {
        em.persist(entity);
    }

    public void update(T entity) throws Exception {
        em.merge(entity);
    }

    public void delete(K key) throws Exception {
        em.remove(em.getReference(entityObj,key));
    }

    public T get(K key) throws Exception {
        return em.find(entityObj,key);
    }

    public List<T> getAll() throws Exception {
        return em.createQuery("SELECT e FROM " + entityObj.getName() + " e").getResultList(); //use jpql
    }

}
