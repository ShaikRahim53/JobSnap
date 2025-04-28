package com.jobsnap.jobsnap_backend.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "userjobdetails")  // This maps to the MongoDB collection "resumes"
public class Userjobdetails {
    
    @Id
    private String id;
    private String name;
    private String email;
    private String company;
    private String platform;
    private String role;
    private String resumeLink;

    public Userjobdetails() {}

    public Userjobdetails(String name, String email, String company, String platform, String role, String resumeLink) {
        this.name = name;
        this.email = email;
        this.company = company;
        this.platform = platform;
        this.role = role;
        this.resumeLink = resumeLink;
    }

    // Getters & Setters
    public String getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getCompany() { return company; }
    public String getPlatform() { return platform; }
    public String getRole() { return role; }
    public String getResumeLink() { return resumeLink; }

    public void setId(String id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }
    public void setCompany(String company) { this.company = company; }
    public void setPlatform(String platform) { this.platform = platform; }
    public void setRole(String role) { this.role = role; }
    public void setResumeLink(String resumeLink) { this.resumeLink = resumeLink; }
}
