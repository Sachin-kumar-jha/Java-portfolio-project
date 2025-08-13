package prg.sachin.service;

import javax.servlet.http.Part;

import prg.sachin.fileIo.UploadResumeIoImpl;
import prg.sachin.validation.UploadProjectValidationImpl;

public class UploadResumeServiceImpl implements UploadResumeService {
private String result;
private boolean boolresult;
	@Override
	public String uploadResumeService(Part part,String realPath) {
		
	  result=	new UploadProjectValidationImpl().resumeValidation(part);
	
  if(result.equals("valid")) {
		  try {
				 boolresult = new UploadResumeIoImpl().isExist(realPath);
				
	           if(boolresult) {
	        	   //Update:Delete then write
	     
	        	   boolresult = new UploadResumeIoImpl().deleteResume(part,realPath);
	        	   
	        	   if(boolresult) {
	        		   this.result = new UploadResumeIoImpl().writeResume(part,realPath);   
	        	   }
	           }else {
	        	   //Insert : Write   
	        	   result = new UploadResumeIoImpl().writeResume(part,realPath);   
	           }
			} catch (Exception e) {
				e.printStackTrace();
				result="Service Error";
			}
	  }else {
		  result="someting went wrong";
	  }
		return this.result;
	
	}

}
