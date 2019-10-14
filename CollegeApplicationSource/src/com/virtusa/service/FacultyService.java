package com.virtusa.service;

import java.util.List;

import com.virtusa.entities.ClassSchedule;
import com.virtusa.model.ClassScheduleModel;

public interface FacultyService {

	public List<ClassScheduleModel> retreiveClassSchedule(String departmentName);
 
}
