package com.virtusa.controller;
 
import java.util.List;

import com.virtusa.entities.ClassSchedule;
import com.virtusa.helper.FactoryApplicantService;
import com.virtusa.helper.FactoryFacultyService;
import com.virtusa.model.ClassScheduleModel;
import com.virtusa.model.FacultyModel;
import com.virtusa.model.StudentModel;
import com.virtusa.model.UploadDownloadAssignmentsModel;
import com.virtusa.service.FacultyService;
import com.virtusa.view.FacultyView;

public class FacultyController {
	
	private FacultyService facultyService;
	FacultyView facultyView = new FacultyView();
	
	public FacultyController() { 
		this.facultyService = FactoryFacultyService.createApplicantService();

	}       

	public void viewClassSchedule(String departmentName) {
		List<ClassScheduleModel> model = facultyService.retreiveClassSchedule(departmentName);
		facultyView.displayClassSchedule(model);
	}

	public void handleStaffMeeting(String departmentName1) {

		FacultyModel staffMeeting=facultyService.handleRetrieveStaffMeeting(departmentName1);
		facultyView.showStaffMeetingDetails(staffMeeting);
		 
	}

	public void handleUploadAssignments(UploadDownloadAssignmentsModel uploadDownloadAssignmentsModel) {

		String result = facultyService.uploadAssignments(uploadDownloadAssignmentsModel);
		if(result.contentEquals("success"))
			facultyView.uploadSuccess();
		else
			facultyView.uploadUnsuccessful();
		
	}

	public void handleDownloadAssignments(int fileId) {
		
	}
	
	public void retrieveExaminationSchedule(String departmentName) {
		FacultyModel faculty=facultyService.handleRetrieveExamintionSchedule(departmentName);
		facultyView.showExamSchedule(faculty);
		
	}
	
}
