package com.virtusa.controller;


import java.sql.SQLException;

import com.virtusa.helper.FactoryApplicantService;
import com.virtusa.model.ApplicantModel;
import com.virtusa.service.ApplicantService;
import com.virtusa.validation.ApplicantModelValidator;
import com.virtusa.view.ApplicantView;


public class ApplicantController {
	
	private ApplicantService applicantService;
	ApplicantView applicantView=new ApplicantView();
	public ApplicantController() {
		this.applicantService=FactoryApplicantService.createApplicantService();
	}      

	public void storeApplicant(ApplicantModel applicantModel) {
		ApplicantModelValidator applicantModelValidator = new ApplicantModelValidator();
		
		if(applicantModelValidator.validate(applicantModel)) 
		{
			String result = applicantService.storeApplicantService(applicantModel);
			if(result.contentEquals("success"))
				applicantView.applicationSuccess();
			else
				applicantView.applicationUnsuccessful();
		}
		else {
			applicantView.validationFailedError();
		}
	}
	
}
