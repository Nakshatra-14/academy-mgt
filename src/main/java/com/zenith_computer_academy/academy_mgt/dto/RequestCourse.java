package com.zenith_computer_academy.academy_mgt.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;

@Getter
public class RequestCourse {

    @NotBlank(message = "Course name is required")
    private String courseName;

}
