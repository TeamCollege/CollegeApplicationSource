package com.virtusa.service;

import java.util.List;

import com.virtusa.entities.UploadDownloadAssignments;
import com.virtusa.model.ClassScheduleModel;
import com.virtusa.model.StudentModel;

public interface StudentService {
	//12.10.19
	public StudentModel handleRetrieveClassSchedule(String departmentName);

	public String handleUploadAssignments(String path);

	//public UploadDownloadAssignments handleUploadAssignments(String path);



	

}
