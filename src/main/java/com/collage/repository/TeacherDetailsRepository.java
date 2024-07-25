package com.collage.repository;


import com.collage.entity.TeacherDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherDetailsRepository  extends JpaRepository<TeacherDetails, Long> {
}
