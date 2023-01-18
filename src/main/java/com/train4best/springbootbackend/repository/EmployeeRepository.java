package com.train4best.springbootbackend.repository;

import com.train4best.springbootbackend.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, String> {

}

