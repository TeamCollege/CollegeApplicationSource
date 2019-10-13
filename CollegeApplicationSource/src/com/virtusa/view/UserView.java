package com.virtusa.view;

import java.sql.SQLException;
import java.util.Scanner;

import com.virtusa.controller.ApplicantController;
import com.virtusa.model.ApplicantModel;

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
			default: 
				System.out.println("!ERROR[Enter an appropriate option]");
				mainMenu();
			}
		}
		catch(Exception e) {
			System.out.println("!ERROR[Enter an appropriate option]");
		}
		
		mainMenu();
		
	}
	
	public void displayCollegeDetails() {
		System.out.println(" ******************* College Details *********************");
	}
	
}
