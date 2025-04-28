package com.jobsnap.jobsnap_backend.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.jobsnap.jobsnap_backend.models.Userjobdetails;

@Repository
public interface UserjobdetailsRepository extends MongoRepository<Userjobdetails, String> {
    List<Userjobdetails> findByCompany(String company);
    List<Userjobdetails> findByPlatform(String platform);
}
