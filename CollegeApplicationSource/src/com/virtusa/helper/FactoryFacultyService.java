package com.virtusa.helper;

import com.virtusa.service.FacultyService;
import com.virtusa.service.FacultyServiceImpl;

public class FactoryFacultyService {

	public static FacultyService createApplicantService() {
		FacultyService facultyService=new FacultyServiceImpl();
		return facultyService;
	} 

}
