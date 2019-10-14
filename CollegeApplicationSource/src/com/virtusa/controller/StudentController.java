package com.virtusa.controller;

import com.virtusa.helper.FactoryStudentDAO;
import com.virtusa.model.StudentModel;
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

	public void retrieveAssignments() {

		
	}

	public void retrievePlacementCalender() {

	}

	public void retrieveGeneralExams() {

		
	}
	

}
