package com.doctor.ClassroomPlus.classroom.service;

import com.doctor.ClassroomPlus.classroom.datamodel.ClassroomModel;
import com.doctor.ClassroomPlus.classroom.dbmodel.ClassroomDb;
import com.doctor.ClassroomPlus.classroom.repository.ClassroomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClassroomService {

    @Autowired
    ClassroomRepository classroomRepository;
    public ClassroomModel createClassroom(ClassroomModel classroomModel) {

        ClassroomDb classroomDb = ClassroomDb.builder().code(classroomModel.getCode()).users(classroomModel.getUsers()).posts(classroomModel.getPosts()).description(classroomModel.getDescription()).name(classroomModel.getName()).isDeleted(false).build();
        return classroomRepository.save(classroomDb).toDataModel();
    }

    public ClassroomModel joinClassroom(ClassroomModel classroomModel) {

        ClassroomDb classroomDb = ClassroomDb.builder().code(classroomModel.getCode()).users(classroomModel.getUsers()).posts(classroomModel.getPosts()).description(classroomModel.getDescription()).name(classroomModel.getName()).isDeleted(false).build();
        return classroomRepository.save(classroomDb).toDataModel();
    }

    public ClassroomModel deleteClassroom(ClassroomModel classroomModel) {
        ClassroomDb classroomDb = ClassroomDb.builder().code(classroomModel.getCode()).users(classroomModel.getUsers()).posts(classroomModel.getPosts()).description(classroomModel.getDescription()).name(classroomModel.getName()).isDeleted(true).build();
        return classroomRepository.save(classroomDb).toDataModel();
    }
}
