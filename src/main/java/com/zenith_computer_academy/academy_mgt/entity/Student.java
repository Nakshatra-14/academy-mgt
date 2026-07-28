package com.zenith_computer_academy.academy_mgt.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "student")
@Getter
@Setter
public class Student {

    @Id
    @Column(name = "student_id")
    private String studentId;
    @Column(name = "name")
    @NotBlank(message = "Name is required")
    private String name;    
    @Column(name = "dob")
    private String dob;
    @Column(name = "gender")
    private Character gender;
    @Column(name = "father_name")
    private String fatherName;
    @Column(name = "mother_name")
    private String motherName;
    @Column(name = "guardian_name")
    private String gurdianName;
    @Column(name = "guardian_relation")
    private String gurdianRelation;
    @Column(name = "whatsapp_phone")
    private String whatsappNumber;
    @Column(name = "address")
    private String address;
    @Column(name = "school")
    private String school;
    @Column(name = "class")
    private String studentClass;
    @Column(name = "admission_date")
    private String admissionDate;
    @Column(name = "course_fees")
    private double fees;
    @Column(name = "status")
    private String status;
    @Column(name = "note")
    private String note;
    @Column(name="course_id")
    private String courseId;

    public Student(){}

}
