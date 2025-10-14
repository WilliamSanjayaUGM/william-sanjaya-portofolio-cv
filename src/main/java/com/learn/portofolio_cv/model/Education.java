package com.learn.portofolio_cv.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Education {
	private String degree;
    private String institution;
    private String details;
}
