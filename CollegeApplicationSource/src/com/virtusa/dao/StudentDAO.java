package com.virtusa.dao;

import java.sql.SQLException;

import com.virtusa.entities.Student;

public interface StudentDAO {

	public Student getClassSchedule(String departmentName)throws ClassNotFoundException, SQLException;

}
