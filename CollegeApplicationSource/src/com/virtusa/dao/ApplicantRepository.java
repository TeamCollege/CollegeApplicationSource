package com.virtusa.dao;

import java.util.ArrayList;
import java.util.List;

import com.virtusa.entities.Applicant;

public class ApplicantRepository {
	
	private static List<Applicant> applicants=new ArrayList<Applicant>();

	public static boolean add(Applicant applicant) {
		return applicants.add(applicant);
	}

	public static List<Applicant> get() {
		return applicants;
	}

}      
