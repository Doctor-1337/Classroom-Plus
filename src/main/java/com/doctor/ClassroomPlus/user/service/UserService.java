package com.doctor.ClassroomPlus.user.service;

import com.doctor.ClassroomPlus.user.repository.UserRepository;
import com.doctor.ClassroomPlus.user.userdbmodel.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;
    public User addUser(User user){
       return userRepository.save(user);
    }

    public User fetchUser(Long id){
        return userRepository.findById(id).get();
    }

}
