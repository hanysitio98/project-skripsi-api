package com.train4best.springbootbackend.service;

import com.train4best.springbootbackend.entity.Trainer;
import com.train4best.springbootbackend.exception.ResourceNotFoundException;
import com.train4best.springbootbackend.repository.TrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TrainerService {

    @Autowired
    private TrainerRepository trainerRepository;

    public Trainer findById(String id) {
        return trainerRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Trainer dengan id" + id + " tidak ditemukan"));
    }

    public List<Trainer> findAll() {
        return trainerRepository.findAll();
    }

    public Trainer create(Trainer trainer) {
        trainer.setId(UUID.randomUUID().toString());
        return  trainerRepository.save(trainer);
    }

    public Trainer edit(Trainer trainer) {
        return trainerRepository.save(trainer);
    }

    public void deleteById(String id) {
        trainerRepository.deleteById(id);
    }
}
