package com.zenith_computer_academy.academy_mgt.dto;

import java.util.Date;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RequestExam {

    @NotBlank
    private String examName;

    @NotNull
    private Integer totalMarks;

    private String examDate;

    @NotBlank
    private String courseId;
}