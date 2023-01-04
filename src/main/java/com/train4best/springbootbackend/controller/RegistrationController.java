package com.train4best.springbootbackend.controller;

import com.train4best.springbootbackend.entity.Registration;
import com.train4best.springbootbackend.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class RegistrationController {

    @Autowired
    private RegistrationService registrationService;

    @GetMapping("/registrations")
    public List<Registration> findAll() {
        return registrationService.findAll();
    }

    @GetMapping("/registrations/{id}")
    public Registration findById( @PathVariable("id") String id) {
        return registrationService.findById(id);
    }

    @PostMapping("/registrations")
    public Registration create(@RequestBody Registration registration) {

            return registrationService.create(registration);

    }

    @PutMapping("/registrations/{id}")
    public Registration edit(@PathVariable("id") String id, @RequestBody Registration registration) {

        return registrationService.edit(registration);
    }

    @DeleteMapping("/registrations/{id}")
    public void deleteById(@PathVariable("id") String id) {
        registrationService.deleteById(id);
    }
}
