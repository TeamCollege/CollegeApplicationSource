package com.virtusa.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.virtusa.entities.Faculty;
import com.virtusa.entities.Student;
import com.virtusa.integrate.ConnectionManager;

public class AdminDAOImpl implements AdminDAO 
{

	@Override
	public boolean storeStudentDetailsDAO(List<Student> student) throws SQLException
	{
		try(Connection connection=ConnectionManager.openConnection();)
		
		{     
		student.forEach( (object)->{
			String sql="insert into students values(?,?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement preparedStatement=
				connection.prepareStatement(sql);
		preparedStatement.setInt(1, object.getStudentId());
		preparedStatement.setString(2, object.getFirstName());
		preparedStatement.setString(3, object.getLastName());
		preparedStatement.setString(4, object.getPhoneNumber());
		preparedStatement.setString(5, object.getEmailAddress());
		preparedStatement.setDate(6,  Date.valueOf(object.getDateOfBirth()));
		preparedStatement.setDouble(7, object.getInterPercentage());
		preparedStatement.setDouble(8, object.getTenthPercentage());
		preparedStatement.setString(9, object.getCourseName());
		preparedStatement.setString(10, object.getDepartmentName());
		int rows = preparedStatement.executeUpdate();
		if(rows>0)
			System.out.println("Stduent Details are inserted into table successfully");
		else
			System.out.println("Failed to store the data");
		}
		catch(Exception e) {
			
		}
	
	});
		
	}
		catch(Exception e) {
			
		}
		return true;
	}
	@Override
	public boolean updateStudentDetailsDAO(int id, String firstName) throws ClassNotFoundException, SQLException
	{
		Connection connection=ConnectionManager.openConnection();
		PreparedStatement statement=
				connection.prepareStatement("update students set first_name=? where student_id=?");
		statement.setString(1, firstName);
		statement.setInt(2, id);
		int rows=statement.executeUpdate();
		ConnectionManager.closeConnection();
		if(rows>0)
			return true;
		else
		return false;
		
	}

	@Override
	public boolean deleteStudentDetailsDAO(int studentId) throws ClassNotFoundException, SQLException
	{
		Connection connection=ConnectionManager.openConnection();
		PreparedStatement preparedStatement=
				connection.prepareStatement("delete from students where student_id=?");
		preparedStatement.setInt(1, studentId);
		int rows = preparedStatement.executeUpdate();
		if(rows>0)
			return true;
		else    
			return false;
	}
       
	@Override
	public boolean storeFacultyDetailsDAO(Faculty faculty) throws ClassNotFoundException, SQLException 
	{
		
		Connection connection=ConnectionManager.openConnection();
		PreparedStatement preparedStatement=
				connection.prepareStatement("insert into faculty values(?,?,?,?,?,?,?,?,?)");
		preparedStatement.setString(1, faculty.getFacultyId());
		preparedStatement.setString(2, faculty.getFirstName());
		preparedStatement.setString(3, faculty.getLastName());
		preparedStatement.setString(4, faculty.getPhoneNumber());
		preparedStatement.setString(5, faculty.getEmailAddress());
		preparedStatement.setDate(6, Date.valueOf( faculty.getDateOfBirth()));
		preparedStatement.setString(7, faculty.getCourseName());
		preparedStatement.setString(8, faculty.getDepartmentName());
		preparedStatement.setDouble(9, faculty.getSalary());
		int rows = preparedStatement.executeUpdate();
		if(rows>0)
			return true;
		else
			return false;
	}
	@Override
	public boolean updateFacultyDetailsDAO(String phoneNumber , int id) throws ClassNotFoundException, SQLException
	{
		
		Connection connection=ConnectionManager.openConnection();
		PreparedStatement statement=
				connection.prepareStatement("update faculty set phone_number=? where faculty_id=?");
		statement.setString(1, phoneNumber);
		statement.setInt(2, id);
		int rows=statement.executeUpdate();
		ConnectionManager.closeConnection();
		if(rows>0)
			return true;
		else
		return false;
	}
	
	

	@Override
	public boolean deleteFacultyDetailsDAO(int facultyId) throws ClassNotFoundException, SQLException
	{
		Connection connection=ConnectionManager.openConnection();
		PreparedStatement preparedStatement=
				connection.prepareStatement("delete from faculty where faculty_id=?");
		preparedStatement.setInt(1, facultyId);
		int rows = preparedStatement.executeUpdate();
		if(rows>0)
			return true;
		else
			return false;
	}

	@Override
	public boolean addEventsDAO(int id, String name, String date, String location) throws ClassNotFoundException, SQLException
	{

				Connection connection=ConnectionManager.openConnection();

		PreparedStatement preparedStatement=
				connection.prepareStatement("insert into  events values(?,?,?,?)");
		preparedStatement.setInt(1, id);
		preparedStatement.setString(2, name);
	preparedStatement.setString(3, date);

			preparedStatement.setString(4, location);
		int rows = preparedStatement.executeUpdate();
		if(rows>0)
			return true;
		else
			return false;
				
	}

	@Override
	public boolean deleteEventsDAO(int eventId) throws ClassNotFoundException, SQLException 
	{
		Connection connection=ConnectionManager.openConnection();
		PreparedStatement preparedStatement=
				connection.prepareStatement("delete from events where event_id=?");
		preparedStatement.setInt(1, eventId);
		preparedStatement.executeUpdate();
		return true;
	}

	@Override
	public boolean addPlacementsDAO(int id, String companyName, String date, double percentage) throws ClassNotFoundException, SQLException
	{

		Connection connection=ConnectionManager.openConnection();
		PreparedStatement preparedStatement=
				connection.prepareStatement("insert into  placements values(?,?,?,?)");
		preparedStatement.setInt(1, id);
		preparedStatement.setString(2, companyName);

		preparedStatement.setString(3, date);

		preparedStatement.setDouble(4, percentage);
		int rows = preparedStatement.executeUpdate();
		if(rows>0)
			return true;
		else
			return false;
				
	}

	@Override
	public boolean deletePlacementsDAO(int placementId) throws ClassNotFoundException, SQLException 
	{
		
		Connection connection=ConnectionManager.openConnection();
		PreparedStatement preparedStatement=
				connection.prepareStatement("delete from placements where placement_id=?");
		preparedStatement.setInt(1, placementId);
		int rows = preparedStatement.executeUpdate();
		if(rows>0)
			return true;
		else
			return false;
	}

	@Override
	public boolean addCourseDAO(int id, String name) throws ClassNotFoundException, SQLException 
	{
		
		Connection connection=ConnectionManager.openConnection();
		PreparedStatement preparedStatement=
				connection.prepareStatement("insert into courses values(?,?)");
		preparedStatement.setInt(1, id);
		preparedStatement.setString(2, name);
		int rows = preparedStatement.executeUpdate();
		if(rows>0)
			return true;
		else
			return false;
		
	}

	@Override
	public boolean deleteCourseDAO(int courseId) throws ClassNotFoundException, SQLException 
	{
	
		Connection connection=ConnectionManager.openConnection();
		PreparedStatement preparedStatement=
				connection.prepareStatement("delete from courses where course_id=?");
		preparedStatement.setInt(1, courseId);
		int rows = preparedStatement.executeUpdate();
		if(rows>0)
			return true;
		else
			return false;
	}

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
