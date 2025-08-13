package prg.sachin.validation;

import javax.servlet.http.Part;

public class UploadProjectValidationImpl implements UploadProjectValidation {
private String result;
	@SuppressWarnings("finally")
	@Override
	public String projectValidation(Part part) {
	 try {
		/*
		 * 1MB = 1024kb
		 * 1kb = 1024 byte
		 * 1MB = 1024*1024 = 1,048,576
		 * */
		 long size = part.getSize();
		 String contentType = part.getContentType();
		
		 if(!contentType.startsWith("image")) {
			 result="invalid formate";
		 }else if(size>1048576){
			 result="file size exceeded";
		 }else {
			 result = "valid";
		 }
		 
		 
	} catch (Exception e) {
		e.printStackTrace();
		result ="something went wrong";
	}finally {
		return result;
	}
	}
	@SuppressWarnings("finally")
	@Override
	public String resumeValidation(Part part) {
		try {
			/*
			 * 1MB = 1024kb
			 * 1kb = 1024 byte
			 * 1MB = 1024*1024 = 1,048,576
			 * */
			 long size = part.getSize();
			 String contentType = part.getContentType();
			
			 if(!contentType.equals("application/pdf")) {
				 result="invalid formate must be a pdf";
			 }else if(size>1048576){
				 result="file size exceeded";
			 }else {
				 result = "valid";
			 }
			 
		} catch (Exception e) {
			e.printStackTrace();
			result ="something went wrong";
		}finally {
			return result;
		}
	}

}
