package com.example.springboot_jwt_nguyenvanhung.repository;

import com.example.springboot_jwt_nguyenvanhung.entity.Token;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TokenRepository extends JpaRepository<Token,Long> {
}
