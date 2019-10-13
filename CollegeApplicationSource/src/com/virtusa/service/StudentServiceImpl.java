package com.virtusa.service;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.virtusa.dao.StudentDAO;
import com.virtusa.entities.ClassSchedule;
import com.virtusa.entities.Student;
import com.virtusa.helper.FactoryStudentDAO;
import com.virtusa.model.ClassScheduleModel;
import com.virtusa.model.StudentModel;
import com.virtusa.model.StudentModel;

public class StudentServiceImpl implements StudentService {
	private StudentDAO studentDAO;
	public StudentServiceImpl() {
		this.studentDAO=FactoryStudentDAO.createStudentDAO();
	}
//12.10.19
	public StudentModel handleRetrieveClassSchedule(String departmentName) {
		Student students=null;
		StudentModel studentModel=new StudentModel();
		try {
		students=studentDAO.getClassSchedule(departmentName);
		ClassSchedule classSchedule=students.getClassSchedule();
		ClassScheduleModel classScheduleModel=new ClassScheduleModel();
		classScheduleModel.setDay(classSchedule.getDay());
		classScheduleModel.setFirst_hour(classSchedule.getFirst_hour());
		classScheduleModel.setSecond_hour(classSchedule.getSecond_hour());
		classScheduleModel.setThird_hour(classSchedule.getThird_hour());
		classScheduleModel.setFourth_hour(classSchedule.getFourth_hour());
	
		studentModel.setClassScheduleModel(classScheduleModel);
	
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return studentModel;
	}
}
