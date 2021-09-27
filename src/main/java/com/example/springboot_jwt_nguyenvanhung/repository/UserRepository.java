package com.example.springboot_jwt_nguyenvanhung.repository;

import com.example.springboot_jwt_nguyenvanhung.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
