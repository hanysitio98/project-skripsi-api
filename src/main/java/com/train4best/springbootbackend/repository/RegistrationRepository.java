package com.train4best.springbootbackend.repository;

import com.train4best.springbootbackend.entity.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepository extends JpaRepository<Registration, String> {

    Registration findByInvNo(String invNo);
}
