package com.virtusa.controller;

import java.util.List;

import com.virtusa.helper.FactoryAlumniService;
import com.virtusa.model.AlumniModel;
import com.virtusa.service.AlumniService;
import com.virtusa.validation.AlumniModelValidator;
import com.virtusa.view.AlumniView;
  

public class AlumniController { 

	
<<<<<<< HEAD
		private AlumniService alumniService;
		public AlumniController()
		{
			this.alumniService=FactoryAlumniService.createAlumniService();
			
		}

	public void storeAlumni(AlumniModel alumniModel){
			
			boolean result=alumniService.storeAlumniService(alumniModel);
			AlumniView alumniView=new AlumniView();
			if(result){
				alumniView.storeSuccessful();
			}else{
				
				alumniView.storeUnSuccessful();
			}
			
		}

	public void viewAlumni(){
=======
	private AlumniService alumniService;       
	AlumniView alumniview=new AlumniView();
	public AlumniController(){
		this.alumniService=FactoryAlumniService.createAlumniService();
>>>>>>> branch 'master' of https://github.com/TeamCollege/CollegeApplicationSource
		
	}

	public void handleRegisterAlumni(AlumniModel model) {
		
		AlumniModelValidator validator=new AlumniModelValidator();
				
		if(validator.validate(model)) {
		
		String outcome=alumniService.registerAlumni(model);
		if(outcome.contentEquals("success")) {
			alumniview.showRegistrationSuccess();	
		}else {
			alumniview. showRegistrationUnsuccessful();
		}
	}else {
		alumniview.validationFailedError();
	}
	}

	public void handleRetrieveAlumni() {
		
		AlumniView alumniView=new AlumniView();
		List<AlumniModel> models=alumniService.retrieveAlumni();
		AlumniView alumniview=new AlumniView();
		
		
	}

		
	}




