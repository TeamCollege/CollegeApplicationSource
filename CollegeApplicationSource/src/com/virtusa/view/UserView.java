package com.virtusa.view;

import java.util.Scanner;

public class UserView
{
	public static void mainMenu() { 
		System.out.println("			**********Welcome!**********		");
		System.out.println("1. College Details");
		System.out.println("2. Admissions");
		System.out.println("3. Login");
		System.out.println("4. Alumni Registration");
		System.out.println("5. Feedback");
		System.out.println("Enter option: ");		
		UserView userView = new UserView(); 
		   
		try(Scanner scanner = new Scanner(System.in);){
			int option = scanner.nextInt();
			switch(option) {
			case 1: 
				userView.displayCollegeDetails();
				mainMenu();
				break;
			
			case 2:
				ApplicantView applicantView = new ApplicantView();
				applicantView.applicationForm();
				break;
				
			case 3: 
				System.out.println("abc");
				LoginView loginView=new LoginView();
				loginView.loginMenu();
				System.out.println("going in");
				break;
				
			case 4:AlumniView alumniView=new AlumniView();
					alumniView.alumniMenu();
					break;
				
			default: 
				//System.out.println("abc");
				System.out.println("!ERROR[Enter an appropriate option]");
				mainMenu();
				
			
			}
		}
		catch(Exception e) {
			System.out.println("!ERROR[Enter an appropriate option]");
			//System.out.println("abcdef");
		}
		
		//mainMenu();
		
	}
	
	public void displayCollegeDetails()
	{
		System.out.println(" ******************* College Details *********************");
		System.out.println("Welcome to your College");
		System.out.println("Courses Offered: Engineering(CSE,ECE,EEE)");
		System.out.println("Courses Duration: 4 Years");
		System.out.println("Fee Structure:1.25L/Year");
		System.out.println("NAAC A+ Grade College");
		System.out.println("24/7 Free access to digital library");
		System.out.println("Free bus serviceses");
		System.out.println("100% Placement (or) your 4years fee will be returned");
		
		
	}
	
}
