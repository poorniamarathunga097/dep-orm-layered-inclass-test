package lk.ijse.dep.orm.buisness.custom.impl;

import lk.ijse.dep.orm.buisness.SuperBO;
import lk.ijse.dep.orm.buisness.custom.StudentBO;
import lk.ijse.dep.orm.dto.CourseDTO;
import lk.ijse.dep.orm.dto.StudentDTO;

import javax.persistence.EntityManager;
import java.util.List;

public class StudentBOImpl implements StudentBO {

    @Override
    public void setEntityManager(EntityManager em) {

    }

    @Override
    public void saveStudent(StudentDTO dto) throws Exception {

    }

    @Override
    public void updateStudent(StudentDTO dto) throws Exception {

    }

    @Override
    public void deleteStudent(String id) throws Exception {

    }

    @Override
    public List<StudentDTO> findAllStudents() throws Exception {
        return null;
    }

}
