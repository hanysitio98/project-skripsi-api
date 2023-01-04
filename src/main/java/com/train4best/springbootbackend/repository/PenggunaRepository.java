package com.train4best.springbootbackend.repository;

import com.train4best.springbootbackend.entity.Pengguna;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PenggunaRepository extends JpaRepository<Pengguna, String> {

    Boolean existsByEmail(String email);

}
