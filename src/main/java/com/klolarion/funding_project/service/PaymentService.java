package com.klolarion.funding_project.service;

import com.klolarion.funding_project.domain.entity.Payment;

import java.util.List;

public interface PaymentService {

    List<Payment> getMyPayments();
}
