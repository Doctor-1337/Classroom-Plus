package com.doctor.ClassroomPlus.user.datamodel;

import com.doctor.ClassroomPlus.user.userdbmodel.UserDb;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserModel {

    private String emailId;

    private String password;

    private String classesEnrolled;

    private String role;

    private boolean isDeleted;

    public UserDb getUser(boolean isDeleted) {
        return UserDb.builder().emailId(this.getEmailId()).
                password(this.getPassword()).classesEnrolled(this.getClassesEnrolled()).
                role(this.getRole()).isDeleted(isDeleted).build();
    }
}
