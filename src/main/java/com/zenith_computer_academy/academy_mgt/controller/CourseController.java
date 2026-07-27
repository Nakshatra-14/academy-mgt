package com.zenith_computer_academy.academy_mgt.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin; 
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zenith_computer_academy.academy_mgt.dto.RequestCourse;
import com.zenith_computer_academy.academy_mgt.entity.Course;
import com.zenith_computer_academy.academy_mgt.service.CourseService;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/course")
@CrossOrigin("*")
public class CourseController {

    private CourseService service;

    public CourseController(CourseService courseService) {
        this.service = courseService;
    }

    @PostMapping
    public Course addCourse(@Valid @RequestBody RequestCourse request) {
        return service.save(request);
    }

    @GetMapping
    public List<Course> getAllCourse() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Course getCourse(
            @PathVariable String id) {
        return service.getById(id);
    }

    @PutMapping("/{id}")
    public Course updatCourse(@PathVariable String id, @Valid @RequestBody RequestCourse request) {
        Course c = new Course();
        c.setId(id);
        c.setCourseName(request.getCourseName());
        return service.updateCourse(c);
    }

    @DeleteMapping("/{id}")
    public void removeCourse(@PathVariable String id) {
        service.removeCourse(id);
    }

}
