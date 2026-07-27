package com.zenith_computer_academy.academy_mgt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zenith_computer_academy.academy_mgt.entity.Student;

public interface StudentRepository extends JpaRepository<Student, String>{
    List<Student> findByCourseId(String courseId);
    Student findTopByOrderByStudentIdDesc();
}
