package com.zenith_computer_academy.academy_mgt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zenith_computer_academy.academy_mgt.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, String>{

}
