package com.virtusa.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.virtusa.entities.Alumni;
import com.virtusa.integrate.ConnectionManager;



public class AlumniDAOImpl implements AlumniDAO {
	     

	@Override
	public List<Alumni> getAlumni() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Connection connection=ConnectionManager.openConnection();
		Statement statement=connection.createStatement();
		ResultSet resultSet=
				statement.executeQuery("select * from alumni");
		
		List<Alumni> alumniList=new ArrayList<>();
		while(resultSet.next()) {
			Alumni alumni=new Alumni();
			alumni.setAlumniId(resultSet.getInt("alumni_id"));
			alumni.setFirstName(resultSet.getString("first_name"));
			alumni.setLastName(resultSet.getString("last_name"));
			alumni.setEmailAddress(resultSet.getString("email"));
			alumni.setPhoneNumber(resultSet.getString("phone_number"));
			alumni.setCourseId(resultSet.getInt("course_id"));
			alumni.setGender(resultSet.getString("gender"));
			alumni.setPresentStatus(resultSet.getString("present_status"));
			alumni.setYearOfCompletition(resultSet.getInt("year_of_completition"));
			java.sql.Date sqlDate=resultSet.getDate("dateOfBirth");
			LocalDate dateOfBirth=LocalDate.of(sqlDate.getYear(), sqlDate.getMonth(), sqlDate.getDay());
			alumni.setDateOfBirth(dateOfBirth);
			alumniList.add(alumni);
		}
		ConnectionManager.closeConnection();
		return alumniList;
	}

		
		
		@Override
	public boolean registerAlumni(Alumni alumni) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Connection conn=ConnectionManager.openConnection();
		PreparedStatement preparedStatement = conn.prepareStatement("insert into alumni values(?,?,?,?,?,?,?,?,?,?,?)");
		preparedStatement.setString(2, alumni.getFirstName());
		preparedStatement.setString(3,  alumni.getLastName());
		preparedStatement.setString(4,  alumni.getEmailAddress());
		preparedStatement.setString(5, alumni.getPhoneNumber());
		preparedStatement.setInt(1,  alumni.getAlumniId());
		preparedStatement.setInt(6,  alumni.getCourseId());
		preparedStatement.setString(10,  alumni.getGender());
		preparedStatement.setDate(7,  Date.valueOf( alumni.getDateOfBirth()));
		preparedStatement.setInt(9,  alumni.getYearOfCompletition());
		preparedStatement.setString(8,  alumni.getPresentStatus());
		int rows=preparedStatement.executeUpdate();
		ConnectionManager.closeConnection();
		
		if(rows>0)
			return true;
		else
			return false;
			}
		
	}


	



	
	


