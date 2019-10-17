package com.virtusa.service;

import com.virtusa.model.FacultyModel;
import com.virtusa.model.StudentModel;

public interface AdminService 
{
	public void approveApplicantService(int applicantNumber);
	public void addStudentService(StudentModel studentModel);
	public void deleteStudentService(String studentId);
	public void updateStudentService(int id, String firstName);
	public void viewStudentService(int studentId2);
	public String addFacultyService(FacultyModel facultyModel);
	public void deleteFacultyService(int facultyId);
	public void updateFacultyService(String phoneNumber, int id);
	public void viewFacultyService(int facultyId2);
	public void addEventsService(int id, String name, String date, String location);
	public void deleteEventsService(int eventId);
	public void addPlacementsService(int id, String companyName, String date, double percentage);
	public void deletePlacementsService(int placementId);
	public void addDepartmentService(int id, String name);
	public void deleteDepartmentService(int courseId);
	     
	
    
}
