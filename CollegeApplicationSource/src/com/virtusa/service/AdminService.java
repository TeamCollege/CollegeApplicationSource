package com.virtusa.service;

import com.virtusa.model.FacultyModel;
import com.virtusa.model.StudentModel;

public interface AdminService 
{
	public void approveApplicantService();
	public void addStudentService(StudentModel studentModel);
	public void deleteStudentService();
	public void addFacultyService(FacultyModel facultyModel);
	public void deleteFacultyService();
	 
	

}
