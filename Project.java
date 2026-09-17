package com.codescope.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "projects")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "project_id")
    private int projectId;

    @Column(name = "project_name", nullable = false)
    private String projectName;

    @Column(name = "project_path", nullable = false)
    private String projectPath;

    @Column(name = "language")
    private String language;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "last_scanned")
    private LocalDateTime lastScanned;

    // No-argument constructor required by Hibernate
    public Project() {
    }

    // Constructor
    public Project(String projectName, String projectPath,
                   String language, LocalDateTime createdAt) {

        this.projectName = projectName;
        this.projectPath = projectPath;
        this.language = language;
        this.createdAt = createdAt;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectPath() {
        return projectPath;
    }

    public void setProjectPath(String projectPath) {
        this.projectPath = projectPath;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getLastScanned() {
        return lastScanned;
    }

    public void setLastScanned(LocalDateTime lastScanned) {
        this.lastScanned = lastScanned;
    }
}