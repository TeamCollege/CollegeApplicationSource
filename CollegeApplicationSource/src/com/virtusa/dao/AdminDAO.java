package com.virtusa.dao;

import java.sql.SQLException;
import java.util.List;

import com.virtusa.entities.Faculty;
import com.virtusa.entities.Student;

public interface AdminDAO 
{
	public boolean storeStudentDetailsDAO(List<Student> student)throws SQLException;
	public boolean updateStudentDetailsDAO(int id, String firstName)throws ClassNotFoundException, SQLException;
	public boolean deleteStudentDetailsDAO(int studentId)throws ClassNotFoundException, SQLException;
	public boolean storeFacultyDetailsDAO(Faculty faculty)throws ClassNotFoundException, SQLException;
	public boolean updateFacultyDetailsDAO(String phoneNumber , int id)throws ClassNotFoundException, SQLException;
	public boolean deleteFacultyDetailsDAO(int facultyId)throws ClassNotFoundException, SQLException;
	public boolean addEventsDAO(int id, String name, String date, String location)throws ClassNotFoundException, SQLException;
	public boolean deleteEventsDAO(int eventId)throws ClassNotFoundException, SQLException;
	public boolean addPlacementsDAO(int id, String companyName, String date, double percentage)throws ClassNotFoundException, SQLException;
	public boolean deletePlacementsDAO(int placementId)throws ClassNotFoundException, SQLException;
	public boolean addCourseDAO(int id, String name)throws ClassNotFoundException, SQLException;
	public boolean deleteCourseDAO(int courseId)throws ClassNotFoundException, SQLException;
	
}
