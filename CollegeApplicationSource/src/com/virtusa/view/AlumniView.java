package com.virtusa.view;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

import com.virtusa.controller.AlumniController;

import com.virtusa.exception.ValidationException;
import com.virtusa.model.AlumniModel;

import com.virtusa.validation.AlumniModelValidator;


public class AlumniView {
		  
		public void alumniMenu() {
			System.out.println("\t\t =====ALUMNI VIEW=====");
			System.out.println("1.Alumni Registration Form");
			System.out.println("2.View Alumni Details");
			System.out.println("3.Exit");
			System.out.println("Enter your choice:");
			
			try(Scanner sc=new Scanner(System.in);){  
				int choice=sc.nextInt();
				
			
			switch(choice) {
			  
			case 1:registrationForm();
			       break;
			case 2:
				
				viewAlumniDetails();
				break;
			case 3:System.exit(0);
			break;
			default:System.out.println("[SELECT APPROPRIATE OPTION]");
			alumniMenu();
		}
		}catch(Exception e) {
			System.out.println("!ERROR[SELECT APPROPRIATE OPTION]");
		}
	}
			
/*private void viewAlumniDetails() {
	// TODO Auto-generated method stub
		
		AlumniController alumniController =new AlumniController();
		alumniController.handleRetrieveAlumni();
	}*/
	
		
	

	private void registrationForm() {
		// TODO Auto-generated method stub
		
			AlumniModelValidator validator = new AlumniModelValidator();
			AlumniView alumniView = new AlumniView();
			
			System.out.println("-------Registration Form-------");
		
			try(Scanner scanner=new Scanner(System.in);){
			
			System.out.print("First Name: ");
			String firstName = scanner.next();
			boolean validFirstName=validator.validString(firstName);
			if(!validFirstName)
				try {
				throw new ValidationException("[!ERROR:Invalid First Name]");	
				}catch(ValidationException e) {
					System.out.println(e.getMessage());
					alumniView.registrationForm();
				}
			
			System.out.print("Last Name: ");
			String lastName = scanner.next();
			boolean validLastName=validator.validString(lastName);
			if(!validLastName)
				try {
				throw new ValidationException("[!ERROR:Invalid Last Name]");
				}catch(ValidationException e) {
					System.out.println(e.getMessage());
					alumniView.registrationForm();
				}
			
			System.out.print("Alumni Id:");
			int alumniId=scanner.nextInt();
			boolean validAlumniId=validator.validNumber(alumniId);
			if(!validAlumniId)
				try {
				throw new ValidationException("[!ERROR:Invalid AlumniId]");
				}catch(ValidationException e) {
					System.out.println(e.getMessage());
					alumniView.registrationForm();
				}
			 
			System.out.print("Email: ");
			String email = scanner.next();
			boolean validEmail=validator.validEmail(email);
			if(!validEmail)
				try {
				throw new ValidationException("[!ERROR: Invalid Email]");
				}catch(ValidationException e) {
					System.out.println(e.getMessage());
					alumniView.registrationForm();
				}
			
			System.out.print("Phone Number: ");
			String phoneNumber = scanner.next();
			boolean validPhone=validator.validPhone(phoneNumber);
			if(!validPhone)
				try {
				throw new ValidationException("[!ERROR: Invalid Phone Number]");
				}catch(ValidationException e) {
					System.out.println(e.getMessage());
					alumniView.registrationForm();
				}
			
			
			System.out.print("Gender(Female/Male):");
			String gender=scanner.next();
			
			boolean validgender=validator.validGender(gender);
			if(!validgender)
				try {
				throw new ValidationException("[!ERROR:Invalid Gender]");
				}catch(ValidationException er) {
					System.out.println(er.getMessage());
					alumniView.registrationForm();
				}
			
			System.out.print("Present Status(Employed/Higher Studies):");
			String presentStatus=scanner.next();
			
			boolean validpresentStatus=validator.validPresentStatus(presentStatus);
			if(!validpresentStatus)
				try {
				throw new ValidationException("[!ERROR:Invalid Present Status]");
				}catch(ValidationException er) {
					System.out.println(er.getMessage());
					alumniView.registrationForm();
				}
			
			System.out.print("Year of Completition");
			int yearOfCompletition=scanner.nextInt();
			boolean validyearOfCompletition=validator.validNumber(yearOfCompletition);
			if(!validyearOfCompletition)
				try {
				throw new ValidationException("[!ERROR:Invalid Year Of Completition]");
				}catch(ValidationException er) {
					System.out.println(er.getMessage());
					alumniView.registrationForm();
				}
						
			
			
			AlumniModel alumniModel = new AlumniModel();
			
			alumniModel.setFirstName(firstName);
			alumniModel.setLastName(lastName);
			alumniModel.setAlumniId(alumniId);
			alumniModel.setEmail(email);
			alumniModel.setPhoneNumber(phoneNumber);
			alumniModel.setGender(gender);
			alumniModel.setPresentStatus(presentStatus);
			alumniModel.setYearOfCompletition(yearOfCompletition);
			
			AlumniController alumniController = new AlumniController();
			alumniController.handleRegisterAlumni(alumniModel);
			UserView.mainMenu();
				}
			}
		
	public void viewAlumniDetails() {
		  AlumniController alumniController=new AlumniController();

		  try(Scanner scanner=new Scanner(System.in);){
			  System.out.print("Please Enter Alumni Name:");
			  String firstName=scanner.next();
		      alumniController.handleRetrieveAlumniDetails(firstName);
			  
			  
		  }catch(Exception e) {
			  e.printStackTrace();
		  }
	       
		
	}
	
	public void showRegistrationSuccess() {
		System.out.println("Register successfully!");
	}
	
	public void showRegistrationUnsuccessful() {
		System.out.println("Registration unsuccessful");
	}
	
	public void validationFailedError() {
		System.out.println("Data entered is not valid");
		
	}
public void showAlumniDetails(AlumniModel model) {
		
		System.out.println("\n ------- Alumni Details-------");
		System.out.println("Alumni Id:"       +model.getAlumniId());
		System.out.println("First Name:"      +model.getFirstName());
		System.out.println("Last Name:"       +model.getLastName());
		System.out.println("Phone Number:"    +model.getPhoneNumber());
		System.out.println("Email Id:"        +model.getEmail());
		System.out.println("Gender:"          +model.getGender());
		System.out.println("Present Status:"  +model.getPresentStatus());
		System.out.println("Year Of Completition:"+model.getYearOfCompletition());
		
		alumniMenu();
	}
}

		
		
	

	






