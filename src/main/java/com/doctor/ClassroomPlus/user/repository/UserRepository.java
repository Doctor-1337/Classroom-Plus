package com.doctor.ClassroomPlus.user.repository;

import com.doctor.ClassroomPlus.user.userdbmodel.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    public User findUserByEmailId(String emailId);
}
