package lk.ijse.dep.orm.buisness.custom.impl;

import lk.ijse.dep.orm.buisness.custom.CourseBO;
import lk.ijse.dep.orm.buisness.util.EntityDTOMapper;
import lk.ijse.dep.orm.dao.custom.CourseDAO;
import lk.ijse.dep.orm.dao.custom.StudentDAO;
import lk.ijse.dep.orm.dto.CourseDTO;

import javax.persistence.EntityManager;
import java.util.List;

public class CourseBOImpl implements CourseBO {
    private EntityManager em;
    private final EntityDTOMapper mapper = EntityDTOMapper.instance;
    private CourseDAO courseDAO;

    @Override
    public void setEntityManager(EntityManager em) {
        this.em = em;
        courseDAO.setEntityManager(em);
    }

    @Override
    public void saveCourse(CourseDTO dto) throws Exception {
        try {
            em.getTransaction().begin();
            courseDAO.save(mapper.getCourse(dto));
            em.getTransaction().commit();
        } catch (Throwable t) {
            em.getTransaction().rollback();
            throw t;
        }
    }

    @Override
    public void updateCourse(CourseDTO dto) throws Exception {
        try {
            em.getTransaction().begin();
            courseDAO.update(mapper.getCourse(dto));
            em.getTransaction().commit();
        } catch (Throwable t) {
            em.getTransaction().rollback();
            throw t;
        }
    }

    @Override
    public void deleteCourse(String id) throws Exception {
        try {
            em.getTransaction().begin();
            courseDAO.delete(id);
            em.getTransaction().commit();
        } catch (Throwable t) {
            em.getTransaction().rollback();
            throw t;
        }
    }

    @Override
    public List<CourseDTO> findAllCourses() throws Exception {
        try {
            em.getTransaction().begin();
            List<CourseDTO> courseDTOS = mapper.getCourseDTOs(courseDAO.getAll());
            em.getTransaction().commit();
            return courseDTOS;
        } catch (Throwable t) {
            em.getTransaction().rollback();
            throw t;
        }
    }

}
