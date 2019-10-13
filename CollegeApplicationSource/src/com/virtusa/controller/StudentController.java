package com.virtusa.controller;

import java.util.List;

import com.virtusa.helper.FactoryStudentDAO;
import com.virtusa.model.ClassScheduleModel;
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
		// TODO Auto-generated method stub
		StudentModel students=studentService.handleRetrieveClassSchedule(departmentName);
		studentView.showClassSchedule(students);
	}

	public void retrieveExaminationSchedule() {
		// TODO Auto-generated method stub
		
	}

	public void retrieveResults() {
		// TODO Auto-generated method stub
		
	}

	public void retrieveAssignments() {
		// TODO Auto-generated method stub
		
	}

	public void retrievePlacementCalender() {
		// TODO Auto-generated method stub
		
	}

	public void retrieveGeneralExams() {
		// TODO Auto-generated method stub
		
	}
	

}
