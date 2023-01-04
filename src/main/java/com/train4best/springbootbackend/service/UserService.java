package com.train4best.springbootbackend.service;

import com.train4best.springbootbackend.entity.Employee;
import com.train4best.springbootbackend.exception.BadRequestException;
import com.train4best.springbootbackend.exception.ResourceNotFoundException;
import com.train4best.springbootbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Employee findById(String id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User dengan id" + id + " tidak ditemukan"));
    }

    public List<Employee> findAll() {
        return userRepository.findAll();
    }

    public Employee create(Employee employee) {

        if(userRepository.existsById(employee.getId())) {
            throw new BadRequestException("Username " + employee.getId() + " sudah terdaftar");
        }
        return  userRepository.save(employee);
    }

    public Employee edit(Employee employee) {
        return userRepository.save(employee);
    }

    public void deleteById(String id) {
        userRepository.deleteById(id);
    }
}
