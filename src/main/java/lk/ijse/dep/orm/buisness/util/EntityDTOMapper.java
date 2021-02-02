package lk.ijse.dep.orm.buisness.util;

import lk.ijse.dep.orm.dto.CourseDTO;
import lk.ijse.dep.orm.dto.StudentDTO;
import lk.ijse.dep.orm.entity.Course;
import lk.ijse.dep.orm.entity.Student;
import org.mapstruct.factory.Mappers;

import java.util.List;

public interface EntityDTOMapper {

    EntityDTOMapper instance = Mappers.getMapper(EntityDTOMapper.class);

    Student getStudent(StudentDTO dto);

    StudentDTO getStudentDTO(Student student);

    Course getCourse(CourseDTO dto);

    CourseDTO getCourseDTO(Course course);

    List<CourseDTO> getCourseDTOs(List<Course> customers);
}
