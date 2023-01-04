package com.train4best.springbootbackend.controller;

import com.train4best.springbootbackend.entity.Trainer;
import com.train4best.springbootbackend.service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
@PreAuthorize("isAuthenticated()")
public class TrainerController {

    @Autowired
    private TrainerService trainerService;

    @GetMapping("/trainers")
    public List<Trainer> findAll() {
        return trainerService.findAll();
    }

    @GetMapping("/trainers/{id}")
    public Trainer findById( @PathVariable("id") String id) {
        return trainerService.findById(id);
    }

    @PostMapping("/trainers")
    public Trainer create(@RequestBody Trainer trainer) {
        return trainerService.create(trainer);
    }

    @PutMapping("/trainers/{id}")
    public Trainer edit(@PathVariable("id") String id, @RequestBody Trainer trainer) {

        return trainerService.edit(trainer);
    }

    @DeleteMapping("/trainers/{id}")
    public void deleteById(@PathVariable("id") String id) {
        trainerService.deleteById(id);
    }

}
