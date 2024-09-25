
# K8S Migration Project - Phase 2

## Project Objective

The primary goal of this project is to implement Kubernetes (K8S) migration for a microservice-based ERP system, preparing for Megazone Cloud certification. This involves deploying **config-server**, **eureka-server**, **gateway-server**, and **item-service** on Docker and Kubernetes environments, with a focus on scaling and managing large-scale services using **EKS** and **ECS**.

> "The second phase of this project is critical for mastering K8S operations, system architecture understanding, and migration workflows, which are essential for large cloud-based systems."

## Goals Breakdown

- **Java Development**
- **Cloud Operations**
- **Service Optimization and Improvement**

The migration focuses on handling microservices like the factorial app, cache handling, and MySQL integration within a Kubernetes environment.

## Tasks from Previous Day

- **Config-server**, **eureka-server**, **gateway-server**, **item-service** were successfully migrated to K8S with Docker-based microservices.
- Migration was successfully tested with **H2/MySQL** integration.

## Today's Task

1. Migrate and run **config-server**, **eureka-server**, **gateway-server**, and **item-service** on separate servers.
2. Establish communication between services using **Postman**.
3. Design and document the **system architecture** showing communication flow between pods.
4. Complete the migration setup with **H2/MySQL** for the factorial app and cache management.
  
   > "Today's task focuses on separating services into distinct servers under Kubernetes while ensuring smooth communication and architectural documentation."

## Side Projects

- Migration to **EKS** with **Postman** for testing.
- Migration to **ECS** with **Postman** for testing.
- Event-driven microservices architecture using **Kafka** for messaging.

## Submission Guidelines

Once the second migration phase is completed, please send an email with the following:

- **To:** -
- **Subject:** [Megazone Cloud] K8S Migration Assignment 2 - Your Name
- **Attach:** A single zip file containing all related files, named `K8S이행과제 2 - Your Name.zip`.

> "Ensure to submit the assignment by compressing all files and folders into a zip file. Organize your folder structure as follows to maintain clarity and project organization."

### Folder Structure

```
K8S_Migration
├── src              # Java project files
├── cli_src          # Kubernetes imperative and declarative commands
├── test_result      # REST API test results captured as reports
└── report           # Documentation on architecture and migration process
```

### Detailed Folder Descriptions

1. **src Folder**: Contains Java-related project files for each service.
2. **cli_src Folder**: Includes K8S scripts and deployment files (both declarative and imperative).
3. **test_result Folder**: Test results from Postman, capturing communication between services such as:
   - **item-service**
   - **factorial-cache-app**
4. **report Folder**: Includes documentation such as:
   - System architecture design and its justification.
   - Personal reflections on the task (learning points, challenges, etc.).

## Completion Checklist

1. Implemented **eureka-server** and **gateway-server**.
2. Completed **factorial/factorial-cache-app** integration.
3. Tested communication using **Postman** for:
   - **item-service** (Item Management)
   - **factorial-cache-app**.
4. Designed system architecture diagram.
5. Provided a detailed explanation of the system architecture.

> "Remember to include a well-explained architecture diagram and your reflections on the migration process to demonstrate a thorough understanding of the tasks and challenges."
 
