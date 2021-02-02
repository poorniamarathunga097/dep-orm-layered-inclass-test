package lk.ijse.dep.orm.util;

import junit.framework.TestCase;

import javax.persistence.EntityManager;

import static org.junit.Assert.assertNotNull;

public class JPAUtilTest extends TestCase {

    public void testGetDataSource() {
        assertNotNull(JPAUtil.getDataSource());
    }

    public void testGetEntityManageFactory() {
        assertNotNull(JPAUtil.getEntityManageFactory());
        EntityManager entityManager = JPAUtil.getEntityManageFactory().createEntityManager();
        assertNotNull(entityManager);
        if (entityManager != null){
            entityManager.close();
        }
    }
}
