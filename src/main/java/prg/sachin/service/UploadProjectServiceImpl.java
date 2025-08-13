package prg.sachin.service;

import java.sql.Connection;
import java.time.LocalDateTime;

import javax.servlet.http.Part;

import prg.sachin.dao.ConnectionFactory;
import prg.sachin.dao.UploadProjectDaoImpl;
import prg.sachin.fileIo.ProjectIoImpl;
import prg.sachin.validation.UploadProjectValidationImpl;

public class UploadProjectServiceImpl implements UploadProjectService {
   private String result;
	@SuppressWarnings("finally")
	@Override
	public String uploadProjectService1(Part part) {
	try {
		//Validation
	result =new UploadProjectValidationImpl().projectValidation(part);
	} catch (Exception e) {
		e.printStackTrace();
	}finally{
		return result ;
	}
	}
	@SuppressWarnings("finally")
	@Override
	public String uploadProjectService2(Part part, String datetime,String realPath) {
		
		try {
			//for unique name generation of file 
			
			String getDatetime=LocalDateTime.now().toString();
			String filename = part.getSubmittedFileName();
			//Removing collen and any other seperator to prevent exception happening
			String []split =getDatetime.split(":");
			String formatedDatetime = split[0]+split[1]+split[2];
			String formatedFilename = formatedDatetime+filename;
			
			
			
			
			
			
		//2025-08-03T22:43:16.539679600===sachin.jpg
			
//FIleOutputStream(path)
//path = C:\Users\Sachin Jha\Desktop\j2eeWorkspace\Portfolio-java\src\main\webapp\myphoto
			
			
			//Go to dao to store metadata of user
			Connection con= ConnectionFactory.getConnection();
			con.setAutoCommit(false);
			
			result = new UploadProjectDaoImpl().insertProject(formatedFilename, formatedDatetime, con);
			
			if(result.equals("saved")) {
				//Then do for photo store in folder 
				//Do FileIo Work
				boolean result= new ProjectIoImpl().writeProject(part, formatedFilename,realPath);
				if(result) {
					con.commit();
					this.result="Project Uploaded Successfully!";
				}else {
					con.rollback();
					this.result="failed";
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			this.result="Something went wrong!";
		}finally {
			return result;
		}
		

	}

}
