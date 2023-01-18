package com.train4best.springbootbackend.service;

import com.train4best.springbootbackend.entity.Billing;
import com.train4best.springbootbackend.exception.ResourceNotFoundException;
import com.train4best.springbootbackend.repository.BillingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class BillingService {

    @Autowired
    private BillingRepository billingRepository;

    public Billing findById(String id) {
        return billingRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Billing dengan id" + id + " tidak ditemukan"));
    }

    public List<Billing> findAll() {
        return billingRepository.findAll();
    }

    public Billing create(Billing billing) {
        billing.setId(UUID.randomUUID().toString());
        return  billingRepository.save(billing);
    }

    public Billing edit(Billing billing) {
        return billingRepository.save(billing);
    }

    public void deleteById(String id) {
        billingRepository.deleteById(id);
    }

}
