package com.train4best.springbootbackend.controller;

import com.train4best.springbootbackend.entity.Employee;
import com.train4best.springbootbackend.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
@PreAuthorize("isAuthenticated()")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employee")
    public List<Employee> findAll() {
        return employeeService.findAll();
    }

    @GetMapping("/employee/{id}")
    public Employee findById( @PathVariable("id") String id) {
        return employeeService.findById(id);
    }

    @PostMapping("/employee")
    public Employee create(@RequestBody Employee employee) {
        return employeeService.create(employee);
    }

    @PutMapping("/employee/{id}")
    public Employee edit(@PathVariable("id") String id, @RequestBody Employee employee) {

        return employeeService.edit(employee);
    }

    @DeleteMapping("/employee/{id}")
    public void deleteById(@PathVariable("id") String id) {
        employeeService.deleteById(id);
    }
}

