package com.virtusa.dao;

import java.sql.SQLException;
import java.util.List;

import com.virtusa.entities.ClassSchedule;
import com.virtusa.entities.Faculty;
import com.virtusa.entities.UploadDownloadAssignments;

public interface FacultyDAO {
	public List<ClassSchedule> viewCLassSchedule(String departmentName) throws ClassNotFoundException, SQLException;

	public Faculty getStaffMeetingDetails(String facultyId) throws ClassNotFoundException, SQLException;

	public UploadDownloadAssignments uploadDownloadAssignments(String path);	

}
 