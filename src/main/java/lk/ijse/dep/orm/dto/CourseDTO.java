package lk.ijse.dep.orm.dto;

import lk.ijse.dep.orm.util.Audience;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CourseDTO implements Serializable {
    private String code;
    private String description;
    private String duration;
    private Audience audience;
}
