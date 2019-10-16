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
import com.virtusa.validation.ApplicantModelValidator;

public class AdminView 
{
	Scanner scan = new Scanner(System.in);
	ApplicantModelValidator validator = new ApplicantModelValidator();
	public void adminView()
	{
		System.out.println("\t\t =====ADMIN VIEW=====");
		System.out.println("1.Approve Applicant");
		System.out.println("2.Manage Students");
		System.out.println("3.Manage Faculty");
		System.out.println("4.Manage Events");
		System.out.println("5.Manage Course");
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
				System.out.println("Enter a Valid Number");
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
				    	validStudentId=validator.validNumber1(passIdString);
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
			    	validStudentId1=validator.validNumber1(passIdString1);
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
					validFirstName=validator.validString1(firstName);
					if(validFirstName==false)
						System.out.println("----Enter Name in Alphabets only");
					}while(!validFirstName);
					adminController.updateStudentController(studentId, firstName);
					break;
					
			case 4:	System.out.println("Enter Student Id:");
					int studentId1 = scan.nextInt();
			
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
			case 1 : adminController.addFacultyController(facultyModel);
					break;
			case 2 :System.out.println("Enter faculty ID");
					int facultyId = scan.nextInt(); 
					adminController.deleteFacultyController(facultyId);
					break;
			case 3 :System.out.println("Enter faculty ID: ");
					int id=scan.nextInt();
					System.out.println("Enter new phoneNumber:");
					String phoneNumber=scan.next();
					adminController.updateFacultyController(phoneNumber, id);
					break;
					
			case 4:System.out.println("Enter Faculty Id:");
					int facultyId1 = scan.nextInt();
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
			case 1: 
					System.out.println("Enter Event ID:");
					int id = scan.nextInt();
					System.out.println("Enter Event Name:");
					String name = scan.next();
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
							System.out.println("Enter valid date in specified format");
						}
					}
					while(flag);
					System.out.println("Enter Event Location:");
					String location = scan.next();
					adminController.addEventsController(id, name, date, location);
					break;
					
			case 2: 
					System.out.println("Enter Event ID:");
					int eventId = scan.nextInt();
					adminController.deleteEventsController(eventId);
						break;
			default:
				throw new InvalidUserChoiceException();	
			
			}	
			}
			catch(Exception e)
			{
				System.out.println(e);
				System.out.println("Enter a Valid Number");
				manageEvents();
			}
			
		}
		
		
		public void manageDepartment()
		{
			System.out.println("1.Add Department");
			System.out.println("2.Delete Department");
			int choice = scan.nextInt();
			
			switch(choice)
			{
			case 1: 
					System.out.println("Enter Department ID:");
					int id = scan.nextInt();
					System.out.println("Enter Department Name:");
					String name = scan.next();
					adminController.addCourseController(id, name);
					break;
			case 2: 
					System.out.println("Enter Department ID to delete");
					int departmentId = scan.nextInt();
					adminController.deleteCourse(departmentId);
					break;
			}		
		}
		
		
		public void managePlacements()
		{
			boolean flag=false;
			System.out.println("1.Add Placements");
			System.out.println("2.Delete Placements");
			int choice = scan.nextInt();
			try {
			switch(choice)
			{
			case 1: 
					System.out.println("Enter Placements ID:");
					int id = scan.nextInt();
					System.out.println("Enter Company Name:");
					String companyName = scan.next();
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
							System.out.println("Enter valid date in specified format");
						}
					}
					while(flag);
					
					System.out.println("Enter Eligibility Percentage");
					double percentage = scan.nextDouble();
					adminController.addPlacementsController(id,companyName,date, percentage);
					break;
					
			case 2: Scanner scanner = new Scanner(System.in);
					System.out.println("Enter Placements ID:");
					int placementId = scanner.nextInt();
					adminController.deletePlacementController(placementId);
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
		
		
	
	
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
