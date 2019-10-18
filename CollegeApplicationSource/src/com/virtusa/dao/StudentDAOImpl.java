package com.virtusa.dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.virtusa.entities.ClassSchedule;
import com.virtusa.entities.Student;
import com.virtusa.entities.UploadDownloadAssignments;
import com.virtusa.integrate.ConnectionManager;


public class StudentDAOImpl implements StudentDAO {
	//12.10.19  
	
	  public Student getClassSchedule(String departmentName)throws
	  ClassNotFoundException, SQLException{ Connection
	  connection=ConnectionManager.openConnection(); 
	  PreparedStatement statement=connection.prepareStatement("select * from cse_schedule");
	  //statement.setString(1,departmentName); 
	  ResultSet resultSet=statement.executeQuery();
	  Student students=new Student();
	  while(resultSet.next()) {
	  
	  //students.setDepartmentName(resultSet.getString("department_name"));
	  ClassSchedule classSchedule=new ClassSchedule();
	  classSchedule.setDay(resultSet.getString("day"));
	  classSchedule.setFirstHour(resultSet.getString("first_hour"));
	  classSchedule.setSecondHour(resultSet.getString("second_hour"));
	  classSchedule.setThirdHour(resultSet.getString("third_hour"));
	  classSchedule.setFourthHour(resultSet.getString("fourth_hour"));
	  
	  students.setClassSchedule(classSchedule);
	  
	  } ConnectionManager.closeConnection(); return students;
	  
 }

	@Override
	public boolean uploadDownloadAssignments(String path)
			throws ClassNotFoundException, SQLException, FileNotFoundException {
		// TODO Auto-generated method stub
		UploadDownloadAssignments uploadDownloadAssignments=new UploadDownloadAssignments();
		File file=new File(path);
		Reader reader=new FileReader(file);
		 Connection connection=ConnectionManager.openConnection(); 
		PreparedStatement st=
				connection.prepareStatement("insert into FileTable values(?,?,?)");
		System.out.println(uploadDownloadAssignments.getFileId());
		System.out.println(uploadDownloadAssignments.getFileName());
		st.setInt(1, uploadDownloadAssignments.getFileId());
		st.setString(2, uploadDownloadAssignments.getFileName());
		st.setCharacterStream(3, reader);
		int rows=st.executeUpdate();
		ConnectionManager.closeConnection();
		if(rows>0)
			return true;
		else
			return false;
		
		
	}
	  

	
	 


	
}
