package com.zenith_computer_academy.academy_mgt.dto;

import java.util.Date;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RequestNote {

    @NotBlank
    private String title;

    private String noteText;

    private Date dueDate;

    private String status;
}