package com.zenith_computer_academy.academy_mgt.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="notes")
@Getter
@Setter
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="note_id")
    private Integer noteId;

    @Column(name="title")
    private String title;

    @Column(name="note_text")
    private String noteText;

    @Column(name="due_date")
    private Date dueDate;

    @Column(name="status")
    private String status;
}