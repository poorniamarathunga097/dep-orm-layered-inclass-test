package lk.ijse.dep.orm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class RegisterPK implements Serializable {
    @Column(name = "course_code")
    private String courseCode;
    @Column(name = "student_id")
    private int studentId;

}
