package prg.sachin.service;

import prg.sachin.dao.AdminLoginDaoImpl;
import prg.sachin.model.ReadAdminPojo;
import prg.sachin.validation.AdminLoginValidationImpl;

public class AdminLoginServiceImpl implements AdminLoginService {
private String result;
	@SuppressWarnings("finally")
	@Override
	public String adminLoginservice1(String username, String password) {
		try {
			result=  new AdminLoginValidationImpl().adminLoginValidation(username, password);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			return result;
		}
	
	}
	
	@SuppressWarnings("finally")
	@Override
	public String adminLoginservie2(String username, String password) {
	 try {
		 result = new AdminLoginDaoImpl().readAdminLogin(username, password);
		if(result.equals("Exists")) {
			
		}
	} catch (Exception e) {
		e.printStackTrace();
		result = "Something went wrong!";
	}finally{
		return result;
	}
		
	}

@SuppressWarnings("finally")
@Override
	public ReadAdminPojo readAdminloginService() {
		ReadAdminPojo readAdmin=null;
		   try {
		   readAdmin=new AdminLoginDaoImpl().readAdminLoginData();
			} catch (Exception e) {
			e.printStackTrace();
			}finally {
				return readAdmin;
			}
	}

@SuppressWarnings("finally")
@Override
public String changeAdminCredential1(String username, String password) {
	try {
		result=new AdminLoginValidationImpl().adminLoginValidation(username, password);
	} catch (Exception e) {
		e.printStackTrace();
		result ="Something went wrong";
	}finally {
		return result;
	}
}

@SuppressWarnings("finally")
@Override
public String changeAdminCredential2(String sn, String username, String password) {
	 try {
		 int getsn=Integer.parseInt(sn);
		 result = new AdminLoginDaoImpl().changeAdminCredentialDao(getsn, username, password);
	} catch (Exception e) {
		e.printStackTrace();
		result = "Something went wrong!";
	}finally{
		return result;
	}
}

	
	

}
