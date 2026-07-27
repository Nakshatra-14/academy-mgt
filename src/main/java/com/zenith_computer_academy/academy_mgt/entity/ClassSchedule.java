package com.zenith_computer_academy.academy_mgt.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;

@Entity
@Getter
@Setter
public class ClassSchedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String dayName;

    private LocalTime startTime;

    private LocalTime endTime;

    private String courseName;
}