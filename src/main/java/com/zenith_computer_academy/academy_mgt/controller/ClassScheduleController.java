
package com.zenith_computer_academy.academy_mgt.controller;


import com.zenith_computer_academy.academy_mgt.entity.ClassSchedule;
import com.zenith_computer_academy.academy_mgt.service.ClassScheduleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/schedule")
@CrossOrigin("*")
public class ClassScheduleController {

    private final ClassScheduleService service;

    public ClassScheduleController(
            ClassScheduleService service
    ) {
        this.service = service;
    }

    @GetMapping
    public List<ClassSchedule> getAll() {
        return service.getAll();
    }

    @PostMapping
    public ClassSchedule save(
            @RequestBody ClassSchedule schedule
    ) {
        return service.save(schedule);
    }

    @DeleteMapping("/{id}")
    public void delete(
            @PathVariable Integer id
    ) {
        service.delete(id);
    }
}