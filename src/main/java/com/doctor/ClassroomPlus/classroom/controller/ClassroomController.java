package com.doctor.ClassroomPlus.classroom.controller;

import com.doctor.ClassroomPlus.classroom.datamodel.ClassroomModel;
import com.doctor.ClassroomPlus.classroom.datamodel.PostModel;
import com.doctor.ClassroomPlus.classroom.service.ClassroomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("classroom")
public class ClassroomController {

    @Autowired
    ClassroomService classroomService;
    @PostMapping("create")
    public ClassroomModel createClassroom(@RequestBody ClassroomModel classroomModel){
        return classroomService.createClassroom(classroomModel);
    }

    @PostMapping("join")
    public ClassroomModel joinClassroom(@RequestBody ClassroomModel classroomModel){
        return classroomService.joinClassroom(classroomModel);
    }

    @PostMapping("delete")
    public ClassroomModel deleteClassroom(@RequestBody ClassroomModel classroomModel){
        return classroomService.deleteClassroom(classroomModel);
    }








}
