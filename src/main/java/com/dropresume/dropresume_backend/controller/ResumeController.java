package com.dropresume.dropresume_backend.controller;

import com.dropresume.dropresume_backend.models.Resume;
import com.dropresume.dropresume_backend.repository.ResumeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/resumes")
public class ResumeController {

    @Autowired
    private ResumeRepository resumeRepository;

    @PostMapping
    public Resume addResume(@RequestBody Resume resume) {
        return resumeRepository.save(resume);
    }

    @GetMapping
    public List<Resume> getAllResumes() {
        return resumeRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Resume> getResumeById(@PathVariable String id) {
        return resumeRepository.findById(id);
    }

    @GetMapping("/company/{company}")
    public List<Resume> getResumesByCompany(@PathVariable String company) {
        return resumeRepository.findByCompany(company);
    }

    @DeleteMapping("/{id}")
    public void deleteResume(@PathVariable String id) {
        resumeRepository.deleteById(id);
    }
}