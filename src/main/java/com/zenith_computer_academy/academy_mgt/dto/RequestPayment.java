package com.zenith_computer_academy.academy_mgt.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RequestPayment {

    private String studentId;

    private double amount;

    private String remarks;
}