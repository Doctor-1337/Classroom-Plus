package com.doctor.ClassroomPlus.user.auth;

import com.doctor.ClassroomPlus.user.repository.UserRepository;
import com.doctor.ClassroomPlus.user.userdbmodel.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserDetailSecurity implements UserDetailsService {

    @Autowired
    UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userRepository.findUserByEmailId(username);
        if(user == null){
            throw new UsernameNotFoundException("Username "+ username + " not found");
        }
        return new UserSecurity(user);
    }
}
