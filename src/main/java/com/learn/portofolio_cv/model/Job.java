package com.learn.portofolio_cv.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Job {
	private String period;
    private String title;
    private String company;
    private String description;
}
