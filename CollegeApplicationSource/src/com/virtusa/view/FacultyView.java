package com.virtusa.view;

import java.util.List;
import java.util.Scanner;

import com.virtusa.controller.FacultyController;
import com.virtusa.model.ClassScheduleModel;
import com.virtusa.model.FacultyModel;

public class FacultyView {  
		
	public void facultyMenu() {
		FacultyController facultyController = new FacultyController();
		FacultyModel facultyModel = new FacultyModel();

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
				facultyController.viewClassSchedule(facultyModel.getDepartmentName());
				break;
			case 2:
				facultyController.handleStaffMeeting(facultyModel.getFacultyId());
				break;
				
			}
		}
	}
	
	public void displayClassSchedule(List<ClassScheduleModel> model) {
		for(ClassScheduleModel classSchedule:model) {
			System.out.println(classSchedule.getDay()+" "+classSchedule.getFirstHour()+" "+classSchedule.getSecondHour()+" "+classSchedule.getThirdHour()+" "+classSchedule.getFourthHour());
		}
		
	}

	public void showStaffMeetingDetails(FacultyModel staffMeeting) {

		System.out.println("=====================================================================================================================");
		System.out.format("%10s%15s%25s%45s\n","Faculty ID","Staff Meeting ID","Staff Meeting Agenda","Location");
		System.out.println("=====================================================================================================================");
		System.out.format("%9s%12d%45s%30s\n",staffMeeting.getStaffMeetingModel().getFacultyId(),staffMeeting.getStaffMeetingModel().getStaffMeetingId(), staffMeeting.getStaffMeetingModel().getStaffMeetingAgenda(),staffMeeting.getStaffMeetingModel().getLocation());
		StudentView studentView=new StudentView();
		studentView.studentMenu();

	}


}
