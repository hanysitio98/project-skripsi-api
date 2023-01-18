package com.train4best.springbootbackend.service;

import com.train4best.springbootbackend.entity.Employee;
import com.train4best.springbootbackend.exception.ResourceNotFoundException;
import com.train4best.springbootbackend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee findById(String id) {
        return employeeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee dengan id" + id + " tidak ditemukan"));
    }

    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    public Employee create(Employee employee) {
        employee.setId(UUID.randomUUID().toString());
        return  employeeRepository.save(employee);
    }

    public Employee edit(Employee employee) {
        return employeeRepository.save(employee);
    }

    public void deleteById(String id) {
        employeeRepository.deleteById(id);
    }



}
