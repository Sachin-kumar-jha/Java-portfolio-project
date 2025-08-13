package prg.sachin.validation;

public class AdminLoginValidationImpl implements AdminLoginValidation {
private String result;
	@SuppressWarnings("finally")
	@Override
	public String adminLoginValidation(String username, String password) {
	try {
		int userlen = username.length();
		int passlen = password.length();
		
	if(userlen<6 || userlen>12) {
		result = "invalid username";
	}else if(passlen <8 || passlen >16 ) {
		result = "invalid password";
	}else {
		result = "valid";
	}
	} catch (Exception e) {
		e.printStackTrace();
		result = "something went wrong";
	}finally {
		return result;
	}
	}

}
