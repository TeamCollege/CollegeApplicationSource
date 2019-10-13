package com.virtusa.view;

import java.util.Scanner;

import com.virtusa.controller.AdminController;
import com.virtusa.dao.ApplicantDAOImpl;

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
			
		case 4 :
					break;
			
		case 5 : 
					break;
		
		case 6 :
					break;
			
		case 7 : 
					break;
	
		case 8 :
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
			switch(choice)
			{
			case 1 :adminController.addStudentController();
					break;
			case 2 :adminController.deleteStudentController();
					break;
			case 3 :
					break;
				
			}
			
			
		}
		public void manageFaculty()
		{
			System.out.println("1.Add Faculty");
			System.out.println("2.Delete Faculty");
			System.out.println("3.Update Faculty Details");
			int choice = scan.nextInt();
			AdminController adminController = new AdminController();
			switch(choice)
			{
			case 1 : adminController.addFacultyController();
					break;
			case 2 : adminController.deleteFacultyController();
					break;
			case 3 :
					break;
				
			}
			
		}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
