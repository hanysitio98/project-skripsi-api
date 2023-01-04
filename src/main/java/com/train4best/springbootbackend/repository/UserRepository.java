package com.train4best.springbootbackend.repository;

import com.train4best.springbootbackend.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Employee, String> {

}
