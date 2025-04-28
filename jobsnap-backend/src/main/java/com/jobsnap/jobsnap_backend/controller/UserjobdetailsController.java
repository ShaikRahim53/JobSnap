package com.jobsnap.jobsnap_backend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jobsnap.jobsnap_backend.models.Userjobdetails;
import com.jobsnap.jobsnap_backend.repository.UserjobdetailsRepository;

@RestController
@RequestMapping("/api/userjobdetails")
public class UserjobdetailsController {

    @Autowired
    private UserjobdetailsRepository userjobdetailsRepository;

    @PostMapping
    public Userjobdetails addResume(@RequestBody Userjobdetails details) {
        return userjobdetailsRepository.save(details);
    }

    @GetMapping
    public List<Userjobdetails> getAllResumes() {
        return userjobdetailsRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Userjobdetails> getResumeById(@PathVariable String id) {
        return userjobdetailsRepository.findById(id);
    }

    @GetMapping("/company/{company}")
    public List<Userjobdetails> getResumesByCompany(@PathVariable String company) {
        return userjobdetailsRepository.findByCompany(company);
    }

    @DeleteMapping("/{id}")
    public void deleteResume(@PathVariable String id) {
        userjobdetailsRepository.deleteById(id);
    }
}