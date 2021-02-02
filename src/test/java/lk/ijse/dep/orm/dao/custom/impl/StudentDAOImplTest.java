package lk.ijse.dep.orm.dao.custom.impl;

import junit.framework.TestCase;
import lk.ijse.dep.orm.dao.custom.StudentDAO;
import lk.ijse.dep.orm.entity.Student;
import lk.ijse.dep.orm.util.Gender;
import lk.ijse.dep.orm.util.JPAUtil;

public class StudentDAOImplTest extends TestCase {


    public void testSave() throws Exception {
        StudentDAO studentDAO = new StudentDAOImpl();
        studentDAO.setEntityManager(JPAUtil.getEntityManageFactory().createEntityManager());
       // studentDAO.save(new Student(1,"poorni","373737", Gender.FEMALE));
    }
}
