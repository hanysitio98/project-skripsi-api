package com.train4best.springbootbackend.controller;

import com.train4best.springbootbackend.entity.Project;
import com.train4best.springbootbackend.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
@PreAuthorize("isAuthenticated()")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @GetMapping("/projects")
    public List<Project> findAll() {
        return projectService.findAll();
    }

    @GetMapping("/projects/{id}")
    public Project findById( @PathVariable("id") String id) {
        return projectService.findById(id);
    }

    @PostMapping("/projects")
    public Project create(@RequestBody Project project) {
        return projectService.create(project);
    }

    @PutMapping("/projects/{id}")
    public Project edit(@PathVariable("id") String id, @RequestBody Project project) {

        return projectService.edit(project);
    }

    @DeleteMapping("/projects/{id}")
    public void deleteById(@PathVariable("id") String id) {
        projectService.deleteById(id);
    }
}
