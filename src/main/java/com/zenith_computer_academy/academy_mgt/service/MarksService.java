package com.zenith_computer_academy.academy_mgt.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zenith_computer_academy.academy_mgt.dto.RequestMarks;
import com.zenith_computer_academy.academy_mgt.entity.Marks;
import com.zenith_computer_academy.academy_mgt.repository.MarksRepository;

@Service
public class MarksService {
    private final MarksRepository repo;

    public MarksService(MarksRepository repo) {
        this.repo = repo;
    }

    public Marks save(RequestMarks request) {
        Marks m = new Marks();

        m.setStudentId(
                request.getStudentId());

        m.setExamId(
                request.getExamId());

        m.setMarkObtained(
                request.getMarkObtained());

        return repo.save(m);
    }

    public List<Marks> getByExam(
            String examId) {
        return repo.findByExamId(
                examId);
    }

    public List<Marks> getByStudent(
            String studentId) {
        return repo.findByStudentId(
                studentId);
    }
}
