package prg.sachin.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeleteDaoImpl implements DeleteDao {
private String result;
	@SuppressWarnings("finally")
	@Override
	public String deleteContact(int id) {
		Connection con =null;
		try {
			 con= ConnectionFactory.getConnection();
			String sql="delete from industrial.emp where eid=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, id);
          int row =  ps.executeUpdate();
          if(row == 1) {
        	  result ="Deleted";
          }else {
        	  result ="failed";
          }
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			result="Something went wrong";
			
		}finally {
			return result;
		}
	}
	@SuppressWarnings("finally")
	@Override
	public String deleteEducation(int id) {
		Connection con =null;
		try {
			 con= ConnectionFactory.getConnection();
			String sql="delete from industrial.education where id=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, id);
          int row =  ps.executeUpdate();
          if(row == 1) {
        	  result ="Deleted";
          }else {
        	  result ="failed";
          }
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			result="Something went wrong";
			
		}finally {
	
			return result;
		}
	}

}
