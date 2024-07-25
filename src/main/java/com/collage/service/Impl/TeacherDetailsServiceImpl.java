package com.collage.service.Impl;


import com.collage.entity.TeacherDetails;
import com.collage.model.TeacherDetailsDTO;
import com.collage.repository.TeacherDetailsRepository;
import com.collage.service.TeacherDetailsService;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherDetailsServiceImpl  implements TeacherDetailsService {

    @Autowired
    private TeacherDetailsRepository teacherDetailsRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<TeacherDetails> getAllTeacher() {

        List<TeacherDetails> getTeacherResponse = teacherDetailsRepository.findAll();
        return getTeacherResponse;
    }

    @Override
    public TeacherDetailsDTO createTeacher(TeacherDetailsDTO teacherDetailsDTO) {
        TeacherDetails teacherDetailsResponse =this.dtoToEntity(teacherDetailsDTO);
        TeacherDetails saveTeacher= teacherDetailsRepository.save(teacherDetailsResponse);

        return this.entityToDto(saveTeacher);
    }



    public TeacherDetails dtoToEntity(TeacherDetailsDTO teacherDetailsDTO)
    {
        TeacherDetails teacherDetails = this.modelMapper.map(teacherDetailsDTO, TeacherDetails.class);
        return teacherDetails;
    }

    public TeacherDetailsDTO entityToDto(TeacherDetails teacherDetails)
    {
        TeacherDetailsDTO teacherDetailsDTO= this.modelMapper.map(teacherDetails, TeacherDetailsDTO.class);
        return teacherDetailsDTO;
    }
}
