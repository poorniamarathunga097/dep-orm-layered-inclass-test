package lk.ijse.dep.orm;

import lk.ijse.dep.orm.util.JPAUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Demo {
    public static void main(String[] args) {
        EntityManagerFactory emf = JPAUtil.getEntityManageFactory();
        EntityManager em = null;
        try {
            emf = Persistence.createEntityManagerFactory("dep-6");
            em = emf.createEntityManager();
            em.getTransaction().begin();
            System.out.println(em);
            em.getTransaction().commit();
        }catch (Throwable t){
            if (em != null){
                em.getTransaction().rollback();
            }
            t.printStackTrace();
        }finally{
            em.close();
            emf.close();
        }
    }
}
