package com.virtusa.service;

import java.util.List;

import com.virtusa.entities.ClassSchedule;
import com.virtusa.model.ClassScheduleModel;
import com.virtusa.model.FacultyModel;
import com.virtusa.model.UploadDownloadAssignmentsModel;

public interface FacultyService {

	public List<ClassScheduleModel> retreiveClassSchedule(String departmentName);

	public FacultyModel handleRetrieveStaffMeeting(String facultyId);

	public String uploadAssignments(UploadDownloadAssignmentsModel uploadDownloadAssignmentsModel);

 
}
