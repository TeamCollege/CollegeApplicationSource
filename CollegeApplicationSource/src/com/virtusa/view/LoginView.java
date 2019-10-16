package com.virtusa.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

import com.virtusa.controller.LoginController;



public class LoginView {
	
	public void loginMenu() throws ClassNotFoundException, SQLException{
	
		
		try(
				InputStreamReader reader=
				new InputStreamReader(System.in);
					BufferedReader buffer=new BufferedReader(reader);
					
		     ){
				System.out.println("***************************");	
				System.out.print("Enter User ID:");
				String userId=buffer.readLine().trim();
				
				System.out.print("Enter Password:");
				String password=buffer.readLine().trim();
				System.out.println("***************************");
				
				LoginController controller=new LoginController();
				controller.userAuthentication(userId,password);
				
				
			}catch(IOException e) {
				e.printStackTrace();
			
	} }
}
