package com.train4best.springbootbackend.repository;

import com.train4best.springbootbackend.entity.OrderLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderLogRepository extends JpaRepository<OrderLog, String> {

}
