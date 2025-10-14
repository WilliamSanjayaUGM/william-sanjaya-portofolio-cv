package com.learn.portofolio_cv.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.learn.portofolio_cv.model.Job;

@Service
public class JobService {
	public List<Job> getAllJobs() {
        return List.of(
            new Job("Aug 2025 – Present", "RDC Software Engineer", "OCBC Indonesia",
                    "Deliver global backend microservices with regional teams (China, Singapore, Malaysia, etc.). "
                    + "Enhance code quality and test coverage via SonarQube, Qodoo, and Copilot. "
                    + "Implement SOLID, OWASP-compliant code, asynchronous processing with backpressure, and centralized log tracing through ELK Stack."),
            
            new Job("Aug 2024 – Jul 2025", "Senior Application Developer", "PT. Surya Madistrindo",
                    "Participate in system analysis, technical design, and estimation for internal enterprise projects. "
                    + "Developed shared modules and automated CI/CD deployments using OpenShift & ArgoCD. "
                    + "Mentored developers and coordinated UAT across cross-functional teams."),
            
            new Job("Apr 2021 – Aug 2024", "Application Developer", "PT. Surya Madistrindo",
                    "Built internal enterprise apps with Spring Boot & JavaScript, and optimized performance through PL/SQL tuning. "
                    + "Modernized legacy Weblogic, Java J2EE systems to Spring Boot & Angular or ZKoss framework on OpenShift, ensuring stable production delivery and post-launch support."),
            
            new Job("Feb 2020 – Nov 2020", "Mobile Developer", "PT. Yoshugi Putra Mandiri",
                    "Developed chatbot and e-commerce Android prototypes using React Native (JS).")
        );
    }
}
