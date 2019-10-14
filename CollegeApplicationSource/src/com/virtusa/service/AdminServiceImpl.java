 package com.virtusa.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.virtusa.dao.AdminDAO;
import com.virtusa.dao.AdminDAOImpl;
import com.virtusa.dao.ApplicantDAOImpl;
import com.virtusa.entities.Faculty;
import com.virtusa.entities.Student;
import com.virtusa.model.ApplicantModel;
import com.virtusa.model.FacultyModel;
import com.virtusa.model.StudentModel;

public class AdminServiceImpl implements AdminService
{
	AdminDAO adminDAO = new AdminDAOImpl();

	@Override
	public void approveApplicantService(int applicantNumber) 
	{
		
		
		
		
		  
		
		
		
		
		ApplicantDAOImpl applicantDAOImpl = new ApplicantDAOImpl();
		ApplicantModel applicantModel = new ApplicantModel();
		applicantModel=applicantDAOImpl.retrieveApplicant();
		if(applicantModel.getTenthPercentage()>60.00 && applicantModel.getInterPercentage()>60.00)
		{
			System.out.println("Applicant is eligible for the admission");
			System.out.println("Applicant Approved Successful ");
		}
		else
		{
			System.out.println("Applicant not eligible");
		}
	}
       
	@Override
	public void addStudentService(StudentModel studentModel)
	{
		List<Student> studentList = new ArrayList<Student>();
		Student student = new Student();
		student.setStudentId(studentModel.getStudentId()); 
		student.setFirstName(studentModel.getFirstName());
		student.setLastName(studentModel.getLastName());
		student.setPhoneNumber(studentModel.getPhoneNumber());
		student.setEmailAddress(studentModel.getEmail());
		student.setDateOfBirth(studentModel.getDateOfBirth());
		student.setInterPercentage(studentModel.getInterPercentage());
		student.setTenthPercentage(studentModel.getTenthPercentage());
		student.setCourseName(studentModel.getCourseName());
		student.setDepartmentName(studentModel.getDepartmentName());
		studentList.add(student);
		try {
			adminDAO.storeStudentDetailsDAO(studentList);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteStudentService(int studentId) 
	{
		List<Student> studentList = new ArrayList<Student>();
		studentList.remove(studentId);
		try {
			adminDAO.deleteStudentDetailsDAO(studentId);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void updateStudentService(int id, String firstName) 
	{
		try {
			adminDAO.updateStudentDetailsDAO(id, firstName);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void addFacultyService(FacultyModel facultyModel)
	{
		List<Faculty> facultyList = new ArrayList<Faculty>();
		Faculty faculty = new Faculty();
		faculty.setFacultyId(faculty.getFacultyId());
		faculty.setFirstName(facultyModel.getFirstName());
		faculty.setLastName(facultyModel.getLastName());
		faculty.setPhoneNumber(facultyModel.getPhoneNumber());
		faculty.setEmailAddress(facultyModel.getEmail());
		faculty.setDateOfBirth(facultyModel.getDateOfBirth());
		faculty.setCourseName(facultyModel.getCourseName());
		faculty.setDepartmentName(facultyModel.getDepartmentName());
		faculty.setSalary(facultyModel.getSalary());
		facultyList.add(faculty);
	}
	
	@Override
	public void updateFacultyService(String phoneNumber,int id)
	{
		try {
			adminDAO.updateFacultyDetailsDAO(phoneNumber, id);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteFacultyService(int facultyId)
	{
		List<Faculty> facultyList = new ArrayList<Faculty>();
		facultyList.remove(facultyId);
		try {
			adminDAO.deleteFacultyDetailsDAO(facultyId);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void addEventsService(int id, String name, String date, String location)
	{
		try {
			adminDAO.addEventsDAO(id, name, date, location);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteEventsService(int eventId) 
	{
		try {
			adminDAO.deleteEventsDAO(eventId);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void addPlacementsService(int id, String companyName, String date, double percentage)
	{
		try {
			adminDAO.addPlacementsDAO(id, companyName, date, percentage);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void deletePlacementsService(int placementId)
	{
		
		try {
			adminDAO.deletePlacementsDAO(placementId);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void addCourseService(int id, String name)
	{
		try {
			adminDAO.addCourseDAO(id, name);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteCourseService(int courseId)
	{
		try {
			adminDAO.deleteCourseDAO(courseId);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	

	
	
	
	
	

	
	
	
	

	
	

}  
