package com.doctor.ClassroomPlus.classroom.repository;

import com.doctor.ClassroomPlus.classroom.dbmodel.PostDb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Long, PostDb> {
}
