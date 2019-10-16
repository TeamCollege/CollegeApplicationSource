package com.virtusa.view;

import java.util.List;
import java.util.Scanner;

import com.virtusa.controller.StudentController;
import com.virtusa.model.ClassScheduleModel;
import com.virtusa.model.StudentModel;

public class StudentView {
	
	
	public void studentMenu() {
		System.out.println("\t\t ======================STUDENT VIEW=======================");
		System.out.println("1.View Class Schedule");
		System.out.println("2.View Examination Schedule");
		System.out.println("3.View Results");
		System.out.println("4.View Assignments");
		System.out.println("5.View Placement Calender");
		System.out.println("6.General Exams");
		System.out.println("7.Exit");
		System.out.println("Enter your choice:");
		
		
		try(Scanner sc=new Scanner(System.in);){
		int choice=sc.nextInt();
		
		switch(choice) {
		
		case 1:viewClassSchedule();
			break;
		case 2:viewExaminationSchedule();
			break;
		case 3:viewResults();
			break;
		case 4:viewAssignments();
			break;
		case 5:viewPlacementCalender();
			break;
		case 6:viewGeneralExams();
			break;
		case 7:UserView userView=new UserView();
				userView.mainMenu();
				break;
		default:System.out.println("[SELECT APPROPRIATE OPTION]");
			studentMenu();
		}
		}catch(Exception e) {
			System.out.println("!ERROR[SELECT APPROPRIATE OPTION]");
		}
	}
	
	//12.10.19
	public void viewClassSchedule() {
		StudentController studentController =new StudentController();
		try(Scanner scanner=new Scanner(System.in);){
		//System.out.println("Please Enter Department Name:");
		//String departmentName=scanner.nextLine();
		StudentModel studentModel=new StudentModel();
		studentController.retrieveClassSchedule(studentModel.getDepartmentName());
	}catch(Exception e) {
		e.printStackTrace();
	}	
	}
	
	public void showClassSchedule(StudentModel students) {
	System.out.println("=====================================================================================================================");
	System.out.format("%10s%15s%15s%15s%15s \n","Day", "10:00-11:00",  "11:00-12:00", "1:00-2:00", "2:00-3:00");
	System.out.println("=====================================================================================================================");
	System.out.format("%10s%15s%15s%15s%15s \n",students.getClassScheduleModel().getDay(),students.getClassScheduleModel().getFirstHour(),students.getClassScheduleModel().getSecondHour(),students.getClassScheduleModel().getThirdHour(),students.getClassScheduleModel().getFourthHour());
	System.out.println("----------------------------------------------------------------------------------------------------------------------");
	System.out.println("\n");
	StudentView studentView=new StudentView();
	studentView.studentMenu();
	}
	
	public void viewExaminationSchedule() {
		StudentController studentController =new StudentController();
		studentController.retrieveExaminationSchedule();
	}
	

	public void viewResults() {
		StudentController studentController =new StudentController();
		studentController.retrieveResults();
	}
	public void viewAssignments() {
		StudentController studentController =new StudentController();
		studentController.retrieveAssignments();
	}
	public void viewPlacementCalender() {
		StudentController studentController =new StudentController();
		studentController.retrievePlacementCalender();
	}
	public void viewGeneralExams() {
		StudentController studentController =new StudentController();
		studentController.retrieveGeneralExams();
	}
}
