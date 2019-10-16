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
				break;
			
			case 2:
				ApplicantView applicantView = new ApplicantView();
				applicantView.applicationForm();
				break;
				
			case 3: 
				LoginView loginView=new LoginView();
				loginView.loginMenu();
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
	
	public void displayCollegeDetails() {
		System.out.println(" ******************* College Details *********************");
	}
	
}
