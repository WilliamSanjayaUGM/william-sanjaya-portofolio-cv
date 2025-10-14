package com.learn.portofolio_cv.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.learn.portofolio_cv.model.Education;

@Service
public class EducationService {
	public List<Education> getAllEducation() {
        return List.of(
            new Education(
                "Electronics & Instrumentation",
                "University of Gadjah Mada",
                "Graduated with honors (GPA 3.03/4.00)"
            )
        );
    }
}
