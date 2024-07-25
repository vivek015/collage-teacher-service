package com.collage.service;


import com.collage.entity.TeacherDetails;
import com.collage.model.TeacherDetailsDTO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface TeacherDetailsService {

    public List<TeacherDetails> getAllTeacher();
    public TeacherDetailsDTO createTeacher(TeacherDetailsDTO teacherDetailsDTO);




}
