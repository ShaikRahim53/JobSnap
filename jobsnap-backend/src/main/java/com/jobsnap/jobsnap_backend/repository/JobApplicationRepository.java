package com.jobsnap.jobsnap_backend.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.jobsnap.jobsnap_backend.models.JobApplication;

public interface JobApplicationRepository extends MongoRepository<JobApplication, String> {
    
    // Find all job applications by user's email
    List<JobApplication> findByEmail(String email);
}
