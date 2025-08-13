package prg.sachin.validation;

public class ContactValidationImpl implements ContactValidation {
	private String result;
	@SuppressWarnings("finally")
	@Override
	public String contactvalidation(String username, String email, String message) {
		try {
			int namelen=username.length();
			int emaillen=email.length();
			int msglen = message.length();
			
			if(namelen<2 || namelen>30) {
				result = "invalid name length";
			}else if(emaillen <10 || emaillen >30) {
				result = "invalid email length";
			}else if(msglen<2 || msglen>100) {
				result = "invalid messagelenth";
			}else {
				result = "valid" ;
			}
		} catch (Exception e) {
			result = e.getMessage();
			e.printStackTrace();
		}finally {
			return result;
		}
		
	}
       
}
