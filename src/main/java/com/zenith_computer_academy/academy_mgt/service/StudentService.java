package com.zenith_computer_academy.academy_mgt.service;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.zenith_computer_academy.academy_mgt.dto.RequestStudent;
import com.zenith_computer_academy.academy_mgt.entity.Student;
import com.zenith_computer_academy.academy_mgt.repository.StudentRepository;

@Service
public class StudentService {

    private StudentRepository repo;

    StudentService(StudentRepository repository) {
        this.repo = repository;
    }

    public Student addStudent(RequestStudent request) {
        Student s = new Student();
        s.setName(request.getName());
        s.setDob(request.getDob());
        s.setGender(request.getGender());
        s.setFatherName(request.getFatherName());
        s.setMotherName(request.getMotherName());
        s.setGurdianName(request.getGurdianName());
        s.setGurdianRelation(request.getGurdianRelation());
        s.setWhatsappNumber(request.getWhatsappNumber());
        s.setAddress(request.getAddress());
        s.setSchool(request.getSchool());
        s.setStudentClass(request.getStudentClass());
        s.setAdmissionDate(request.getAdmissionDate());
        s.setFees(request.getFees());
        s.setAdmissionFees(request.getAdmissionFees());
        s.setStatus(request.getStatus());
        s.setNote(request.getNote());
        s.setCourseId(request.getCourseId());
        s.setStudentId(getGeneratedIdValue());
        return repo.save(s);
    }

    private String getGeneratedIdValue() {
        Student lastStudent = repo.findTopByOrderByStudentIdDesc();

        if (lastStudent == null) {
            return "ZEN001";
        }

        String lastId = lastStudent.getStudentId();

        int number = Integer.parseInt(
                lastId.substring(3));

        number++;

        return String.format(
                "ZEN%03d",
                number);
    }

    public Student getById(String id) {
        return repo.findById(id)
                .orElseThrow(
                        () -> new RuntimeException(
                                "Student not found"));
    }

    public Student updateStudent(Student student) {
        return repo.save(student);
    }

    public Student updateStudent(
            String id,
            RequestStudent request) {
        Student s = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found"));

        s.setName(request.getName());
        s.setDob(request.getDob());
        s.setGender(request.getGender());
        s.setFatherName(request.getFatherName());
        s.setMotherName(request.getMotherName());
        s.setGurdianName(request.getGurdianName());
        s.setGurdianRelation(request.getGurdianRelation());
        s.setWhatsappNumber(request.getWhatsappNumber());
        s.setAddress(request.getAddress());
        s.setSchool(request.getSchool());
        s.setStudentClass(request.getStudentClass());
        s.setFees(request.getFees());
        s.setAdmissionFees(request.getAdmissionFees());
        s.setStatus(request.getStatus());
        s.setNote(request.getNote());
        s.setCourseId(request.getCourseId());
        s.setAdmissionDate(request.getAdmissionDate());

        return repo.save(s);
    }

    public List<Student> getAll() {
        return repo.findAll();
    }

    public void removeStudent(String id) {
        if (repo.existsById(id))
            repo.deleteById(id);
        else
            throw new RuntimeException("No Student exist of id " + id);
    }

    public List<Student> getByCourse(String courseId) {
        return repo.findByCourseId(
                courseId);
    }
}
