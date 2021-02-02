package lk.ijse.dep.orm.buisness.custom;

import lk.ijse.dep.orm.buisness.SuperBO;
import lk.ijse.dep.orm.dto.CourseDTO;
import lk.ijse.dep.orm.dto.StudentDTO;

import java.util.List;

public interface StudentBO extends SuperBO {
    public void saveStudent(StudentDTO dto) throws Exception;
    public void updateStudent(StudentDTO dto) throws Exception;
    public void deleteStudent(String id) throws Exception;
    public List<StudentDTO> findAllStudents() throws Exception;
}
