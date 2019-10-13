package com.virtusa.view;

import java.util.List;
import java.util.Scanner;

import com.virtusa.controller.AlumniController;
import com.virtusa.model.AlumniModel;

public class AlumniView {
public void mainMenu(){
		  
		Scanner scanner=new Scanner(System.in);
		System.out.println("1. Alumni Registraion");
		System.out.println("2. View Alumni Details ");
		System.out.print("Enter option:");
		int option=scanner.nextInt();
		AlumniView alumniview=new AlumniView();
		
		
		if(option==1)
		{
			alumniview.registerAlumniForm();
		}

		if(option==2){
	           AlumniController alumniController=new AlumniController();
	           alumniController.viewAlumni();
			}
}
			

		
		public void registerAlumniForm(){
			Scanner scanner=new Scanner(System.in);
			System.out.print("Alumni Id");
			int rollNo=scanner.nextInt();
			
			System.out.print("First Name");
			String firstName=scanner.next();
			
			System.out.print("Last Name");
			String lastName=scanner.next();
			
			System.out.print("Phone Number");
			String phoneNumber=scanner.next();
			
			System.out.print("Email");
			String email=scanner.next();
			
			System.out.print("Date of Birth");
			String dateOfBirth=scanner.next();
			
			System.out.print("Gender");
			String gender=scanner.next();
			
			System.out.print("Course Id");
			int courseId=scanner.nextInt();
			
			System.out.print("Present Status");
			String presentStatus=scanner.next();
			
			
		AlumniModel alumniModel=new AlumniModel();
			alumniModel.setCourseId(courseId);
			alumniModel.setEmail(email);
			alumniModel.setFirstName(firstName);
			alumniModel.setLastName(lastName);
		
			alumniModel.setDateOfBirth(dateOfBirth);
			alumniModel.setGender(gender);
			alumniModel.setPhoneNumber(phoneNumber);
			
			
			AlumniController alumniController=new AlumniController();
			alumniController.storeAlumni(alumniModel);
			mainMenu();
			
		}
			
			
			
			
			public void storeSuccessful(){
				
				System.out.println("Alumni registered successful");
			}
			
		    public void storeUnSuccessful(){
				
				System.out.println("Alumni registered unsuccessful");
			}
		    
		    
		    
		    public void displayalumniDetails(List<AlumniModel> alumniModel){
		    	
		    	alumniModel.forEach(System.out::println);
		    }

			
			
			
}





