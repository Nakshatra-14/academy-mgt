package com.zenith_computer_academy.academy_mgt.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zenith_computer_academy.academy_mgt.dto.RequestCourse;
import com.zenith_computer_academy.academy_mgt.entity.Course;
import com.zenith_computer_academy.academy_mgt.repository.CourseRepository;

@Service
public class CourseService {

    
    private CourseRepository repo;

    public CourseService(CourseRepository courseRepository)
    {
        this.repo = courseRepository;
    }

    public Course save(RequestCourse request)
    {
        Course c = new Course();
        c.setId(generateCourseId());
        c.setCourseName(request.getCourseName());
        return repo.save(c);
    }

    private String generateCourseId() {
        long n = repo.count()+1;
        return String.format("CR%03d", n);
    }

    public List<Course> getAll()
    {
        return repo.findAll();
    }
    
    public Course updateCourse(Course course)
    {
        return repo.save(course);
    }

    public void removeCourse(String id)
    {
        if(repo.existsById(id)) 
            repo.deleteById(id);
        else 
            throw new RuntimeException("Course not found");
    }

    public Course getById(String id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Course not found"));
    }
}
