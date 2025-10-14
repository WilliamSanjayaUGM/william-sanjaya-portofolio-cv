package com.learn.portofolio_cv.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.learn.portofolio_cv.service.EducationService;
import com.learn.portofolio_cv.service.JobService;
import com.learn.portofolio_cv.service.ProjectService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class HomeController {
	
	private final ProjectService projectService;
	private final JobService jobService;
	private final EducationService educationService;
	
	@GetMapping("/")
	public String home(Model model) {
        return "index";
	}
	
	@GetMapping("/about")
	public String about(Model model) {
		model.addAttribute("projects", projectService.getTopProjects());
		model.addAttribute("educations", educationService.getAllEducation());
		model.addAttribute("jobs", jobService.getAllJobs());
        return "about";
	}
	
	@GetMapping("/download/project-pdf")
	public ResponseEntity<Resource> downloadProjectPdf() throws IOException {
	    Path path = Paths.get("src/main/resources/static/assets/Project_Based_William_Sanjaya.pdf");
	    if (!Files.exists(path)) {
	        return ResponseEntity.notFound().build();
	    }

	    Resource resource = new UrlResource(path.toUri());
	    return ResponseEntity.ok()
	            .contentType(MediaType.APPLICATION_PDF)
	            .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"William_Sanjaya_Projects.pdf\"")
	            .body(resource);
	}

}
