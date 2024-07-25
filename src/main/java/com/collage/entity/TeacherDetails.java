package com.collage.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name ="Teacher_Details")
public class TeacherDetails implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name ="First_Name")
    private String firstName;

    @Column(name ="Last_Name")
    private String lastName;

    @Column(name ="Email")
    private String email;

    @Column(name ="Mobile_No")
    private String mobileNo;

    @Column(name="Address")
    private String address;

    @Column(name ="University")
    private String university;

    @Column(name ="Degree")
    private String degree;

    @Column(name ="Stating_Date")
    private String startingDate;

    @Column(name ="Ending_Date")
    private String endingDate;

    @Column(name ="City")
    private String city;


}
