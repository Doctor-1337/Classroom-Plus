package com.doctor.ClassroomPlus.classroom.repository;

import com.doctor.ClassroomPlus.classroom.dbmodel.ClassroomDb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassroomRepository extends JpaRepository<ClassroomDb, Long> {
}
