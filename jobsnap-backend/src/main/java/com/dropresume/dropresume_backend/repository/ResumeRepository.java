package com.dropresume.dropresume_backend.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.dropresume.dropresume_backend.models.Resume;

@Repository
public interface ResumeRepository extends MongoRepository<Resume, String> {
    List<Resume> findByCompany(String company);
    List<Resume> findByPlatform(String platform);
}
