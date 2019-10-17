package com.virtusa.view;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import com.virtusa.controller.AdminController;
import com.virtusa.exception.InvalidUserChoiceException;
import com.virtusa.exception.ValidationException;
import com.virtusa.model.FacultyModel;
import com.virtusa.model.StudentModel;
import com.virtusa.validation.AdminModelValidator;

public class AdminView 
{
	Scanner scan = new Scanner(System.in);
	AdminModelValidator adminModelValidator = new AdminModelValidator();
	public void adminView()
	{
		System.out.println("\t\t =====ADMIN VIEW=====");
		System.out.println("1.Approve Applicant");
		System.out.println("2.Manage Students");
		System.out.println("3.Manage Faculty");
		System.out.println("4.Manage Events");
		System.out.println("5.Manage Departments");
		System.out.println("6.Manage Placements");
		System.out.println("7.LogOut\n");
		System.out.println("Enter your choice");
		int choice= scan.nextInt();
		try {
		switch(choice)
		{
		
		case 1 :approveApplicant();  
				 	break;
				
		case 2 : manageStudents();
					break;
		
		case 3 : manageFaculty();
					break;
			
		case 4 : manageEvents();
					break;
			
		case 5 : manageDepartment();
					break;
		
		case 6 : managePlacements();
					break;
					
		case 7 :
					break;
		default:
			throw new InvalidUserChoiceException();
			
		}		
			}
		catch(Exception e)
			{
				System.out.println(e);
				System.out.println("--------Enter a Valid Number------------");
				adminView();
			}
		}


		public void approveApplicant() 
		{
			/*
			 * 1.either controller or data retrieve as model + validation
			 * 2.retrieve model from method in any service
			 * 
			 */
			System.out.println("Enter Applicant Number To Approve Applicant:");
			int applicantNumber = scan.nextInt();
			adminController.approveApplicantController(applicantNumber);
		
		}
		
