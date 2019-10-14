package com.virtusa.service;

import com.virtusa.model.FacultyModel;
import com.virtusa.model.StudentModel;

public interface AdminService 
{
	public void approveApplicantService();
	public void addStudentService(StudentModel studentModel);
	public void deleteStudentService(int studentId);
	public void updateStudentService(int id, String firstName);
	public void addFacultyService(FacultyModel facultyModel);
	public void deleteFacultyService(int facultyId);
	public void updateFacultyService(String phoneNumber, int id);
	public void addEventsService(int id, String name, String date, String location);
	public void deleteEventsService(int eventId);
	public void addPlacementsService(int id, String companyName, String date, double percentage);
	public void deletePlacementsService(int placementId);
	public void addCourseService(int id, String name);
	public void deleteCourseService(int courseId);
	     
	

}
