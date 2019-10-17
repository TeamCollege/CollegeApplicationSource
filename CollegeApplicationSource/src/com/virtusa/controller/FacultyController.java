package com.virtusa.controller;
 
import java.util.List;

import com.virtusa.entities.ClassSchedule;
import com.virtusa.helper.FactoryApplicantService;
import com.virtusa.helper.FactoryFacultyService;
import com.virtusa.model.ClassScheduleModel;
import com.virtusa.model.FacultyModel;
import com.virtusa.model.StudentModel;
import com.virtusa.service.FacultyService;
import com.virtusa.view.FacultyView;

public class FacultyController {
	FacultyView facultyView = new FacultyView();
	private FacultyService facultyService;
	
	public FacultyController() { 
		this.facultyService = FactoryFacultyService.createApplicantService();

	}

	public void viewClassSchedule(String departmentName) {
		List<ClassScheduleModel> model = facultyService.retreiveClassSchedule(departmentName);
		facultyView.displayClassSchedule(model);
	}

	public void handleStaffMeeting(String facultyId) {

		FacultyModel staffMeeting=facultyService.handleRetrieveStaffMeeting(facultyId);
		facultyView.showStaffMeetingDetails(staffMeeting);
		
	}

	public void handleUploadAssignments(String fileName, String path) {

		String result = facultyService.uploadAssignments(fileName, path);
		if(result.contentEquals("success"))
			facultyView.uploadSuccess();
		else
			facultyView.uploadUnsuccessful();
		
	}

	public void handleDownloadAssignments() {
		// TODO Auto-generated method stub
		
	}
	
}
