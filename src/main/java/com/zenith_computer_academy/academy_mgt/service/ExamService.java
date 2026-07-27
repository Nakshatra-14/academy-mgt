package com.zenith_computer_academy.academy_mgt.service;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.zenith_computer_academy.academy_mgt.dto.RequestExam;
import com.zenith_computer_academy.academy_mgt.entity.Exam;
import com.zenith_computer_academy.academy_mgt.repository.ExamRepository;

@Service
public class ExamService {

    private ExamRepository repo;

    public ExamService(ExamRepository repo)
    {
        this.repo = repo;
    }

    public Exam addExam(RequestExam request)
    {
        Exam exam = new Exam();

        exam.setExamId(generateId());
        exam.setExamName(request.getExamName());
        exam.setTotalMarks(request.getTotalMarks());
        exam.setExamDate(request.getExamDate());
        exam.setCourseId(request.getCourseId());

        return repo.save(exam);
    }

    public Exam updateExam(Exam exam)
    {
        return repo.save(exam);
    }

    public List<Exam> getAll()
    {
        return repo.findAll();
    }

    public Exam getById(String id)
    {
        return repo.findById(id)
                .orElseThrow(
                    () -> new RuntimeException("Exam Not Found")
                );
    }

    public void deleteExam(String id)
    {
        repo.deleteById(id);
    }

    private String generateId()
    {
        long count = repo.count()+1;
        return String.format("EX%03d", count);
    }
}