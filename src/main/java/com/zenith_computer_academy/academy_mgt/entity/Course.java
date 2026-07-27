package com.zenith_computer_academy.academy_mgt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "course")
@Getter
@Setter
public class Course {

    @Id
    @Column(name = "course_id")
    private String id;
    @Column(name = "course_name")
    @NotBlank(message = "Course name is required")
    private String courseName;

    public Course() {}

    
}
