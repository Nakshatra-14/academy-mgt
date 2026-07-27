package com.zenith_computer_academy.academy_mgt.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zenith_computer_academy.academy_mgt.dto.RequestMarks;
import com.zenith_computer_academy.academy_mgt.entity.Marks;
import com.zenith_computer_academy.academy_mgt.service.MarksService;

@RestController
@RequestMapping("/api/marks")
@CrossOrigin("*")
public class MarksController {
    private final MarksService service;

    public MarksController(
            MarksService service) {
        this.service = service;
    }

    @PostMapping
    public Marks save(
            @RequestBody RequestMarks request) {
        return service.save(
                request);
    }

    @GetMapping("/exam/{examId}")
    public List<Marks> getMarks(
            @PathVariable String examId) {
        return service.getByExam(
                examId);
    }

    @GetMapping("/student/{studentId}")
    public List<Marks> getByStudent(
            @PathVariable String studentId) {
        return service.getByStudent(
                studentId);
    }
}
