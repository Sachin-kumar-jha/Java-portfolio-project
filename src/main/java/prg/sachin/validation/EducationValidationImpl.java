package prg.sachin.validation;

public class EducationValidationImpl implements EducationValidation {
 private String result;
	@SuppressWarnings("finally")
	@Override
	public String educationValidation(int year, String title, String subtitle, String desc) {
	  
	    try {
	       

	        // --- Title Validation ---
	        if (title == null || title.trim().isEmpty()) {
	            return "Title is required!";
	        }
	        else if(year<1900) {
	        	result ="Year is not allowed";
	        }
	        else if (title.length() >100) {
	            result= "Title must not exceed 100 characters!";
	        }

	        // --- Subtitle Validation ---
	        else if (subtitle == null || subtitle.trim().isEmpty()) {
	            result= "Subtitle is required!";
	        }
	        else if (subtitle.length() > 100) {
	            result= "Subtitle must not exceed 100 characters!";
	        }

	        // --- Description Validation ---
	        else  if (desc == null || desc.trim().isEmpty()) {
	            result= "Description is required!";
	        }
	        else  if (desc.length() > 250) {
	        	result= "Description must not exceed 200 characters!";
	        }else {
	        	result="valid";
	        }

	    } catch (Exception e) {
	        e.printStackTrace();
	        result = "Something went wrong!";
	    } finally {
	        return result;
	    }
	}


}
