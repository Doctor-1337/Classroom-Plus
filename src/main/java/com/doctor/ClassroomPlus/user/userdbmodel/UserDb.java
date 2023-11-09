package com.doctor.ClassroomPlus.user.userdbmodel;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity(name = "Usertable")
@Getter
@Setter
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
@Component
public class UserDb {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private String emailId;

    private String password;

    private String classesEnrolled;

    private String role;

    private Boolean isDeleted;
}
