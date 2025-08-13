package prg.sachin.service;

import java.sql.Connection;


import prg.sachin.dao.ConnectionFactory;
import prg.sachin.dao.DeleteDaoImpl;
import prg.sachin.dao.UploadProjectDaoImpl;
import prg.sachin.fileIo.ProjectIoImpl;

public class DeleteServiceImpl implements DeleteService{

 private String result;
	@Override
	public String delete(int eid) {	
		return new DeleteDaoImpl().deleteContact(eid);
	}
	@SuppressWarnings("finally")
	@Override
	public String deleteProjectService(String sn, String forFilename,String realPath) {
		Connection con =null;
		try {
			 int getsn = Integer.parseInt(sn);
			  con= ConnectionFactory.getConnection();
			con.setAutoCommit(false);
			
			//Delete from Database go to Dao layer
			 result = new UploadProjectDaoImpl().deleteProject(getsn, con);
			 if(result.equals("deleted")) {
				 //Delete from file
				boolean rs= new ProjectIoImpl().deleteProject(forFilename,realPath);
				if(rs) {
					con.commit();
					this.result="Image deleted Successfully!";
				}else {
					con.rollback();
					this.result="Something went wrong:Not Deleted!";
				}
				 
			 }
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			result="Something went wrong";
			
		}finally {
			return result;
		}
	}
	@Override
	public String deleteEducation(int id) {
		// TODO Auto-generated method stub
		return new DeleteDaoImpl().deleteEducation(id);
	}
      
}
