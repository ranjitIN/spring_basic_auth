package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.demo.model.AuthUser;
import com.example.demo.repository.UserRepository;

@Service
public class AuthUserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    BCryptPasswordEncoder passwordEncoder;

    public String signUp(AuthUser user){
        userRepository.save(user);
        return "signup success full";
    }
}
