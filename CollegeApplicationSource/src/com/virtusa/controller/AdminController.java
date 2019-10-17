package com.virtusa.controller;

import com.virtusa.helper.FactoryAdminService;
import com.virtusa.model.FacultyModel;
import com.virtusa.model.StudentModel;
import com.virtusa.service.AdminService;

public class AdminController 
{
	private AdminService adminService;
	public AdminController()
	{
		this.adminService=FactoryAdminService.createAdminService();
	}
	public void approveApplicantController(int applicantNumber)
	{   
		   
		 adminService.approveApplicantService(applicantNumber);
	}
	
	public void addStudentController(StudentModel studentModel)
	{
		adminService.addStudentService(studentModel);
	}
	public void updateStudentController(int id, String firstName)
	{
		adminService.updateStudentService(id, firstName);
	}
	
	public void deleteStudentController(String studentId)
	{
		adminService.deleteStudentService(studentId);
		
	}
	public void viewStudentController(int studentId2)
	{
		adminService.viewStudentService(studentId2);
	}
	public void addFacultyController(FacultyModel facultyModel)
	{
		adminService.addFacultyService(facultyModel);
		
	}
	public void updateFacultyController( String phoneNumber, int id)
	{
		adminService.updateFacultyService( phoneNumber, id);
	}
	public void deleteFacultyController(int facultyId)
	{
		adminService.deleteFacultyService(facultyId); 
	}
	public void viewFacultyController(int facultyId2)
	{
		adminService.viewFacultyService(facultyId2);
	}
	
	public void addEventsController(int id, String name, String date, String location)
	{
		adminService.addEventsService(id, name, date, location);
		
	}
	
	public void deleteEventsController(int eventId)
	{
		adminService.deleteEventsService(eventId);
	}
	
	public void addDepartmentController(int id, String name)
	{
		adminService.addDepartmentService(id, name);
	}
	
	public void deleteDepartmentController(int courseId)
	{
		adminService.deleteDepartmentService(courseId);
	}
	
	public void addPlacementsController(int id, String companyName, String date, double percentage)
	{
		adminService.addPlacementsService(id, companyName, date, percentage);
	}
	
	public void deletePlacementController(int placementId)
	{
		adminService.deletePlacementsService(placementId);
		
	}
	
	
	
	
	

}
