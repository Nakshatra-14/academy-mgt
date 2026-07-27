package com.zenith_computer_academy.academy_mgt.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "exam")
@Getter
@Setter
public class Exam {

    @Id
    @Column(name = "exam_id")
    private String examId;

    @Column(name = "exam_name")
    private String examName;

    @Column(name = "total_marks")
    private Integer totalMarks;

    @Column(name = "exam_date")
    private Date examDate;

    @Column(name = "course_id")
    private String courseId;

    public Exam() {}
}