package com.jobsnap.jobsnap_backend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.jobsnap.jobsnap_backend.models.User;

public interface UserRepository extends MongoRepository<User, String> {
    User findByEmail(String email);
}
