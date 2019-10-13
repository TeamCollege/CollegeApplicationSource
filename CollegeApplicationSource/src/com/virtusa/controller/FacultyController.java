package com.virtusa.controller;
 
import java.util.List;

import com.virtusa.entities.ClassSchedule;
import com.virtusa.helper.FactoryApplicantService;
import com.virtusa.helper.FactoryFacultyService;
import com.virtusa.model.ClassScheduleModel;
import com.virtusa.model.FacultyModel;
import com.virtusa.service.FacultyService;
import com.virtusa.view.FacultyView;

public class FacultyController {
	
	private FacultyService facultyService;
	
	public FacultyController() { 
		this.facultyService = FactoryFacultyService.createApplicantService();

	}

	public void viewClassSchedule(FacultyModel facultyModel) {
		List<ClassScheduleModel> model = facultyService.retreiveClassSchedule(facultyModel.getDepartmentName());
		FacultyView facultyView = new FacultyView();
		facultyView.displayClassSchedule(model);
	}
	
}
