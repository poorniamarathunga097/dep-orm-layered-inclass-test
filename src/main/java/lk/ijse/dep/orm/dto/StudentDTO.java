package lk.ijse.dep.orm.dto;

import lk.ijse.dep.orm.util.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class StudentDTO implements Serializable {
    private String id;
    private String studentName;
    private Gender gender;
    private Date date;
}
