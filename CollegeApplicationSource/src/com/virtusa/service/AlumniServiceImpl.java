package com.virtusa.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.virtusa.dao.AlumniDAO;
import com.virtusa.entities.Alumni;
import com.virtusa.helper.FactoryAlumniDAO;
import com.virtusa.model.AlumniModel;

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
		alumni.setDateOfBirth(model.getDateOfBirth());
		alumni.setCourseId(model.getCourseId());
		alumni.setGender(model.getGender());
		alumni.setPresentStatus(model.getPresentStatus());
		alumni.setYearOfCompletition(model.getYearOfCompletition());
		
		String result="fail";
		try {
			boolean stored=alumniDAO.persistAlumni(alumni);
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
	public List<AlumniModel> retrieveAlumni() {
		// TODO Auto-generated method stub
		
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
				alumniModel.setCourseId(alumni.getCourseId());
				alumniModel.setDateOfBirth(alumni.getDateOfBirth());
				alumniModel.setGender(alumni.getGender());
				alumniModelList.add(alumniModel);
				
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return alumniModelList;
	}


}
