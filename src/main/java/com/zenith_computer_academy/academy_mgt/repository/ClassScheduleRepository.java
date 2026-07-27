package com.zenith_computer_academy.academy_mgt.repository;

import com.zenith_computer_academy.academy_mgt.entity.ClassSchedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassScheduleRepository
        extends JpaRepository<ClassSchedule,Integer> {
}