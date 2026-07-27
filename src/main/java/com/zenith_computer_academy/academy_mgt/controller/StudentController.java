package com.zenith_computer_academy.academy_mgt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zenith_computer_academy.academy_mgt.dto.RequestStudent;
import com.zenith_computer_academy.academy_mgt.entity.Student;
import com.zenith_computer_academy.academy_mgt.service.StudentService;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    private StudentService service;

    StudentController(StudentService service) {
        this.service = service;
    }

    @PostMapping
    public Student addStudent(@Valid @RequestBody RequestStudent request) {
        return service.addStudent(request);
    }

    @PutMapping("/{id}")
    public Student updateStudent(
            @PathVariable String id,
            @Valid @RequestBody RequestStudent request)
    {
        return service.updateStudent(id, request);
    }

    @GetMapping
    public List<Student> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable String id) {
        return service.getById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable String id) {
        service.removeStudent(id);
    }

    @GetMapping("/course/{courseId}")
    public List<Student>
    getStudentsByCourse(
            @PathVariable String courseId)
    {
        return service.getByCourse(courseId);
    }

}
