package com.virtusa.view;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import com.virtusa.controller.AdminController;

import com.virtusa.model.FacultyModel;
import com.virtusa.model.StudentModel;

public class AdminView 
{
	Scanner scan = new Scanner(System.in);
	public void adminView()
	{
		System.out.println("\t\t =====ADMIN VIEW=====");
		System.out.println("Admin LogIn is Successful\n\n");
		System.out.println("1.Approve Applicant");
		System.out.println("2.Manage Students");
		System.out.println("3.Manage Faculty");
		System.out.println("4.Manage Events");
		System.out.println("5.Manage Course");
		System.out.println("6.Manage Placements");
		System.out.println("7.View Students");
		System.out.println("8.View Faculty");
		System.out.println("9.LogOut\n");
		System.out.println("Enter your choice");
		int choice= scan.nextInt();
		
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
			
		case 5 : manageCourse();
					break;
		
		case 6 : managePlacements();
					break;
			
		case 7 : viewStudentsData();
					break;
	
		case 8 : viewFacultyData();
					break;
					
		case 9 :
					break;
			
				
		
		}
	}

		public void approveApplicant() 
		{
			/*
			 * 1.either controller or data retrieve as model + validation
			 * 2.retrieve model from method in any service
			 * 
			 */
		
		AdminController adminController = new AdminController();
		adminController.approveApplicantController();
		
		}
		
		public void manageStudents()
		{
			System.out.println("1. Add Student");
			System.out.println("2. Delete Student");
			System.out.println("3. Update Student Details");
		
			int choice = scan.nextInt();
			AdminController adminController = new AdminController();
			StudentModel studentModel = new StudentModel();
			switch(choice)
			{
			
			case 1 :adminController.addStudentController(studentModel);
					break;
			case 2 :System.out.println("Enter Student ID:");
					int studentId = scan.nextInt();
					adminController.deleteStudentController(studentId);
					break;
			case 3 :System.out.println("Enter Student id to update:");
					int id=scan.nextInt();
					System.out.println("Enter New First name");
					String firstName = scan.next();
					adminController.updateStudentController(id, firstName);
					break;
				
			}
			
			
		}
		AdminController adminController = new AdminController();
		public void manageFaculty()
		{   
			System.out.println("1.Add Faculty");
			System.out.println("2.Delete Faculty");
			System.out.println("3.Update Faculty Details");
			int choice = scan.nextInt();
			
			FacultyModel facultyModel = new FacultyModel();
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
				
			}
			
		}
		
		public void manageEvents()
		{
			boolean flag=false;
			System.out.println("1.Add Events");
			System.out.println("2.Delete Events");
			int choice = scan.nextInt();
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
					
					
			case 2: 
					System.out.println("Enter Event ID:");
					int eventId = scan.nextInt();
					adminController.deleteEventsController(eventId);
	
			}	
		}
		
		
		public void manageCourse()
		{
			System.out.println("1.Add Course");
			System.out.println("2.Delete Course");
			int choice = scan.nextInt();
			
			switch(choice)
			{
			case 1: 
					System.out.println("Enter Course ID:");
					int id = scan.nextInt();
					System.out.println("Enter Course Name:");
					String name = scan.next();
					adminController.addCourseController(id, name);
			
			case 2: 
					System.out.println("Enter Course ID to delete");
					int courseId = scan.nextInt();
					adminController.deleteCourse(courseId);
			}		
		}
		
		
		public void managePlacements()
		{
			boolean flag=false;
			System.out.println("1.Add Placements");
			System.out.println("2.Delete Placements");
			int choice = scan.nextInt();
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
				
			case 2: Scanner scanner = new Scanner(System.in);
					System.out.println("Enter Placements ID:");
					int placementId = scanner.nextInt();
					adminController.deletePlacementController(placementId);		
			}	
		}
		
		
		
		public void viewStudentsData()
		{
			
			
		}
		
		public void viewFacultyData()
		{
			
		}
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
