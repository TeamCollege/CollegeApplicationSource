package com.virtusa.controller;

import com.virtusa.entities.UploadDownloadAssignments;
import com.virtusa.helper.FactoryStudentDAO;
import com.virtusa.model.StudentModel;
import com.virtusa.model.UploadDownloadAssignmentsModel;
import com.virtusa.service.StudentService;
import com.virtusa.view.StudentView;

public class StudentController {
	private StudentService studentService;
	StudentView studentView=new StudentView();
	
	
	public StudentController() {
		this.studentService=FactoryStudentDAO.createStudentService();
	}     
// 12.10.19
	public void retrieveClassSchedule(String departmentName) {

		StudentModel students=studentService.handleRetrieveClassSchedule(departmentName);
		studentView.showClassSchedule(students);
	}

	public void retrieveExaminationSchedule() {

		
	}

	public void retrieveResults() {

		
	}

	

	public void retrievePlacementCalender() {

	}

	public void retrieveGeneralExams() {

		
	}
	/*public void uploadAssignments(String path) {
		// TODO Auto-generated method stub
		String result = studentService.handleUploadAssignments(path);
		System.out.println("upload controller");
		if(result.contentEquals("success"))
			studentView.uploadSuccess();
		else
			studentView.uploadUnsuccessful();
	}*/
	public void downloadAssignments() {
		// TODO Auto-generated method stub
		
	}
	public void uploadAssignments(UploadDownloadAssignmentsModel uploadDownloadAssignmentsModel) {
		// TODO Auto-generated method stub
		String result = studentService.handleUploadAssignments(uploadDownloadAssignmentsModel);
		System.out.println("upload controller");
		if(result.contentEquals("success"))
			studentView.uploadSuccess();
		else
			studentView.uploadUnsuccessful();
	}
	
	

}
