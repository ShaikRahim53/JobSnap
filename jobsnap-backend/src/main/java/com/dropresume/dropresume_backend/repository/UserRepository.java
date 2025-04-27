package com.dropresume.dropresume_backend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dropresume.dropresume_backend.models.User;

public interface UserRepository extends MongoRepository<User, String> {
    User findByEmail(String email);
}
