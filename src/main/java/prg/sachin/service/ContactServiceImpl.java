package prg.sachin.service;


import java.time.LocalDateTime;
import java.util.ArrayList;

import prg.sachin.dao.ContactDaoImpl;
import prg.sachin.model.ReadContentPojo;
import prg.sachin.validation.ContactValidationImpl;

public class ContactServiceImpl implements ContactService {
private String result;

@SuppressWarnings("finally")
@Override
public String contactService1(String username, String email, String message) {
	try {
		
		result=new ContactValidationImpl().contactvalidation(username, email, message);
	} catch (Exception e) {
		e.printStackTrace();
	}finally {

		return result;
	}
}

@SuppressWarnings("finally")
@Override
public String contactService2(String username, String email, String message) {
	try {
		String datetime = LocalDateTime.now().toString();
	result =new ContactDaoImpl().insertContact(username, email, message,datetime);
	
	} catch (Exception e) {
		e.printStackTrace();
		result ="error";
	}finally {
		return result;
	}
	
}

@Override
public ArrayList<ReadContentPojo> readContactService() {
	return new ContactDaoImpl().readContact();
}



}
