package lk.ijse.dep.orm.entity;

import lk.ijse.dep.orm.util.Audience;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data @AllArgsConstructor @NoArgsConstructor @ToString
@Entity @Table(name = "course")
public class Course implements SuperEntity{
    @Id
    private String code;
    private String description;
    private String duration;
    @Enumerated(EnumType.ORDINAL)
    private Audience audience;

    @OneToMany(mappedBy = "course")
    @Setter(AccessLevel.NONE)
    private List<Register> registers;

    public Course(String code, String description, String duration, Audience audience) {
        this.code = code;
        this.description = description;
        this.duration = duration;
        this.audience = audience;
    }

}
