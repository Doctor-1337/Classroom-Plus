package com.doctor.ClassroomPlus.classroom.dbmodel;

import com.doctor.ClassroomPlus.classroom.datamodel.ClassroomModel;
import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;

@Entity(name = "classroom")
@Getter
@Setter
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
public class ClassroomDb {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @Column(unique = true)
    private String code;

    private String description;

    private Boolean isDeleted;

    private List<String> users;

    private List<String> posts;

    public ClassroomModel toDataModel() {

        ClassroomModel classroomModel = ClassroomModel.builder().code(this.code).description(this.description).isDeleted(this.isDeleted).description(this.description).posts(this.posts).users(this.users).build();
        return classroomModel;
    }
}
