package com.train4best.springbootbackend.repository;

import com.train4best.springbootbackend.entity.Freelancer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FreelancerRepository extends JpaRepository<Freelancer, String> {

}
