package com.virtusa.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.virtusa.dao.FacultyDAO;
import com.virtusa.entities.ClassSchedule;
import com.virtusa.helper.FactoryFacultyDAO;
import com.virtusa.model.ClassScheduleModel;

public class FacultyServiceImpl implements FacultyService {
	
	private FacultyDAO facultyDAO=null;
	public FacultyServiceImpl() {
		this.facultyDAO=FactoryFacultyDAO.createFacultyDAO();
	}

	@Override
	public List<ClassScheduleModel> retreiveClassSchedule(String departmentName) {
		List<ClassScheduleModel> classScheduleModelList = new ArrayList<>();
			try {
				List<ClassSchedule> classScheduleList = facultyDAO.viewCLassSchedule(departmentName);
				for(ClassSchedule classSchedule:classScheduleList) {
					ClassScheduleModel classScheduleModel = new ClassScheduleModel();
					classScheduleModel.setDay(classSchedule.getDay());
					classScheduleModel.setFirst_hour(classSchedule.getFirst_hour());
					classScheduleModel.setSecond_hour(classSchedule.getSecond_hour());
					classScheduleModel.setThird_hour(classSchedule.getThird_hour());
					classScheduleModel.setFourth_hour(classSchedule.getFourth_hour());
					classScheduleModelList.add(classScheduleModel);
				}
				
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
	
		return classScheduleModelList;
	}

}
