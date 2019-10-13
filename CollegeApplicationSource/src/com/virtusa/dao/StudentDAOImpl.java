package com.virtusa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.virtusa.entities.ClassSchedule;
import com.virtusa.entities.Student;
import com.virtusa.integrate.ConnectionManager;


public class StudentDAOImpl implements StudentDAO {
	//12.10.19  
	
	  public Student getClassSchedule(String departmentName)throws
	  ClassNotFoundException, SQLException{ Connection
	  connection=ConnectionManager.openConnection(); 
	  PreparedStatement statement=connection.prepareStatement("select * from cse_schedule");
	 // statement.setString(1,departmentName); 
	  ResultSet resultSet=statement.executeQuery();
	  Student students=new Student();
	  while(resultSet.next()) {
	  
	  students.setDepartmentName(resultSet.getString("department_name"));
	  ClassSchedule classSchedule=new ClassSchedule();
	  classSchedule.setDay(resultSet.getString("day"));
	  classSchedule.setFirst_hour(resultSet.getString("first_hour"));
	  classSchedule.setSecond_hour(resultSet.getString("second_hour"));
	  classSchedule.setThird_hour(resultSet.getString("third_hour"));
	  classSchedule.setFourth_hour(resultSet.getString("fourth_hour"));
	  
	  students.setClassSchedule(classSchedule);
	  
	  } ConnectionManager.closeConnection(); return students;
	  
 }
	 

	/*public Student getClassSchedule(String departmentName)throws ClassNotFoundException, SQLException{ 
		Connection connection=ConnectionManager.openConnection();
		Statement statement=connection.createStatement();
		ResultSet resultSet=
				statement.executeQuery("select * from ClassSchedule");
		
		while(resultSet.next()) {
			Departments departments=new Departments();
			departments.setDepartmentId(resultSet.getInt("department_id"));
			departments.setDepartmentName(resultSet.getString("department_name"));
			departmentList.add(departments);
		}
		ConnectionManager.closeConnection();
		return departmentList;
	}*/
	
	
}
