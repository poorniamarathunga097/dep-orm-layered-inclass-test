package lk.ijse.dep.orm.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "register")
public class Register {
    @EmbeddedId
    private RegisterPK registerPK;
    @Column(name = "register_date")
    private Date registerDate;
    @Column(name = "register_fee")
    private BigDecimal registerFee;
    @ManyToOne
    @Setter(AccessLevel.NONE)
    @JoinColumn(name="student_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Student student;
    @ManyToOne
    @Setter(AccessLevel.NONE)
    @JoinColumn(name="course_code", referencedColumnName = "code", insertable = false, updatable = false)
    private Course course;


    public Register(RegisterPK registerPK, Date registerDate, BigDecimal registerFee) {
        this.registerPK = registerPK;
        this.registerDate = registerDate;
        this.registerFee = registerFee;
    }

    public Register(int studentId,String courseCode, Date registerDate, BigDecimal registerFee) {
        this.registerPK = new RegisterPK(courseCode,studentId);
        this.registerDate = registerDate;
        this.registerFee = registerFee;
    }
}
