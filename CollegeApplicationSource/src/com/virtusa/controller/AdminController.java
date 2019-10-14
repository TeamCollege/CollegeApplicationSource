package com.virtusa.controller;

import com.virtusa.model.FacultyModel;
import com.virtusa.model.StudentModel;
import com.virtusa.service.AdminService;
import com.virtusa.service.AdminServiceImpl;

public class AdminController 
{
	AdminService adminServiceImpl = new AdminServiceImpl();
	public void approveApplicantController(int applicantNumber)
	{   
		 
		 adminServiceImpl.approveApplicantService(applicantNumber);
	}
	
	public void addStudentController(StudentModel studentModel)
	{
		adminServiceImpl.addStudentService(studentModel);
	}
	public void updateStudentController(int id, String firstName)
	{
		adminServiceImpl.updateStudentService(id, firstName);
	}
	
	public void deleteStudentController(int studentId)
	{
		adminServiceImpl.deleteStudentService(studentId);
		
	}
	public void addFacultyController(FacultyModel facultyModel)
	{
		adminServiceImpl.addFacultyService(facultyModel);
		
	}
	public void updateFacultyController( String phoneNumber, int id)
	{
		adminServiceImpl.updateFacultyService( phoneNumber, id);
	}
	public void deleteFacultyController(int facultyId)
	{
		adminServiceImpl.deleteFacultyService(facultyId); 
	}
	
	public void addEventsController(int id, String name, String date, String location)
	{
		adminServiceImpl.addEventsService(id, name, date, location);
		
	}
	
	public void deleteEventsController(int eventId)
	{
		adminServiceImpl.deleteEventsService(eventId);
	}
	
	public void addCourseController(int id, String name)
	{
		adminServiceImpl.addCourseService(id, name);
	}
	
	public void deleteCourse(int courseId)
	{
		adminServiceImpl.deleteCourseService(courseId);
	}
	
	public void addPlacementsController(int id, String companyName, String date, double percentage)
	{
		adminServiceImpl.addPlacementsService(id, companyName, date, percentage);
	}
	
	public void deletePlacementController(int placementId)
	{
		adminServiceImpl.deletePlacementsService(placementId);
		
	}
	
	
	
	
	

}
