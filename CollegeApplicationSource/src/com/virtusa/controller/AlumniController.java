package com.virtusa.controller;

import java.util.List;

import com.virtusa.helper.FactoryAlumniService;
import com.virtusa.model.AlumniModel;
import com.virtusa.service.AlumniService;
import com.virtusa.view.AlumniView;

public class AlumniController { 

	
		private AlumniService alumniService;
		public AlumniController(){
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
		
		List<AlumniModel> alumniModelList=alumniService.retrieveAlumniService();
		AlumniView alumniView=new AlumniView();
		alumniView.displayalumniDetails(alumniModelList);
	}
		
	}




