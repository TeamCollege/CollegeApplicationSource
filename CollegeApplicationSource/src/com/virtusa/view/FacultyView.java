package com.virtusa.view;

import java.util.List;
import java.util.Scanner;

import com.virtusa.controller.FacultyController;
import com.virtusa.model.ClassScheduleModel;
import com.virtusa.model.FacultyModel;
import com.virtusa.model.UploadDownloadAssignmentsModel;

public class FacultyView {  
		


	
	public void facultyMenu() {


		FacultyModel facultyModel = new FacultyModel();
	     
		FacultyController facultyController = new FacultyController();
		System.out.println("\t\t =====Faculty View=====");
		System.out.println("1. View Class Schedule");
		System.out.println("2. View Staff Meeting Details");
		System.out.println("3. View Events");
		System.out.println("4. Upload and Download Assignments");
		System.out.println("5. View Exam Scheduler");
		System.out.println("6. Alumni Search");
		System.out.println("7. Logout");
		System.out.println("Enter your choice:");
		
		try(Scanner scanner = new Scanner(System.in);){
			int option = scanner.nextInt();
			switch(option) {
			case 1:
				//System.out.println(facultyModel.getDepartmentName());
				System.out.println("Enter department name(cse/ece/eee): ");
				String departmentName = scanner.next().toLowerCase();
				facultyController.viewClassSchedule(departmentName);
				break;
			case 2:
				facultyController.handleStaffMeeting(facultyModel.getFacultyId());
				break;
			case 4: 
				uploadDownloadMenu();
				break;
			default:
				System.out.println("!ERROR[Enter an appropriate option]");
				facultyMenu();
			}
		}
		catch(Exception e) {
			System.out.println("!ERROR[Enter an appropriate option]");
		}
	}
	
	private void uploadDownloadMenu() {
		FacultyController facultyController = new FacultyController();

		System.out.println("=====Upload and Download Assignments=====");
		System.out.println("1. Upload Assignment");
		System.out.println("2. Download Assignment");
		System.out.println("Enter your choice: ");
		try(Scanner scanner = new Scanner(System.in);){
			int option = scanner.nextInt();
			switch(option) {
			case 1:
				viewUploadDownload();
				break;
			case 2:
				System.out.print("File Id:");
				int fileId=scanner.nextInt();
				//facultyController.handleDownloadAssignments(fileId);
				break;
			default:
				System.out.println("!ERROR[Enter an appropriate option]");
				//facultyMenu();
			}
		}
		catch(Exception e) {
			System.out.println("!ERROR[Enter an appropriate option]");
		}
				
	}

	private void viewUploadDownload() {
		FacultyController facultyController = new FacultyController();
		Scanner scanner = new Scanner(System.in);
		System.out.print("File Name:");
		String fileName=scanner.next();
		System.out.print("File path:");
		String path=scanner.next();
		UploadDownloadAssignmentsModel uploadDownloadAssignmentsModel = new UploadDownloadAssignmentsModel();
		uploadDownloadAssignmentsModel.setFileName(fileName);
		uploadDownloadAssignmentsModel.setPath(path);
		facultyController.handleUploadAssignments(uploadDownloadAssignmentsModel);		
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

	public void uploadSuccess() {
		System.out.println("File uploaded successfully");
	}

	public void uploadUnsuccessful() {
		System.out.println("File upload unsuccessful");
		
	}


}
