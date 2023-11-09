package com.doctor.ClassroomPlus.user.auth;

import com.doctor.ClassroomPlus.user.repository.UserRepository;
import com.doctor.ClassroomPlus.user.userdbmodel.UserDb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class UserDetailSecurity implements UserDetailsService {

    @Autowired
    UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        UserDb userDb = userRepository.findUserByEmailId(username);
        if(userDb == null){
            throw new UsernameNotFoundException("Username "+ username + " not found");
        }
        return new UserSecurity(userDb);
    }
}
