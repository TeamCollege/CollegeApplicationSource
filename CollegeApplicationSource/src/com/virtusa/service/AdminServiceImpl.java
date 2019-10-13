package com.virtusa.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.virtusa.dao.ApplicantDAOImpl;
import com.virtusa.entities.Faculty;
import com.virtusa.entities.Student;
import com.virtusa.model.ApplicantModel;
import com.virtusa.model.FacultyModel;
import com.virtusa.model.StudentModel;

public class AdminServiceImpl implements AdminService
{

	@Override
	public void approveApplicantService() 
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
		
	}

	@Override
	public void deleteStudentService() 
	{
		List<Student> studentList = new ArrayList<Student>();
		System.out.println("Enter Student Id to delete record:");
		Scanner scanner = new Scanner(System.in);
		int id= scanner.nextInt();
		studentList.remove(id);
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
	public void deleteFacultyService()
	{
		List<Faculty> facultyList = new ArrayList<Faculty>();
		System.out.println("Enter faculty Id to delete record");
		Scanner scanner = new Scanner(System.in);
		int id= scanner.nextInt();
		facultyList.remove(id);
		
	}

	
	
	
	

	
	

}  
