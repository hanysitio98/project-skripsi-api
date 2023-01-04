package com.train4best.springbootbackend.controller;

import com.train4best.springbootbackend.entity.Training;
import com.train4best.springbootbackend.service.TrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@PreAuthorize("isAuthenticated()")
public class TrainingController {

    @Autowired
    private TrainingService trainingService;

    @GetMapping("/trainings")
    public List<Training> findAll() {
        return trainingService.findAll();
    }

    @GetMapping("/trainings/{id}")
    public Training findById(@PathVariable("id") String id) {
        return trainingService.findById(id);
    }

    @PostMapping("/trainings")
    public Training create(@RequestBody Training training) {
        return trainingService.create(training);
    }

    @PutMapping("/trainings/{id}")
    public Training edit(@PathVariable("id") String id, @RequestBody Training training) {
        return trainingService.edit(training);
    }

    @DeleteMapping("/trainings/{id}")
    public void deleteById(@PathVariable("id") String id) {
        trainingService.deleteById(id);
    }
}
