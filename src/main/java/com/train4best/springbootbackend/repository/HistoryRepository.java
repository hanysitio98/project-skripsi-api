package com.train4best.springbootbackend.repository;

import com.train4best.springbootbackend.entity.History;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HistoryRepository extends JpaRepository<History, String> {

}
