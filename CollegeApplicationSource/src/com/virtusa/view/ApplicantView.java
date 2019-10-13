package com.virtusa.view;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

import com.virtusa.controller.ApplicantController;
import com.virtusa.exception.ValidationException;
import com.virtusa.model.ApplicantModel;
import com.virtusa.validation.ApplicantModelValidator;

public class ApplicantView
{

	public void applicationForm() throws ClassNotFoundException, SQLException {
		
		ApplicantModelValidator validator = new ApplicantModelValidator();
		ApplicantView applicantView = new ApplicantView();
		
		System.out.println("-------Application Form-------");
	
		try(Scanner scanner=new Scanner(System.in);){
		
		System.out.print("First Name: ");
		String firstName = scanner.next();
		boolean validFirstName=validator.validString(firstName);
		if(!validFirstName)
			try {
			throw new ValidationException("[!ERROR:Invalid First Name]");	
			}catch(ValidationException e) {
				System.out.println(e.getMessage());
				applicantView.applicationForm();
			}
		
		System.out.print("Last Name: ");
		String lastName = scanner.next();
		boolean validLastName=validator.validString(lastName);
		if(!validLastName)
			try {
			throw new ValidationException("[!ERROR:Invalid Last Name]");
			}catch(ValidationException e) {
				System.out.println(e.getMessage());
				applicantView.applicationForm();
			}
		 
		System.out.print("Email: ");
		String email = scanner.next();
		boolean validEmail=validator.validEmail(email);
		if(!validEmail)
			try {
			throw new ValidationException("[!ERROR: Invalid Email]");
			}catch(ValidationException e) {
				System.out.println(e.getMessage());
				applicantView.applicationForm();
			}
		
		System.out.print("Phone Number: ");
		String phoneNumber = scanner.next();
		boolean validPhone=validator.validPhone(phoneNumber);
		if(!validPhone)
			try {
			throw new ValidationException("[!ERROR: Invalid Phone Number]");
			}catch(ValidationException e) {
				System.out.println(e.getMessage());
				applicantView.applicationForm();
			}
		
		System.out.println("Tenth Percentage: ");
		double tenthPercentage = scanner.nextDouble();
		boolean validTenth=validator.validDouble(tenthPercentage);
		if(!validTenth)
			try {
			throw new ValidationException("[!ERROR: Invalid Tenth Percentage]");
			}catch(ValidationException e) {
				System.out.println(e.getMessage());
				applicantView.applicationForm();
			}
		
		System.out.println("Inter Percentage: ");
		double interPercentage = scanner.nextDouble();
		boolean validInter=validator.validDouble(interPercentage);
		if(!validInter)
			try {
			throw new ValidationException("[!ERROR: Invalid Inter Percentage]");
			}catch(ValidationException e) {
				System.out.println(e.getMessage());
				applicantView.applicationForm();
			}
		
		System.out.println("Enter Aadhar Number: ");
		String aadharNumber = scanner.next();
		boolean validAadhar=validator.validAadhar(aadharNumber);
		if(!validAadhar)
			try {
			throw new ValidationException("[!ERROR: Invalid Aadhar Number]");
			}catch(ValidationException e) {
				System.out.println(e.getMessage());
				applicantView.applicationForm();
			} 
		
		System.out.print("Date Of Birth (DD/MM/YYYY):");
		String dateOfBirthValidate=scanner.next();
		
		StringTokenizer tokens=new StringTokenizer(dateOfBirthValidate,"/");
		
		List<String> tokensList=new ArrayList<>();
		while(tokens.hasMoreTokens()) {
			tokensList.add(tokens.nextToken());
		}
		
		int dayOfMonth=Integer.parseInt(tokensList.get(0));
		int month=Integer.parseInt(tokensList.get(1));
		int year=Integer.parseInt(tokensList.get(2));
		try {
			LocalDate dateOfBirth=LocalDate.of(year, month, dayOfMonth);
		}
		catch (Exception e)
			{
			System.out.println(e.getMessage());
			applicantView.applicationForm();
		}
		
		System.out.print("Course Name: ");
		String courseName=scanner.next();
		
		System.out.println("Department Name (CSE,ECE,EEE): ");
		String departmentName = scanner.next();
		
		ApplicantModel applicantModel = new ApplicantModel();
		
		applicantModel.setFirstName(firstName);
		applicantModel.setLastName(lastName);
		applicantModel.setEmail(email);
		applicantModel.setPhoneNumber(phoneNumber);
		applicantModel.setTenthPercentage(tenthPercentage);
		applicantModel.setInterPercentage(interPercentage);
		applicantModel.setAadharNumber(aadharNumber);
		applicantModel.setCourseName(courseName);
		applicantModel.setDepartmentName(departmentName);
		
		ApplicantController applicantController = new ApplicantController();
		applicantController.storeApplicant(applicantModel);
		UserView.mainMenu();
	}
	catch(Exception e) {
		System.out.println(e);
	}
		
	}
	
	public void applicationSuccess() {
		System.out.println("Applied successfully!");
	}
	
	public void applicationUnsuccessful() {
		System.out.println("Application unsuccessful");
	}
	
	public void validationFailedError() {
		System.out.println("Data entered is not valid");
		
	}
}
