package com.train4best.springbootbackend.repository;

import com.train4best.springbootbackend.entity.Training;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainingRepository extends JpaRepository<Training, String> {

}
