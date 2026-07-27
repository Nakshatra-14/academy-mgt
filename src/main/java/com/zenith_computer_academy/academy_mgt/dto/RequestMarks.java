package com.zenith_computer_academy.academy_mgt.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RequestMarks
{
    private String studentId;
    private String examId;
    private Integer markObtained;
}
