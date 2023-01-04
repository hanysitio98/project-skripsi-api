package com.train4best.springbootbackend.service;

import com.train4best.springbootbackend.entity.Project;
import com.train4best.springbootbackend.exception.ResourceNotFoundException;
import com.train4best.springbootbackend.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public Project findById(String id) {
        return projectRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Project dengan id" + id + " tidak ditemukan"));
    }

    public List<Project> findAll() {
        return projectRepository.findAll();
    }

    public Project create(Project project) {
        project.setId(UUID.randomUUID().toString());
        return  projectRepository.save(project);
    }

    public Project edit(Project project) {
        return projectRepository.save(project);
    }

    public void deleteById(String id) {
        projectRepository.deleteById(id);
    }
}
