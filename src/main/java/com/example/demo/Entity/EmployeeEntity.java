package com.example.demo.Entity;


import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Data

@NoArgsConstructor
@Builder
@Log4j2
@Entity
@Table(name = "employees")
public class EmployeeEntity extends BaseEntity implements Serializable {

    @Column(name = "first_name")
    private String firstname;

    @Column(name = "last_name")
    private String Lastname;

    @Column(name = "email_id")
    private String emailId;

    public EmployeeEntity(String firstname, String lastname, String emailId) {
        this.firstname = firstname;
        Lastname = lastname;
        this.emailId = emailId;
    }

}
