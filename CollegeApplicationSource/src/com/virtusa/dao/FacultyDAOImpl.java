package com.virtusa.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.virtusa.entities.ClassSchedule;
import com.virtusa.integrate.ConnectionManager;

public class FacultyDAOImpl implements FacultyDAO {
	
	public List<ClassSchedule> viewCLassSchedule(String departmentName) throws ClassNotFoundException, SQLException{
		
		Connection connection=ConnectionManager.openConnection();
		Statement statement=connection.createStatement();
		ResultSet resultSet = null;
		switch(departmentName) {
		case "cse":
			resultSet = statement.executeQuery("select * from cse_schedule");
			break;
		case "ece":
			resultSet = statement.executeQuery("select * from ece_schedule");
			break;
		case "eee":
			resultSet = statement.executeQuery("select * from eee_schedule");
			break;
		case "bba":
			resultSet = statement.executeQuery("select * from bba_schedule");
			break;
		case "bsc":
			resultSet = statement.executeQuery("select * from bsc_schedule");
			break;
		}
		
		List<ClassSchedule> classScheduleList = new ArrayList<ClassSchedule>();
		while(resultSet.next()) {
			ClassSchedule classSchedule = new ClassSchedule();
			classSchedule.setDay(resultSet.getString("day"));
			classSchedule.setFirst_hour(resultSet.getString("first_hour"));
			classSchedule.setSecond_hour(resultSet.getString("second_hour"));
			classSchedule.setThird_hour(resultSet.getString("third_hour"));
			classSchedule.setFourth_hour(resultSet.getString("fourth_hour"));
			classScheduleList.add(classSchedule);
		}
		ConnectionManager.closeConnection();
		return classScheduleList;
	}

}
