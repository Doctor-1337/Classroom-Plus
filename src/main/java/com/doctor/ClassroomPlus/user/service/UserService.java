package com.doctor.ClassroomPlus.user.service;

import com.doctor.ClassroomPlus.user.datamodel.UserModel;
import com.doctor.ClassroomPlus.user.repository.UserRepository;
import com.doctor.ClassroomPlus.user.userdbmodel.UserDb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;
    public UserDb addUser(UserModel userModel){
        //TODO Add validation for user
        boolean isDeleted = false;
       return userRepository.save(userModel.getUser(isDeleted));
    }

    public UserDb fetchUser(Long id){
        return userRepository.findById(id).get();
    }

    public UserDb deleteUser(UserModel userModel) {
        UserDb userDb = userRepository.findUserByEmailId(userModel.getEmailId());
        userDb.setIsDeleted(Boolean.TRUE);
        return userRepository.save(userDb);
    }
}
