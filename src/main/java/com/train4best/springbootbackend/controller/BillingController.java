package com.train4best.springbootbackend.controller;

import com.train4best.springbootbackend.entity.Billing;
import com.train4best.springbootbackend.entity.Freelancer;
import com.train4best.springbootbackend.service.BillingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
@PreAuthorize("isAuthenticated()")
public class BillingController {

    @Autowired
    private BillingService billingService;

    @GetMapping("/billing")
    public List<Billing> findAll() {
        return billingService.findAll();
    }

    @GetMapping("/billing/{id}")
    public Billing findById( @PathVariable("id") String id) {
        return billingService.findById(id);
    }

    @PostMapping("/billing")
    public Billing create(@RequestBody Billing billing) {
        return billingService.create(billing);
    }

    @PutMapping("/billing/{id}")
    public Billing edit(@PathVariable("id") String id, @RequestBody Billing billing) {

        return billingService.edit(billing);
    }

    @DeleteMapping("/billing/{id}")
    public void deleteById(@PathVariable("id") String id) {
        billingService.deleteById(id);
    }
}
