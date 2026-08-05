package com.zenith_computer_academy.academy_mgt.service;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.zenith_computer_academy.academy_mgt.dto.RequestPayment;
import com.zenith_computer_academy.academy_mgt.entity.Payment;
import com.zenith_computer_academy.academy_mgt.repository.PaymentRepository;

@Service
public class PaymentService {

    private PaymentRepository repo;

    public PaymentService(
            PaymentRepository repository) {
        this.repo = repository;
    }


    public Payment addPayment(
            RequestPayment request) {

        Payment p = new Payment();

        p.setStudentId(
                request.getStudentId());

        p.setAmount(
                request.getAmount());

        p.setRemarks(
                request.getRemarks());

        p.setPaymentDate(
                new Date().toString());

        return repo.save(p);
    }

    public List<Payment> getAllPayments() {
        return repo.findAll();
    }

    public Payment updatePayment(Integer id, RequestPayment rp)
    {
        Payment p = repo.findById(id).orElseThrow(() -> new RuntimeException("Payment not Found"));
        p.setAmount(rp.getAmount());
        p.setRemarks(rp.getRemarks());

        return repo.save(p);
    }

    public List<Payment> getPaymentsByStudent(
            String studentId) {

        return repo.findByStudentId(
                studentId);
    }

    public void removePayment(
            Integer paymentId) {

        if (repo.existsById(paymentId))
            repo.deleteById(paymentId);
        else
            throw new RuntimeException(
                    "Payment not found");
    }
}