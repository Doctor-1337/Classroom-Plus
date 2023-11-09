package com.doctor.ClassroomPlus.classroom.dbmodel;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "posts")
@Getter
@Setter
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
@Component
public class PostDb {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;

    private String description;

    private Boolean isDeleted;

    private String user;
}
