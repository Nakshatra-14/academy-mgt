package com.zenith_computer_academy.academy_mgt.dto;

import java.util.Date;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RequestStudent {

    @NotBlank(message = "Name is required")
    private String name;    
    private Date dob;
    private Character gender;
    private String fatherName;
    private String motherName;
    private String gurdianName;
    private String gurdianRelation;
    private String whatsappNumber;
    private String address;
    private String school;
    private String studentClass;
    private Date admissionDate;
    private double fees;
    private String status;
    private String note;
    private String courseId;
}
