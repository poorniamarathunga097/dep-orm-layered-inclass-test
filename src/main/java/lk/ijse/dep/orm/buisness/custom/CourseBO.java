package lk.ijse.dep.orm.buisness.custom;

import lk.ijse.dep.orm.buisness.SuperBO;
import lk.ijse.dep.orm.dto.CourseDTO;
import lk.ijse.dep.orm.dto.StudentDTO;

import java.util.List;

public interface CourseBO extends SuperBO {
    public void saveCourse(CourseDTO dto) throws Exception;
    public void updateCourse(CourseDTO dto) throws Exception;
    public void deleteCourse(String id) throws Exception;
    public List<CourseDTO> findAllCourses() throws Exception;
}
