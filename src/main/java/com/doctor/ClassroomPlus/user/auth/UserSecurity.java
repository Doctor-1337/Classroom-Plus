package com.doctor.ClassroomPlus.user.auth;

import com.doctor.ClassroomPlus.user.userdbmodel.UserDb;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Component
public class UserSecurity implements UserDetails {

    private final UserDb userDb;

    public UserSecurity(UserDb userDb){
        this.userDb = userDb;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority("ADMIN"));
        return authorities;
    }

    @Override
    public String getPassword() {
        return userDb.getPassword();
    }

    @Override
    public String getUsername() {
        return userDb.getEmailId();
    }

    @Override
    public boolean isAccountNonExpired() {
        return !userDb.getIsDeleted() ;
    }

    @Override
    public boolean isAccountNonLocked() {
        return !userDb.getIsDeleted();
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return !userDb.getIsDeleted();
    }

    @Override
    public boolean isEnabled() {
        return !userDb.getIsDeleted();
    }
}
