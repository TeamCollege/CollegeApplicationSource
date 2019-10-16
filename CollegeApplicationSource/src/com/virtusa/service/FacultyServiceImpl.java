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
					classScheduleModel.setFirstHour(classSchedule.getFirstHour());
					classScheduleModel.setSecondHour(classSchedule.getSecondHour());
					classScheduleModel.setThirdHour(classSchedule.getThirdHour());
					classScheduleModel.setFourthHour(classSchedule.getFourthHour());
					classScheduleModelList.add(classScheduleModel);
				}
				
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
	
		return classScheduleModelList;
	}

}