		public void manageStudents()
		{
			System.out.println("1. Add Student");
			System.out.println("2. Delete Student");
			System.out.println("3. Update Student Details");
			System.out.println("4. View student Data based on Student Id");
		
			int choice = scan.nextInt();
			AdminController adminController = new AdminController();
			StudentModel studentModel = new StudentModel();
			
			try
			{
			switch(choice)
			{
			
			case 1 :adminController.addStudentController(studentModel);
					break;
					
			case 2 :String passIdString="";
					boolean validStudentId=false;
					do {
				    try {
				    	System.out.println("Enter Student Id to delete:");
				    	passIdString=scan.next();
				    	validStudentId=adminModelValidator.validNumber1(passIdString);
				    	}
				    	catch(Exception w) { 
				    	}
					}while(validStudentId);
					adminController.deleteStudentController(passIdString);
					break;
			case 3 :
					int studentId=0;
					String passIdString1="";  
					boolean validStudentId1=false;
					do {  
						try {
							System.out.println("Enter Student Id to Update details:");
							passIdString1=scan.next();
							validStudentId1=adminModelValidator.validNumber1(passIdString1);
							studentId=Integer.parseInt(passIdString1);
							}
						catch(Exception w) {
						}
					}while(validStudentId1);
				///////////////////////////
					String firstName="";
					boolean validFirstName=false;
					do {
					System.out.println("Enter New First name");
					firstName = scan.next();
					validFirstName=adminModelValidator.validString1(firstName);
					if(validFirstName==false)
						System.out.println("--------Enter Name in Alphabets only-------");
					}while(!validFirstName);
					adminController.updateStudentController(studentId, firstName);
					break;
					
			case 4: int studentId2=0;	
					String passIdString2="";
					boolean validStudentId2=false;
					do {
						try {
							System.out.println("Enter Student Id to View Student Data:");
							passIdString2=scan.next();
							validStudentId2=adminModelValidator.validNumber1(passIdString2);
							studentId2=Integer.parseInt(passIdString2);
							}
						catch(Exception w) { 
							}
					}while(validStudentId2);
					adminController.viewStudentController(studentId2);
					break;
			
			default:
				throw new InvalidUserChoiceException();
			}
			}
			catch(Exception e)
			{
				System.out.println(e);
				System.out.println("----------------Enter a Valid Number------------------");
			}
			
			
		}
		AdminController adminController = new AdminController();
		public void manageFaculty()
		{   
			System.out.println("1.Add Faculty");
			System.out.println("2.Delete Faculty");
			System.out.println("3.Update Faculty Details");
			System.out.println("4.View Faculty data based on faculty id");
			int choice = scan.nextInt();
			FacultyModel facultyModel = new FacultyModel();
			try
			{
			switch(choice)
			{
			case 1 : System.out.println("Enter FacultyId:");
					 String id=scan.next();
					 System.out.println("Enter First Name:");
					 String firstName=scan.next();
					 System.out.println("Enter Last Name:");
					 String lastName=scan.next();
					 System.out.println("Enter EmailId:");
					 String emailId=scan.next();
					 System.out.println("Enter Phone Number:");
					 String number=scan.next();
					 System.out.println("Enter Department Name:");
					 String departmentName=scan.next();
					 System.out.println("Enter Date of Birth:");
					 String DOB=scan.next();
					 System.out.println("Enter Salary:");
					 int salary=scan.nextInt();
					
					 facultyModel.setFacultyId(id);
					 facultyModel.setFirstName(firstName);
					 facultyModel.setLastName(lastName);
					 facultyModel.setEmail(emailId);
					 facultyModel.setPhoneNumber(number);
					 facultyModel.setDepartmentName(departmentName);
					 //facultyModel.setDateOfBirth(DOB);
					 facultyModel.setSalary(salary);
					 adminController.addFacultyController(facultyModel); 
					break;
			case 2 :int facultyId=0;	
					String facultyIdString="";
					boolean validFacultyId=false;
					do {
						try {
							System.out.println("Enter Faculty Id to Delete faculty Data:");
							facultyIdString=scan.next();
							validFacultyId=adminModelValidator.validNumber1(facultyIdString);
							facultyId=Integer.parseInt(facultyIdString);
							}
						catch(Exception w) { 
						}
					}while(validFacultyId);
					adminController.viewStudentController(facultyId);
					break;
			case 3 :int facultyId1=0;	
					String facultyIdString1="";
					boolean validFacultyId1=false;
					do {
						try {
							System.out.println("Enter Faculty Id to Update faculty Data:");
							facultyIdString1=scan.next();
							validFacultyId1=adminModelValidator.validNumber1(facultyIdString1);
							facultyId1=Integer.parseInt(facultyIdString1);
							}
						catch(Exception w) { 
						}
					}while(validFacultyId1);
					//////////////////////////////////////////////
					String phoneNumber="";
					boolean validPhoneNumber=false;
					do {
						try {
							System.out.println("Enter New Phone Number To Update:");
							phoneNumber=scan.next();
							validPhoneNumber=adminModelValidator.validNumber1(phoneNumber);
						}
						catch(Exception w) {
							
						}
					}while(validPhoneNumber);
					adminController.updateFacultyController(phoneNumber, facultyId1);
					break;
					
			case 4: int facultyId2=0;	
					String facultyIdString2="";
					boolean validFacultyId2=false;
					do {
						try {
							System.out.println("Enter Faculty Id to View faculty Data:");
							facultyIdString2=scan.next();
							validFacultyId2=adminModelValidator.validNumber1(facultyIdString2);
							facultyId2=Integer.parseInt(facultyIdString2);
							}
						catch(Exception w) { 
						}
					}while(validFacultyId2);
					adminController.viewFacultyController(facultyId2);
					break;
		default:
				throw new InvalidUserChoiceException();
			}
			}
			catch(Exception e)
			{
				System.out.println(e);
				System.out.println("Enter a Valid Number");
			}
			
		}
		
