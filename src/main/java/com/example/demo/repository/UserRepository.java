package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.AuthUser;

@Repository
public interface UserRepository extends MongoRepository<AuthUser,String>{
    
}
