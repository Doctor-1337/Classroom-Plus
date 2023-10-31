package com.doctor.ClassroomPlus.user.userdbmodel;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity(name = "Usertable")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String emailId;

    private String password;

    private String classesEnrolled;

    private String role;


}