		public void manageEvents()
		{
			boolean flag=false;
			System.out.println("1.Add Events");
			System.out.println("2.Delete Events");
			int choice = scan.nextInt();
			try {
			switch(choice)
			{
			case 1: int eventId=0;	
					String eventIdString="";
					boolean validEventId=false;
					do {
						try {
						System.out.println("Enter Event Id:");
						eventIdString=scan.next();
						validEventId=adminModelValidator.validNumber1(eventIdString);
						eventId=Integer.parseInt(eventIdString);
						}
						catch(Exception w) { 
						}
					}while(validEventId);
					/////////////////////////////////////////////
					String eventName="";
					boolean validEventName=false;
					do {
					System.out.println("Enter Event Name:");
					eventName = scan.next();
					validEventName=adminModelValidator.validString1(eventName);
					if(validEventName==false)
						System.out.println("--------Enter Name in Alphabets only-----------");
					}while(!validEventName);
					//////////////////////////////////////////
					System.out.println("Enter Date(dd-mm-yyyy):");
					String date =scan.next();
					Date datex = null;
					do
					{
						SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
						try {
							datex=dateFormat.parse(date);
							flag=false;
						}
						catch(ParseException e) {
							System.out.println("---------Enter valid date in specified format------------");
						}
					}
					while(flag);
					/////////////////////////////////////////////////
					String location="";
					boolean validLocation=false;
					do {
					System.out.println("Enter Location:");
					location = scan.next();
					validLocation=adminModelValidator.validString1(location);
					if(validLocation==false)
						System.out.println("----------Enter Name in Alphabets only----------");
					}while(!validLocation);
					adminController.addEventsController(eventId, eventName, date, location);
					break;
					
			case 2: int eventId1=0;	
					String eventIdString1="";
					boolean validEventId1=false;
					do {
						try {
							System.out.println("Enter Event Id:");
							eventIdString1=scan.next();
							validEventId1=adminModelValidator.validNumber1(eventIdString1);
							eventId1=Integer.parseInt(eventIdString1);
						}
						catch(Exception w) { 
						}
					}while(validEventId1);
					adminController.deleteEventsController(eventId1);
					break;
			default:
				throw new InvalidUserChoiceException();	
			
			}	
			}
			catch(Exception e)
			{
				System.out.println(e);
				System.out.println("------Enter a Valid Number--------");
				manageEvents();
			}
			
		}
		
		
		public void manageDepartment()
		{
			System.out.println("1.Add Department");
			System.out.println("2.Delete Department");
			System.out.println("Enter your choice");
			int choice = scan.nextInt();
			try {
			switch(choice)
			{
			case 1: 
					int departmentId=0;	
					String departmentIdString="";
					boolean validDepartmentId=false;
					do {
						try {
							System.out.println("Enter Department Id:");
							departmentIdString=scan.next();
							validDepartmentId=adminModelValidator.validNumber1(departmentIdString);
							departmentId=Integer.parseInt(departmentIdString);
							}
						catch(Exception w) { 
						}
					}while(validDepartmentId);
				/////////////////////////////////////////////
					String departmentName="";
					boolean validDepartmentName=false;
					do {
						System.out.println("Enter Department Name:");
						departmentName = scan.next();
						validDepartmentName=adminModelValidator.validString1(departmentName);
						if(validDepartmentName==false)
							System.out.println("-------------Enter Name in Alphabets only------------");
						}while(!validDepartmentName);
					adminController.addDepartmentController(departmentId, departmentName);
					break;
			case 2: 
					int departmentId1=0;	
					String departmentIdString1="";
					boolean validDepartmentId1=false;
					do {
						try {
							System.out.println("Enter Department Id:");
							departmentIdString1=scan.next();
							validDepartmentId1=adminModelValidator.validNumber1(departmentIdString1);
							departmentId=Integer.parseInt(departmentIdString1);
							}
						catch(Exception w) { 
						}
					}while(validDepartmentId1);
					adminController.deleteDepartmentController(departmentId1);
					break;
			default:
				throw new InvalidUserChoiceException();
			}
			}
			catch(Exception e)
			{
				System.out.println(e);
				System.out.println("----------Enter a Valid Number------------");
				manageDepartment();
			}
		}
		
		
		public void managePlacements()
		{
			boolean flag=false;
			System.out.println("1.Add Placements");
			System.out.println("2.Delete Placements");
			System.out.println("Enter your choice");
			int choice = scan.nextInt();
			try {
			switch(choice)
			{
			case 1: int placementId=0;	
					String placementIdString="";
					boolean validPlacementId=false;
					do {
						try {
							System.out.println("Enter Placement Id:");
							placementIdString=scan.next();
							validPlacementId=adminModelValidator.validNumber1(placementIdString);
							placementId=Integer.parseInt(placementIdString);
						}
						catch(Exception w) { 
						}
					}while(validPlacementId);
					/////////////////////////////////////////////
					String companyName="";
					boolean validCompanyName=false;
					do {
						System.out.println("Enter Company Name:");
						companyName = scan.next();
						validCompanyName=adminModelValidator.validString1(companyName);
						if(validCompanyName==false)
							System.out.println("---------------Enter Name in Alphabets only---------");
					}while(!validCompanyName);
					////////////////////////////////////////////////
					System.out.println("Enter Date(dd-mm-yyyy):");
					String date =scan.next();
					Date datex = null;
					do
					{
						SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
						try {
							datex=dateFormat.parse(date);
							flag=false;
						}
						catch(ParseException e) {
							System.out.println("----------------Enter valid date in specified format-----------------");
						}
					}
					while(flag);
					/////////////////////////////////////////////////
					System.out.println("Enter Eligibility Percentage");
					double percentage = scan.nextDouble();
					adminController.addPlacementsController(placementId,companyName,date, percentage);
					break;
					
			case 2: int placementId1=0;	
					String placementIdString1="";
					boolean validPlacementId1=false;
					do {
						try {
							System.out.println("Enter Placement Id:");
							placementIdString1=scan.next();
							validPlacementId1=adminModelValidator.validNumber1(placementIdString1);
							placementId=Integer.parseInt(placementIdString1);
							}
						catch(Exception w) { 
						}
					}while(validPlacementId1);
					adminController.deletePlacementController(placementId1);
					break;
					
			default:
				throw new InvalidUserChoiceException();
			}	
			}
			catch(Exception e)
			{
				System.out.println(e);
				System.out.println("------Enter a Valid Number----------");
				managePlacements();
			}
			
		}
		
		
	
	
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
