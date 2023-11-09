package com.doctor.ClassroomPlus.classroom.datamodel;

import com.doctor.ClassroomPlus.classroom.dbmodel.ClassroomDb;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import java.util.List;

@Getter
@Setter
@Builder
public class ClassroomModel {

    private String name;

    private String code;

    private String description;

    private Boolean isDeleted;

    private List<String> users;

    private List<String> posts;

    public ClassroomDb toDbModel(ClassroomModel classroomModel){
        ClassroomDb classroomDb = ClassroomDb.builder().name(this.name).posts(this.posts).code(this.code).isDeleted(this.isDeleted).description(this.description).users(this.users).build();
        return classroomDb;
    }


}
