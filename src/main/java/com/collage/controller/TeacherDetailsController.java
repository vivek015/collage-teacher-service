package com.collage.controller;

import com.collage.entity.TeacherDetails;
import com.collage.model.TeacherDetailsDTO;
import com.collage.service.TeacherDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teacher")
public class TeacherDetailsController {

    @Autowired
    private TeacherDetailsService teacherDetailsService;

    @GetMapping("/getAllTeacher")
    public List<TeacherDetails> getAllTeacher()
    {
        return teacherDetailsService.getAllTeacher();
    }


    @PostMapping("/create")
    public TeacherDetailsDTO createTeacher(@RequestBody TeacherDetailsDTO teacherDetailsDTO)
    {
            return teacherDetailsService.createTeacher(teacherDetailsDTO);
    }


}
