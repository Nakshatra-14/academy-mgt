package com.zenith_computer_academy.academy_mgt.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MarksId implements Serializable
{
    private String studentId;
    private String examId;
}
