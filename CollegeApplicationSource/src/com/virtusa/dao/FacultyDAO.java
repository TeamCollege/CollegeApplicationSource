package com.virtusa.dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.List;

import com.virtusa.entities.ClassSchedule;
import com.virtusa.entities.Faculty;
import com.virtusa.entities.UploadDownloadAssignments;

public interface FacultyDAO {
	public List<ClassSchedule> viewCLassSchedule(String departmentName) throws ClassNotFoundException, SQLException;

	public boolean uploadDownloadAssignments(UploadDownloadAssignments uploadDownloadAssignments) throws SQLException, ClassNotFoundException, FileNotFoundException;

	public Faculty getExaminationSchedule(String departmentName) throws SQLException, ClassNotFoundException;

	public Faculty getStaffMeetingDetails(String departmentName1) throws ClassNotFoundException, SQLException;	

}
 