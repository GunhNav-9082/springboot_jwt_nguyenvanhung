package com.example.springboot_jwt_nguyenvanhung.service;

import com.example.springboot_jwt_nguyenvanhung.entity.Token;
import com.example.springboot_jwt_nguyenvanhung.repository.TokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TokenServiceImpl implements TokenService{
    @Autowired
    private TokenRepository tokenRepository;

    public Token createToken(Token token) {
        return tokenRepository.saveAndFlush(token);
    }
}
