package com.virtusa.controller;

import java.util.List;

import com.virtusa.service.FacultyService;

public class FacultyController {
	
	private FacultyService facultyService;
	
	public FacultyController() {
		
	}

	public void viewClassSchedule() {
		List<ClassSchedule> model = facultyService.retreiveClassSchedule();
	}
	
}
