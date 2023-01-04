package com.train4best.springbootbackend.service;

import com.train4best.springbootbackend.entity.Training;
import com.train4best.springbootbackend.exception.ResourceNotFoundException;
import com.train4best.springbootbackend.repository.TrainingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TrainingService {

    @Autowired
    private TrainingRepository trainingRepository;

    public Training findById(String id) {
        return trainingRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Training dengan id" + id + " tidak ditemukan"));
    }

    public List<Training> findAll() {
        return trainingRepository.findAll();
    }

    public Training create(Training training) {
        training.setId(UUID.randomUUID().toString());
        return  trainingRepository.save(training);
    }

    public Training edit(Training training) {
        return trainingRepository.save(training);
    }

    public void deleteById(String id) {
        trainingRepository.deleteById(id);
    }
}
