package com.virtusa.helper;

import com.virtusa.service.AlumniService;
import com.virtusa.service.AlumniServiceImpl;

public class FactoryAlumniService {
	
public static AlumniService createAlumniService(){
		
		AlumniService alumniService=new AlumniServiceImpl();
		return alumniService;
	}

  

}
       