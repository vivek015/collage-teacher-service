package com.collage.model;


import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class TeacherDetailsDTO {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String mobileNo;
    private String address;
    private String university;
    private String degree;
    private String startingDate;
    private String endingDate;
    private String city;
}
