package com.train4best.springbootbackend.service;

import com.train4best.springbootbackend.entity.Freelancer;
import com.train4best.springbootbackend.exception.ResourceNotFoundException;
import com.train4best.springbootbackend.repository.FreelancerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class FreelancerService {

    @Autowired
    private FreelancerRepository freelancerRepository;

    public Freelancer findById(String id) {
        return freelancerRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Freelancer dengan id" + id + " tidak ditemukan"));
    }

    public List<Freelancer> findAll() {
        return freelancerRepository.findAll();
    }

    public Freelancer create(Freelancer freelancer) {
        freelancer.setId(UUID.randomUUID().toString());
        return  freelancerRepository.save(freelancer);
    }

    public Freelancer edit(Freelancer freelancer) {
        return freelancerRepository.save(freelancer);
    }

    public void deleteById(String id) {
        freelancerRepository.deleteById(id);
    }

    public Freelancer changeImage(String id, String freelancerImage) {
        Freelancer freelancer = findById(id);
        freelancer.setFreelancerImage(freelancerImage);
        return freelancerRepository.save(freelancer);
    }

    public Freelancer changeCv(String id, String cv) {
        Freelancer freelancer = findById(id);
        freelancer.setCv(cv);
        return freelancerRepository.save(freelancer);
    }


}
