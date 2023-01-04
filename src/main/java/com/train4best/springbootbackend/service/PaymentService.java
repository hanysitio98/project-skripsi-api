package com.train4best.springbootbackend.service;

import com.train4best.springbootbackend.entity.Payment;
import com.train4best.springbootbackend.exception.ResourceNotFoundException;
import com.train4best.springbootbackend.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    public Payment findById(String id) {
        return paymentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Payment dengan id" + id + " tidak ditemukan"));
    }

    public List<Payment> findAll() {
        return paymentRepository.findAll();
    }

    public Payment create(Payment payment) {
        payment.setId(UUID.randomUUID().toString());
        return  paymentRepository.save(payment);
    }

    public Payment edit(Payment payment) {
        return paymentRepository.save(payment);
    }

    public void deleteById(String id) {
        paymentRepository.deleteById(id);
    }
}
