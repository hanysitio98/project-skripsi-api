package com.train4best.springbootbackend.service;

import com.train4best.springbootbackend.entity.Registration;
import com.train4best.springbootbackend.exception.ResourceNotFoundException;
import com.train4best.springbootbackend.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RegistrationService {

    @Autowired
    private RegistrationRepository registrationRepository;

    public Registration findById(String id) {
        return registrationRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Registration dengan id" + id + " tidak ditemukan"));
    }

    public List<Registration> findAll() {
        return registrationRepository.findAll();
    }

    public Registration create(Registration registration) {
        registration.setId(UUID.randomUUID().toString());
        return  registrationRepository.save(registration);
    }

    public Registration edit(Registration registration) {
        return registrationRepository.save(registration);
    }

    public void deleteById(String id) {
        registrationRepository.deleteById(id);
    }
}
