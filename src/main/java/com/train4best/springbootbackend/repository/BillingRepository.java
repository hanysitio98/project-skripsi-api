package com.train4best.springbootbackend.repository;

import com.train4best.springbootbackend.entity.Billing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillingRepository extends JpaRepository<Billing, String> {
}


