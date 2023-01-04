package com.train4best.springbootbackend.controller;

import com.train4best.springbootbackend.entity.Freelancer;
import com.train4best.springbootbackend.service.FreelancerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
@PreAuthorize("isAuthenticated()")
public class FreelancerController {

    @Autowired
    private FreelancerService freelancerService;

    @GetMapping("/freelancers")
    public List<Freelancer> findAll() {
        return freelancerService.findAll();
    }

    @GetMapping("/freelancers/{id}")
    public Freelancer findById( @PathVariable("id") String id) {
        return freelancerService.findById(id);
    }

    @PostMapping("/freelancers")
    public Freelancer create(@RequestBody Freelancer freelancer) {
        return freelancerService.create(freelancer);
    }

    @PutMapping("/freelancers/{id}")
    public Freelancer edit(@PathVariable("id") String id, @RequestBody Freelancer freelancer) {

        return freelancerService.edit(freelancer);
    }

    @DeleteMapping("/freelancers/{id}")
    public void deleteById(@PathVariable("id") String id) {
        freelancerService.deleteById(id);
    }
}
