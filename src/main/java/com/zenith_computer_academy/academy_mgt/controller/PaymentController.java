package com.zenith_computer_academy.academy_mgt.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.zenith_computer_academy.academy_mgt.dto.RequestPayment;
import com.zenith_computer_academy.academy_mgt.entity.Payment;
import com.zenith_computer_academy.academy_mgt.service.PaymentService;

@RestController
@RequestMapping("/api/payment")
@CrossOrigin("*")
public class PaymentController {

    private PaymentService service;

    public PaymentController(
            PaymentService paymentService) {

        this.service = paymentService;
    }

    @PostMapping
    public Payment addPayment(
            @RequestBody RequestPayment request) {

        return service.addPayment(request);
    }

    @GetMapping
    public List<Payment> getAllPayments() {

        return service.getAllPayments();
    }

    @GetMapping("/student/{studentId}")
    public List<Payment> getStudentPayments(
            @PathVariable String studentId) {

        return service.getPaymentsByStudent(
                studentId);
    }

    @DeleteMapping("/{paymentId}")
    public void deletePayment(
            @PathVariable Integer paymentId) {

        service.removePayment(paymentId);
    }

}