package lk.ijse.dep.orm.entity;

import javax.persistence.Column;
import java.io.Serializable;

public class Address implements Serializable {
    private String no;
    @Column(name = "address_line1")
    private String addressLine1;
    @Column(name = "address_line2")
    private String addressLine2;
    private String city;
}
