package com.virtusa.dao;

import java.io.FileNotFoundException;
import java.sql.SQLException;

import com.virtusa.entities.Student;
import com.virtusa.entities.UploadDownloadAssignments;

public interface StudentDAO {

	public Student getClassSchedule(String departmentName)throws ClassNotFoundException, SQLException;

	//public boolean uploadDownloadAssignments(String path);

	//public boolean uploadDownloadAssignments(String path) throws ClassNotFoundException, SQLException,FileNotFoundException;

	public boolean handleuploadDownloadAssignments(UploadDownloadAssignments uploadDownloadAssignments) throws ClassNotFoundException, SQLException,FileNotFoundException;
        
}
