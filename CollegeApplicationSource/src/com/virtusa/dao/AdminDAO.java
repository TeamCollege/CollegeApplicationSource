package com.virtusa.dao;

import java.sql.SQLException;

import com.virtusa.entities.Faculty;
import com.virtusa.entities.Student;

public interface AdminDAO 
{
	public boolean storeStudentDetails(Student student)throws ClassNotFoundException, SQLException;
	public boolean updateStudentDetails(Student student)throws ClassNotFoundException, SQLException;
	public boolean deleteStudentDetails(Student student)throws ClassNotFoundException, SQLException;
	public boolean storeFacultyDetails(Faculty faculty)throws ClassNotFoundException, SQLException;
	public boolean updateFacultyDetails(Faculty faculty)throws ClassNotFoundException, SQLException;
	public boolean deleteFacultyDetails(Faculty faculty)throws ClassNotFoundException, SQLException;
	public boolean addEvents()throws ClassNotFoundException, SQLException;
	public boolean deleteEvents()throws ClassNotFoundException, SQLException;
	public boolean addPlacements()throws ClassNotFoundException, SQLException;
	public boolean deletePlacements()throws ClassNotFoundException, SQLException;
	public boolean addCourse()throws ClassNotFoundException, SQLException;
	public boolean deleteCourse()throws ClassNotFoundException, SQLException;
	
}
