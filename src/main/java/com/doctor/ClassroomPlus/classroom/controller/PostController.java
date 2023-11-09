package com.doctor.ClassroomPlus.classroom.controller;

import com.doctor.ClassroomPlus.classroom.datamodel.PostModel;
import com.doctor.ClassroomPlus.classroom.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("classroom/post")
public class PostController {

    @Autowired
    PostService postService;

    @PostMapping("publish")
    public PostModel createPost(@RequestBody PostModel postModel){
        return postService.createPost(postModel);
    }

    @PostMapping("edit")
    public PostModel editPost(@RequestBody PostModel postModel){
        return postService.editPost(postModel);
    }

    @PostMapping("delete")
    public PostModel deletePost(@RequestBody PostModel postModel){
        return postService.deletePost(postModel);
    }

}
