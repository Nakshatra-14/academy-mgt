package com.zenith_computer_academy.academy_mgt.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.zenith_computer_academy.academy_mgt.dto.RequestExam;
import com.zenith_computer_academy.academy_mgt.entity.Exam;
import com.zenith_computer_academy.academy_mgt.service.ExamService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/exam")
@CrossOrigin("*")
public class ExamController {

    private ExamService service;

    public ExamController(ExamService service)
    {
        this.service = service;
    }

    @PostMapping
    public Exam addExam(
        @Valid
        @RequestBody
        RequestExam request)
    {
        return service.addExam(request);
    }

    @GetMapping
    public List<Exam> getAll()
    {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Exam getById(
        @PathVariable String id)
    {
        return service.getById(id);
    }

    @PutMapping("/{id}")
    public Exam updateExam(
            @PathVariable String id,
            @Valid @RequestBody RequestExam request)
    {
        Exam exam = new Exam();

        exam.setExamId(id);
        exam.setExamName(request.getExamName());
        exam.setTotalMarks(request.getTotalMarks());
        exam.setExamDate(request.getExamDate());
        exam.setCourseId(request.getCourseId());

        return service.updateExam(exam);
    }

    @DeleteMapping("/{id}")
    public void deleteExam(
        @PathVariable String id)
    {
        service.deleteExam(id);
    }
}