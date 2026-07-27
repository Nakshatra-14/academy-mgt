package com.zenith_computer_academy.academy_mgt.service;

import com.zenith_computer_academy.academy_mgt.entity.ClassSchedule;
import com.zenith_computer_academy.academy_mgt.repository.ClassScheduleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassScheduleService {

    private final ClassScheduleRepository repository;

    public ClassScheduleService(
            ClassScheduleRepository repository
    ) {
        this.repository = repository;
    }

    public List<ClassSchedule> getAll() {
        return repository.findAll();
    }

    public ClassSchedule save(
            ClassSchedule schedule
    ) {
        return repository.save(schedule);
    }

    public void delete(
            Integer id
    ) {
        repository.deleteById(id);
    }
}