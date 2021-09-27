package com.example.springboot_jwt_nguyenvanhung.service;

import com.example.springboot_jwt_nguyenvanhung.authen.UserPrincipal;
import com.example.springboot_jwt_nguyenvanhung.entity.User;

public interface UserService {
    User createUser(User user);
    UserPrincipal findByUsername(String username);
}