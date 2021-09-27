package com.example.springboot_jwt_nguyenvanhung.service;

import com.example.springboot_jwt_nguyenvanhung.entity.Token;

public interface TokenService {
    Token createToken(Token token);
}
