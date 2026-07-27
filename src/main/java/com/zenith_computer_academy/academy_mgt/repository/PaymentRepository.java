package com.zenith_computer_academy.academy_mgt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zenith_computer_academy.academy_mgt.entity.Payment;

public interface PaymentRepository
        extends JpaRepository<Payment, Integer> {

    List<Payment> findByStudentId(String studentId);

}