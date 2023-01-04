package com.train4best.springbootbackend.repository;

import com.train4best.springbootbackend.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, String> {

}
