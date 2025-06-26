package com.jobsnap.jobsnap_backend.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "jobapplications")  // MongoDB collection name
public class JobApplication {

    @Id
    private String id;
    private String email;
    private String company;
    private String platform;
    private String role;
    private String resumeFileName;

    // Default constructor (required by MongoDB)
    public JobApplication() {}

    // Constructor with parameters to initialize the JobApplication object
    public JobApplication(String email, String company, String platform, String role, String resumeFileName) {
        this.email = email;
        this.company = company;
        this.platform = platform;
        this.role = role;
        this.resumeFileName = resumeFileName;
    }

    // Getters and Setters
    public String getId() { return id; }
    public String getEmail() { return email; }
    public String getCompany() { return company; }
    public String getPlatform() { return platform; }
    public String getRole() { return role; }
    public String getResumeFileName() { return resumeFileName; }

    public void setId(String id) { this.id = id; }
    public void setEmail(String email) { this.email = email; }
    public void setCompany(String company) { this.company = company; }
    public void setPlatform(String platform) { this.platform = platform; }
    public void setRole(String role) { this.role = role; }
    public void setResumeFileName(String resumeFileName) { this.resumeFileName = resumeFileName; }
}
