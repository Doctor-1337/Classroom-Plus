package com.doctor.ClassroomPlus.user.usercontroller;

import com.doctor.ClassroomPlus.user.service.UserService;
import com.doctor.ClassroomPlus.user.userdbmodel.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;
    @PostMapping("register")
    public User signUp(@RequestBody User user){
        System.out.println("Register");
        return userService.addUser(user);
    }

    @GetMapping("delete")
    public String deleteUser(){
        System.out.println("Delete");
        return "User delete Api";
    }

    @PostMapping("login")
    public String login(@RequestBody User requestBody){
        System.out.println("Login");
        return "User login Api";

    }




}
