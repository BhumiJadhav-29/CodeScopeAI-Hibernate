# CodeScope AI – Hibernate

CodeScope AI is an intelligent Java project analyzer designed to analyze
Java projects, extract structural information, detect code issues,
calculate code metrics, and generate reports.

This repository contains the Hibernate-based persistence layer of CodeScope AI.

## 🚀 Current Progress

- [x] MySQL database design
- [x] Hibernate configuration
- [x] Hibernate SessionFactory
- [x] Project Entity
- [x] Project CRUD
- [x] Read All Projects
- [ ] Analysis Entity CRUD
- [ ] Java File Analysis
- [ ] Method Analysis
- [ ] Field Analysis
- [ ] Import Analysis
- [ ] Dependency Detection
- [ ] Code Smell Detection
- [ ] Code Quality Score
- [ ] Report Generation
- [ ] AI Code Explanation
- [ ] AI Refactoring Suggestions

## 🛠️ Tech Stack

- Java 21
- Hibernate ORM 7.1
- MySQL 8
- Maven
- Eclipse IDE

## 🗄️ Database

Database:

`codescope_ai`

Main tables:

- projects
- analyses
- java_files
- java_method
- java_field
- import_statement
- dependencies
- code_issue
- reports
- project_settings

## 📂 Architecture

Main
↓
DAO Layer
↓
Hibernate
↓
Entity Layer
↓
MySQL

## 🔧 Current Features

### Project Management

The Hibernate layer currently supports:

- Create Project
- Read Project
- Read All Projects
- Update Project
- Delete Project

## ▶️ Running the Project

1. Clone the repository.
2. Create a MySQL database named `codescope_ai`.
3. Execute the database schema.
4. Configure the MySQL credentials in Hibernate configuration.
5. Run the Maven project.
6. Start `Main.java`.

## 📌 Project Status

Currently under active development.

The final goal is to build an intelligent Java project analyzer capable
of scanning real Java projects and providing structural analysis,
quality metrics, code issue detection, reports, and AI-powered insights.
