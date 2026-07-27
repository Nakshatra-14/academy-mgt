package com.zenith_computer_academy.academy_mgt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="marks")
@Getter
@Setter
@IdClass(MarksId.class)
public class Marks
{
    @Id
    @Column(name="student_id")
    private String studentId;

    @Id
    @Column(name="exam_id")
    private String examId;

    @Column(name="mark_obtained")
    private Integer markObtained;
}
