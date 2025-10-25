package com.learn.portofolio_cv.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.learn.portofolio_cv.model.Project;

@Service
public class ProjectService {
	public List<Project> getTopProjects() {
        return List.of(
            new Project("OCBC HR",
                    "Add feature for access control, enhance the workflow product submission feature, and fix batch system, by using spring boot and spring state machine, and PostgreSQL Database.",
                    null),

            new Project("Multicoverage Management System",
                    "Doing full stack web development and code review, and also deliver CR Android mobile salesmanship app, to manage incoming and outgoing cigarette and merchandise stocks.",
                    null),

            new Project("Supervisory Retail",
                    "Developed a full-stack application using Java Spring Boot and ZKoss, implementing PL/SQL-based data synchronization to support supervisors in monitoring and evaluating sales performance.",
                    null),

            new Project("PPCL (Application for Credit Limit Change)",
                    "Developed an end-to-end credit management and web cashier system using Java Spring Boot with PL/SQL-based data synchronization, integrated with Angular and ZKoss UI, and provided backend services for the Salesmanship mobile app.",
                    null),

            new Project("E-Budgeting",
                    "Developed E-Budgeting Web Application. Working on workflow approval system and also CAPEX & OPEX worksheet.",
                    null)
        );
    }
}
