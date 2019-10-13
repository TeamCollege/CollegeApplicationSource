package com.virtusa.view;

import java.util.Scanner;

import com.virtusa.controller.FacultyController;

public class FacultyView {
		
	public void facultyMenu() {
		System.out.println("\t\t =====Faculty View=====");
		System.out.println("1. View Class Schedule");
		System.out.println("2. View Staff Meeting Details");
		System.out.println("3. View Events");
		System.out.println("4. Upload Assignments");
		System.out.println("5. View Exam Scheduler");
		System.out.println("6. Alumni Search");
		System.out.println("7. Logout");
		System.out.println("Enter your choice:");
		
		try(Scanner scanner = new Scanner(System.in);){
			int option = scanner.nextInt();
			switch(option) {
			case 1:
				FacultyController facultyController = new FacultyController();
				facultyController.viewClassSchedule();
				
			}
		}
	}


}
