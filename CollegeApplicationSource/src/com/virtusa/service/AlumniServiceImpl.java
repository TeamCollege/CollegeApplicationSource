package com.virtusa.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.virtusa.dao.AlumniDAO;
import com.virtusa.entities.Alumni;
import com.virtusa.entities.Departments;
import com.virtusa.helper.FactoryAlumniDAO;
import com.virtusa.model.AlumniModel;
import com.virtusa.model.DepartmentsModel;



public class AlumniServiceImpl implements AlumniService {
	
	private AlumniDAO alumniDAO;
	public AlumniServiceImpl(){
		this.alumniDAO=FactoryAlumniDAO.createAlumniDAO();
		}
	
	@Override    
	public String registerAlumni(AlumniModel model) {
		// TODO Auto-generated method stub 
		
		Alumni alumni=new Alumni();
		alumni.setAlumniId(model.getAlumniId());
		alumni.setFirstName(model.getFirstName());
		alumni.setLastName(model.getLastName());
		alumni.setEmailAddress(model.getEmail());
		alumni.setPhoneNumber(model.getPhoneNumber());
		alumni.setGender(model.getGender());
		alumni.setPresentStatus(model.getPresentStatus());
		alumni.setYearOfCompletition(model.getYearOfCompletition());
		
		String result="fail";
		try {
			boolean stored=alumniDAO.registerAlumni(alumni);
			if(stored)
				result="success";
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("!ERROR[Registration failed because of internal issues...]");
		}
		return result;
		
	}
	
	
	@Override
	public AlumniModel retrieveAlumniDetails(String firstName) { 
		// TODO Auto-generated method stub
		
		Alumni alumni=null;
		AlumniModel alumniModel=new AlumniModel();
		try {
				alumni=alumniDAO.getAlumniDetails(firstName);
				alumniModel.setAlumniId(alumni.getAlumniId());
				alumniModel.setFirstName(alumni.getFirstName());
				alumniModel.setLastName(alumni.getLastName());
				alumniModel.setPresentStatus(alumni.getPresentStatus());				
				alumniModel.setPhoneNumber(alumni.getPhoneNumber());
				alumniModel.setEmail(alumni.getEmailAddress());
				alumniModel.setGender(alumni.getGender());
				alumniModel.setYearOfCompletition(alumni.getYearOfCompletition());
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return alumniModel;
}
				
	
			
		
	@Override
	public List<AlumniModel> retrieveAlumni() {

		List<AlumniModel> alumniModelList=new ArrayList<>();
		try {
			List<Alumni> alumniList=alumniDAO.getAlumni();
			for(Alumni alumni:alumniList) {
				AlumniModel alumniModel=new AlumniModel();
				alumniModel.setAlumniId(alumni.getAlumniId());
				alumniModel.setFirstName(alumni.getFirstName());
				alumniModel.setLastName(alumni.getLastName());
				alumniModel.setPresentStatus(alumni.getPresentStatus());				
				alumniModel.setPhoneNumber(alumni.getPhoneNumber());
				alumniModel.setEmail(alumni.getEmailAddress());
				alumniModel.setGender(alumni.getGender());
				alumniModelList.add(alumniModel);
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("!ERROR[Retrieval of Departments failed!!!]");
		}
		return alumniModelList;
	}

}



