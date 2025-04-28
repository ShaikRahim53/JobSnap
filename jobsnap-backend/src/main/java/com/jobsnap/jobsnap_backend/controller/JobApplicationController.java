package com.jobsnap.jobsnap_backend.controller;

import com.jobsnap.jobsnap_backend.models.JobApplication;
import com.jobsnap.jobsnap_backend.repository.JobApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
@RequestMapping("/api/jobapplications")
public class JobApplicationController {

    @Autowired
    private JobApplicationRepository jobApplicationRepository;

    // API to handle job application submission
    @PostMapping("/submit")
    public ResponseEntity<String> submitJobApplication(
            @RequestParam("email") String email,
            @RequestParam("company") String company,
            @RequestParam("platform") String platform,
            @RequestParam("role") String role,
            @RequestParam("resume") MultipartFile resume) {

        try {
            // Store resume file locally (or upload to cloud storage in the future)
            String resumeFileName = saveResumeFile(resume);

            // Create JobApplication object
            JobApplication jobApplication = new JobApplication(email, company, platform, role, resumeFileName);

            // Save to DB
            jobApplicationRepository.save(jobApplication);

            return new ResponseEntity<>("Job application submitted successfully!", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("Error submitting job application: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // Helper method to save resume file locally (to be improved later for cloud storage)
    private String saveResumeFile(MultipartFile resume) throws IOException {
        String uploadDirectory = "uploaded_resumes/";

        // Check if directory exists, if not create it
        File directory = new File(uploadDirectory);
        if (!directory.exists()) {
            directory.mkdirs();
        }

        // Get original file name and store file
        String fileName = System.currentTimeMillis() + "-" + resume.getOriginalFilename();
        Path path = Paths.get(uploadDirectory + fileName);
        Files.write(path, resume.getBytes());

        return fileName;
    }

    // API to get all job applications by email (to fetch user's applications)
    @GetMapping("/user/{email}")
    public ResponseEntity<?> getUserJobApplications(@PathVariable String email) {
        try {
            return new ResponseEntity<>(jobApplicationRepository.findByEmail(email), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Error fetching job applications: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
