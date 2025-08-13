package prg.sachin.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.ArrayList;

import prg.sachin.model.UploadPojo;

public class UploadProjectDaoImpl implements UploadProjectDao {
	 private String result;
	 private Connection con;
	 private String sql;
	 private PreparedStatement ps;
	 private int row ;
	 private ResultSet rs;
	 
	@SuppressWarnings("finally")
	@Override
	public String insertProject(String filename,String datetime, Connection con) {
		try {
			sql="insert into industrial.project(forFilename,datetime) values(?,?)";
			ps=con.prepareStatement(sql);
		    ps.setString(1, filename);
		    ps.setString(2,datetime);
		    row = ps.executeUpdate();
		    if(row==1) {
		    	result ="saved";
		    }else {
		    	result ="failed";
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
	public ArrayList<UploadPojo> readProject() {
		ArrayList<UploadPojo> arrayList = new ArrayList<UploadPojo>();
		try {
		    con= ConnectionFactory.getConnection();
			sql="select * from industrial.project";
			ps=con.prepareStatement(sql);
		    rs = ps.executeQuery();
		    while(rs.next()) {
		    	UploadPojo uploadPojo = new UploadPojo(rs.getInt("sn"),rs.getString("forFileName"),rs.getString("datetime"));
		    	arrayList.add(uploadPojo);
		    }
		} catch (Exception e) {
		e.printStackTrace();
		}finally {
			return arrayList;
		}

	}

	@SuppressWarnings("finally")
	@Override
	public String deleteProject(int sn, Connection con) {
		try {
		    con= ConnectionFactory.getConnection();
			sql="delete from industrial.project where sn =?";
			ps=con.prepareStatement(sql);
			ps.setInt(1, sn);
			row =ps.executeUpdate();
		  if(row==1) {
			  result ="deleted";
		  }else {
			  result = "failed";
		  }
		} catch (Exception e) {
		e.printStackTrace();
		this.result="Something went wrong";
		}finally {
			return result;
		}
	
		
	}

}
