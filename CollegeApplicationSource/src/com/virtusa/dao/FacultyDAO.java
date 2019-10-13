package com.virtusa.dao;

import java.sql.SQLException;
import java.util.List;

import com.virtusa.entities.ClassSchedule;

public interface FacultyDAO {
	public List<ClassSchedule> viewCLassSchedule(String departmentName) throws ClassNotFoundException, SQLException;	

}
