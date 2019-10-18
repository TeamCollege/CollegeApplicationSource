package com.virtusa.controller;

import java.sql.SQLException;

import com.virtusa.exception.UserException;
import com.virtusa.helper.FactoryLoginDB;
import com.virtusa.model.LoginModel;
import com.virtusa.service.LoginService;
import com.virtusa.view.AdminView;
import com.virtusa.view.AlumniView;
import com.virtusa.view.ErrorView;
import com.virtusa.view.FacultyView;
import com.virtusa.view.StudentView;


public class LoginController {
	private LoginService loginService;

	
	public LoginController() {
		this.loginService=
				FactoryLoginDB.createLoginService();
	}

	public void userAuthentication(String userId, String password) throws ClassNotFoundException,SQLException  {
		// TODO Auto-generated method stub
		
		LoginModel loginModel=new LoginModel();
		loginModel.setUserId(userId);
		loginModel.setPassword(password);
		//System.out.println("fgsffsd");
		
		try {
			String outcome=loginService.userAuthenticationService(loginModel);
			if(outcome.contentEquals("ADMIN")){
				AdminView adminView=new AdminView();
				adminView.adminView();
			}
			else if(outcome.contentEquals("STUDENT")) {
				StudentView studentView=new StudentView();
				studentView.studentMenu();
			}
			else if(outcome.contentEquals("FACULTY")) {
				FacultyView facultyView=new FacultyView();
				facultyView.facultyMenu();
				//System.out.println("sadsfa");
			}
			else if(outcome.contentEquals("ALUMNI")) {
				AlumniView alumniView=new AlumniView();
				alumniView.alumniMenu();
			}else {
				ErrorView errorView=new ErrorView();
				errorView.authenticationError();
			}
		
	}catch(UserException e) {
		System.out.println("User Authentication failed.");
	}
	}
}
