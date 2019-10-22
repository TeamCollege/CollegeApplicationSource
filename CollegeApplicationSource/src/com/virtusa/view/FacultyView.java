package com.virtusa.view;

import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

import com.virtusa.controller.FacultyController;
import com.virtusa.controller.StudentController;
import com.virtusa.model.ClassScheduleModel;
import com.virtusa.model.FacultyModel;
import com.virtusa.model.StudentModel;
import com.virtusa.model.UploadDownloadAssignmentsModel;

public class FacultyView {  
	
	Logger log = Logger.getLogger(FacultyView.class.getName());
	
	public void facultyMenu() {
		
		log.info("This is Faculty Menu ");

		FacultyModel facultyModel = new FacultyModel();
	     
		FacultyController facultyController = new FacultyController();
		System.out.println("\t\t =====Faculty View=====");
		System.out.println("1. View Class Schedule");
		System.out.println("2. View Staff Meeting Details");
		//System.out.println("3. View Events");
		System.out.println("3. Upload and Download Assignments");
		System.out.println("4. View Exam Schedule");
		//System.out.println("5. Alumni Search");
		System.out.println("5. Logout");
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
				System.out.println("Enter department name(cse/ece/eee): ");
				String departmentName1 = scanner.next().toLowerCase();
				facultyController.handleStaffMeeting(departmentName1);
				break;
			case 3: 
				uploadDownloadMenu();
				break;
			case 4:
				viewExaminationSchedule();
				break;
			case 5:
				System.exit(0);
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
		
		log.info("---Upload Download Menu---");
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
		log.info("--- View Upload Download");
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
		FacultyView facultyView = new FacultyView();
		facultyView.facultyMenu();
	}

	public void displayClassSchedule(List<ClassScheduleModel> model) {
		log.info("---Display Class Schedule---");
		System.out.println("=====================================================================================================================================================");
		System.out.format("%10s%15s%25s%45s%50s\n","Day","First Hour","Second Hour","Third Hour","Fourth_Hour");
		System.out.println("=====================================================================================================================================================");
		for(ClassScheduleModel classSchedule:model) {
			//System.out.format("%9s%12d%45s%30s%55s\n",classSchedule.getDay(), classSchedule.getFirstHour(), classSchedule.getSecondHour(), classSchedule.getThirdHour(), classSchedule.getFourthHour());

			System.out.println(""+classSchedule.getDay()+"\t\t "+classSchedule.getFirstHour()+"\t\t\t "+classSchedule.getSecondHour()+"\t\t\t\t\t "+classSchedule.getThirdHour()+"\t\t\t\t\t\t "+classSchedule.getFourthHour());
		}
		FacultyView facultyView = new FacultyView();
		facultyView.facultyMenu();
		
	}

	public void showStaffMeetingDetails(FacultyModel staffMeeting) {
		log.info("---Staff Meeting Details---");
		System.out.println("=====================================================================================================================");
		System.out.format("%10s%15s%25s%45s\n","Faculty ID","Staff Meeting ID","Staff Meeting Agenda","Location");
		System.out.println("=====================================================================================================================");
		System.out.format("%9s%12d%45s%30s\n",staffMeeting.getStaffMeetingModel().getFacultyId(),staffMeeting.getStaffMeetingModel().getStaffMeetingId(), staffMeeting.getStaffMeetingModel().getStaffMeetingAgenda(),staffMeeting.getStaffMeetingModel().getLocation());
		FacultyView facultyView = new FacultyView();
		facultyView.facultyMenu();
	}
	
	private void viewExaminationSchedule() {
		log.info("---View Examination Schedule---");
		FacultyController facultyController =new FacultyController();
		try(Scanner scanner=new Scanner(System.in);){
		System.out.println("Please Enter Department Name:");
		String departmentName=scanner.nextLine();
		facultyController.retrieveExaminationSchedule(departmentName);
	}catch(Exception e) {
		e.printStackTrace();
	}			 
	}
	
	public void showExamSchedule(FacultyModel faculty) {
		log.info("---Show Examination Schedule---");		
		System.out.println("=====================================================================================================================");
		System.out.format("%10s%15s%15s%15s%15s\n","id","type","name","date","subject1","subject2");
		//System.out.printf("Day","First Hour","Second Hour","Third Hour","Fourth Hour");
		System.out.println("=====================================================================================================================");
		System.out.format("%10s%15s%15s%15s%15s\n",faculty.getExamScheduleModel().getExamId(),faculty.getExamScheduleModel().getExamType(),faculty.getExamScheduleModel().getExamName(),faculty.getExamScheduleModel().getExamDate(),faculty.getExamScheduleModel().getExamSubject1(),faculty.getExamScheduleModel().getExamSubject2());
		FacultyView facultyView=new FacultyView();
		facultyView.facultyMenu();
		
	}

	public void uploadSuccess() {
		log.info("---Upload Successful---");
		System.out.println("File uploaded successfully");
		FacultyView facultyView = new FacultyView();
		facultyView.facultyMenu();
	}

	public void uploadUnsuccessful() {
		log.info("---Upload Unsuccessful---");
		System.out.println("File upload unsuccessful");
		FacultyView facultyView = new FacultyView();
		facultyView.facultyMenu();
		
	}


}
