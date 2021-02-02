package lk.ijse.dep.orm.entity;

import com.sun.xml.internal.ws.wsdl.writer.document.http.Address;
import lk.ijse.dep.orm.util.Gender;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.lang.annotation.Target;
import java.util.Date;
import java.util.List;


@Data
@NoArgsConstructor @AllArgsConstructor @ToString
@Entity @Table(name = "student")
public class Student implements SuperEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    @Column(name = "student_name")
    private String studentName;
    private String contact;
    private Date dob;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @AttributeOverride(name = "no",column = @Column(name = "student_house_no"))
    @AttributeOverride(name = "addressLine1",column = @Column(name = "student_house_address_line1"))
    @AttributeOverride(name = "addressLine2",column = @Column(name = "student_house_address_line2"))
    @AttributeOverride(name = "city",column = @Column(name = "student_house_city"))
    @Embedded
    private Address address;

    @OneToMany(mappedBy = "student")
    @Setter(AccessLevel.NONE)
    private List<Register> registers;

    public Student(int id, String studentName, String contact, Date dob, Gender gender, Address address) {
        this.id = id;
        this.studentName = studentName;
        this.contact = contact;
        this.dob = dob;
        this.gender = gender;
        this.address = address;
    }
}
