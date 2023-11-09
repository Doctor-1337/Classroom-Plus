package com.doctor.ClassroomPlus.user.usercontroller;

import com.doctor.ClassroomPlus.user.datamodel.UserModel;
import com.doctor.ClassroomPlus.user.service.UserService;
import com.doctor.ClassroomPlus.user.userdbmodel.UserDb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;
    @PostMapping("register")
    public UserDb signUp(@RequestBody UserModel user){
        System.out.println("Register");
        return userService.addUser(user);
    }

    @GetMapping("delete")
    public UserDb deleteUser(@RequestBody UserModel user){
        System.out.println("Delete");
        return userService.deleteUser(user);
    }

    @PostMapping("login")
    public String login(@RequestBody UserDb requestBody){
        System.out.println("Login");
        return "User login Api";

    }




}
