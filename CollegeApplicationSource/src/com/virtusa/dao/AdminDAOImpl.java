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
	public boolean storeStudentDetails(List<Student> student) throws SQLException
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
		preparedStatement.setDate(6, object.getDateOfBirth());
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
	public boolean updateStudentDetails(Student student) throws ClassNotFoundException, SQLException
	{
		Connection connection=ConnectionManager.openConnection();
		PreparedStatement statement=
				connection.prepareStatement("update students set first_name=? where student_id=?");
		statement.setString(1,student.getFirstName());
		statement.setInt(2, student.getStudentId());
		int rows=statement.executeUpdate();
		ConnectionManager.closeConnection();
		if(rows>0)
			return true;
		else
		return false;
		
	}

	@Override
	public boolean deleteStudentDetails(Student student) throws ClassNotFoundException, SQLException
	{
		Connection connection=ConnectionManager.openConnection();
		PreparedStatement preparedStatement=
				connection.prepareStatement("delete from students where student_id=?");
		System.out.println("Enter Student ID");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		preparedStatement.setInt(1, choice);
		int rows = preparedStatement.executeUpdate();
		if(rows>0)
			return true;
		else
			return false;
	}

	@Override
	public boolean storeFacultyDetails(Faculty faculty) throws ClassNotFoundException, SQLException 
	{
		
		Connection connection=ConnectionManager.openConnection();
		PreparedStatement preparedStatement=
				connection.prepareStatement("insert into faculty values(?,?,?,?,?,?,?,?,?)");
		preparedStatement.setInt(1, faculty.getFacultyId());
		preparedStatement.setString(2, faculty.getFirstName());
		preparedStatement.setString(3, faculty.getLastName());
		preparedStatement.setString(4, faculty.getPhoneNumber());
		preparedStatement.setString(5, faculty.getEmailAddress());
		preparedStatement.setDate(6, faculty.getDateOfBirth());
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
	public boolean updateFacultyDetails(Faculty faculty) throws ClassNotFoundException, SQLException
	{
		
		
		
		
		return false;
	}
	
	

	@Override
	public boolean deleteFacultyDetails(Faculty faculty) throws ClassNotFoundException, SQLException
	{
		Connection connection=ConnectionManager.openConnection();
		PreparedStatement preparedStatement=
				connection.prepareStatement("delete from faculty where faculty_id=?");
		System.out.println("Enter faculty ID");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		preparedStatement.setInt(1, choice);
		int rows = preparedStatement.executeUpdate();
		if(rows>0)
			return true;
		else
			return false;
	}

	@Override
	public boolean addEvents() throws ClassNotFoundException, SQLException
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Event ID:");
		int id = scanner.nextInt();
		System.out.println("Enter Event Name:");
		String name = scanner.next();
		System.out.println("Enter Event Date:");
		Date date = scanner.nextda
		System.out.println("Enter Event Location:");
		String location = scanner.next();
				Connection connection=ConnectionManager.openConnection();
		PreparedStatement preparedStatement=
				connection.prepareStatement("insert into  events values(?,?,?,?)");
		preparedStatement.setInt(1, id);
		preparedStatement.setString(2, name);
		preparedStatement.setDate(3, date);
		preparedStatement.setString(4, location);
		int rows = preparedStatement.executeUpdate();
		if(rows>0)
			return true;
		else
			return false;
				
	}

	@Override
	public boolean deleteEvents() throws ClassNotFoundException, SQLException 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Event ID:");
		int id = scanner.nextInt();
		Connection connection=ConnectionManager.openConnection();
		PreparedStatement preparedStatement=
				connection.prepareStatement("delete from events where event_id=?");
		preparedStatement.setInt(1, id);
		preparedStatement.executeUpdate();
		return true;
	}

	@Override
	public boolean addPlacements() throws ClassNotFoundException, SQLException
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Placements ID:");
		int id = scanner.nextInt();
		System.out.println("Enter Company Name:");
		String companyName = scanner.next();
		System.out.println("Enter Event Date:");
		Date date = scanner.nextd ;
		System.out.println("Enter Eligibility Percentage");
		double percentage = scanner.nextDouble();
		Connection connection=ConnectionManager.openConnection();
		PreparedStatement preparedStatement=
				connection.prepareStatement("insert into  placements values(?,?,?,?)");
		preparedStatement.setInt(1, id);
		preparedStatement.setString(2, companyName);
		preparedStatement.setDate(3, date);
		preparedStatement.setDouble(4, percentage);
		int rows = preparedStatement.executeUpdate();
		if(rows>0)
			return true;
		else
			return false;
				
	}

	@Override
	public boolean deletePlacements() throws ClassNotFoundException, SQLException 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Placements ID:");
		int id = scanner.nextInt();
		Connection connection=ConnectionManager.openConnection();
		PreparedStatement preparedStatement=
				connection.prepareStatement("delete from placements where placement_id=?");
		preparedStatement.setInt(1, id);
		preparedStatement.executeUpdate();
		return true;
	}

	@Override
	public boolean addCourse() throws ClassNotFoundException, SQLException 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Course ID:");
		int id = scanner.nextInt();
		System.out.println("Enter Course Name:");
		String name = scanner.next();
		Connection connection=ConnectionManager.openConnection();
		PreparedStatement preparedStatement=
				connection.prepareStatement("insert into courses values(?,?)");
		preparedStatement.setInt(1, id);
		preparedStatement.setString(2, name);
		preparedStatement.executeUpdate();
		return true;
	}

	@Override
	public boolean deleteCourse() throws ClassNotFoundException, SQLException 
	{
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Course ID:");
		int id = scanner.nextInt();
		Connection connection=ConnectionManager.openConnection();
		PreparedStatement preparedStatement=
				connection.prepareStatement("delete from courses where course_id=?");
		preparedStatement.setInt(1, id);
		preparedStatement.executeUpdate();
		return true;
	}

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
