package com.virtusa.dao;

import java.io.FileNotFoundException;
import java.sql.SQLException;

import com.virtusa.entities.Student;
import com.virtusa.entities.UploadDownloadAssignments;

public interface StudentDAO {

	public Student getClassSchedule(String departmentName)throws ClassNotFoundException, SQLException;

	public Student getExaminationSchedule(String departmentName)throws ClassNotFoundException, SQLException;

	public Student getResults(int studentId)throws ClassNotFoundException, SQLException;

	public Student getPlacementCalender()throws ClassNotFoundException, SQLException;

	public boolean handleRetrieveUploadAssignments(String path)throws ClassNotFoundException, SQLException, FileNotFoundException ;
}
