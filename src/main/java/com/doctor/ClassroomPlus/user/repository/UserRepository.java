package com.doctor.ClassroomPlus.user.repository;

import com.doctor.ClassroomPlus.user.userdbmodel.UserDb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserDb,Long> {
    public UserDb findUserByEmailId(String emailId);
}
