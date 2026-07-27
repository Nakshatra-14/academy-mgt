package com.zenith_computer_academy.academy_mgt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zenith_computer_academy.academy_mgt.entity.Exam;

public interface ExamRepository
extends JpaRepository<Exam,String>
{
}