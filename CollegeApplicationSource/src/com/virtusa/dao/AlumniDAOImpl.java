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
	public boolean registerAlumni(Alumni alumni) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Connection conn=ConnectionManager.openConnection();
		PreparedStatement preparedStatement = conn.prepareStatement("insert into alumni values(?,?,?,?,?,?,?,?)");
		preparedStatement.setInt(1,  alumni.getAlumniId());
		preparedStatement.setString(2, alumni.getFirstName());
		preparedStatement.setString(3,  alumni.getLastName());
		preparedStatement.setString(4,  alumni.getEmailAddress());
		preparedStatement.setString(5, alumni.getPhoneNumber());
		preparedStatement.setString(6,  alumni.getPresentStatus());
		preparedStatement.setInt(7,  alumni.getYearOfCompletition());
		preparedStatement.setString(8,  alumni.getGender());
		
		
		int rows=preparedStatement.executeUpdate();
		ConnectionManager.closeConnection();
		
		if(rows>0)
			return true;
		else
			return false;
			}



		@Override
		public List<Alumni> getAlumni() throws ClassNotFoundException, SQLException {
           
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
		        alumni.setGender(resultSet.getString("gender"));
				alumni.setPresentStatus(resultSet.getString("present_status"));
				alumni.setYearOfCompletition(resultSet.getInt("year_of_completition"));
                alumniList.add(alumni);
			}
			ConnectionManager.closeConnection();
			return alumniList;
		}
	
		
		@Override
		public Alumni getAlumniDetails(String firstName) throws ClassNotFoundException, SQLException {
			// TODO Auto-generated method stub
			
			Connection connection=ConnectionManager.openConnection();
			PreparedStatement statement=connection.prepareStatement("select * from alumni where first_name=?");
			statement.setString(1, firstName);
			
			ResultSet resultSet=statement.executeQuery();
			Alumni alumni=new Alumni();
				while(resultSet.next()) {
				
				alumni.setAlumniId(resultSet.getInt("alumni_id"));
				alumni.setFirstName(resultSet.getString("first_name"));
				alumni.setLastName(resultSet.getString("last_name"));
				alumni.setEmailAddress(resultSet.getString("email"));
				alumni.setPhoneNumber(resultSet.getString("phone_number"));
		        alumni.setGender(resultSet.getString("gender"));
				alumni.setPresentStatus(resultSet.getString("present_status"));
				alumni.setYearOfCompletition(resultSet.getInt("year_of_completition"));
					
			}
			ConnectionManager.closeConnection();
			return alumni;
		}

			
		}
		
	



	
	


