package com.train4best.springbootbackend.repository;

import com.train4best.springbootbackend.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, String> {

}
