package com.zenith_computer_academy.academy_mgt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zenith_computer_academy.academy_mgt.entity.Marks;
import com.zenith_computer_academy.academy_mgt.entity.MarksId;

@Repository
public interface MarksRepository
        extends JpaRepository<Marks, MarksId>
{
    List<Marks> findByExamId(String examId);
    List<Marks> findByStudentId(String studentId);
}
