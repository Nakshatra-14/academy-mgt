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
    private String dob;
    private Character gender;
    private String fatherName;
    private String motherName;
    private String gurdianName;
    private String gurdianRelation;
    private String whatsappNumber;
    private String address;
    private String school;
    private String studentClass;
    private String admissionDate;
    private double fees;
    private double admissionFees;
    private String status;
    private String note;
    private String courseId;
}
