package lk.ijse.dep.orm.dao;

import javax.persistence.EntityManager;

public interface SuperDAO {
    public void setEntityManager(EntityManager em);
}
