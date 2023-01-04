package com.train4best.springbootbackend.repository;

import com.train4best.springbootbackend.entity.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainerRepository extends JpaRepository<Trainer, String> {

}
