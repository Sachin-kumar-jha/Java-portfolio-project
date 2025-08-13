package prg.sachin.service;

import java.util.ArrayList;

import prg.sachin.dao.AddEducationDaoImpl;
import prg.sachin.model.ReadEducationPojo;
import prg.sachin.validation.EducationValidationImpl;

public class AddEducationServiceImpl implements AddEducationService {
	private String result;
	@SuppressWarnings("finally")
	@Override
	public String addEducationService(int year, String title, String subtitle, String desc) {
		try {
			/*Validation*/
			
		result = new EducationValidationImpl().educationValidation(year, title, subtitle, desc);
			
		} catch (Exception e) {
			e.printStackTrace();
			result="Something went wrong";
		}finally {
			return result;
		}
		
	}
	@SuppressWarnings("finally")
	@Override
	public String addEducationService2(int year, String title, String subtitle, String desc) {
		try {
			/* SEND TO DAO LAYER TO STORE IN DATABASE*/
			result = new AddEducationDaoImpl().addeduationDao(year, title, subtitle, desc);
		} catch (Exception e) {
			e.printStackTrace();
			this.result="something went wrong";
		}finally {
			return result;
		}
	}
	@Override
	public ArrayList<ReadEducationPojo> readEducationService() {
	return new AddEducationDaoImpl().readEducation();
	}

}
