package prg.sachin.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import prg.sachin.model.ReadAdminPojo;

public class AdminLoginDaoImpl implements AdminLoginDao{
	 private String result;
	 private Connection con;
	 private String sql;
	 private PreparedStatement ps;
	 private ResultSet rs;
	 private int row;
	@SuppressWarnings("finally")
	@Override
	public String readAdminLogin(String username, String password) {
	try {
		con = ConnectionFactory.getConnection();
		sql ="select * from industrial.adminlogin where username=? and password=?";
		
		ps=con.prepareStatement(sql);
	    ps.setString(1,username);
	    ps.setString(2,password);
	    
	    rs=ps.executeQuery();
		if(rs.next()) {
			result = "Exists";
		}else {
			result = "Not Exists";
		}
		
	} catch (Exception e) {
		e.printStackTrace();
		result = "Something went wrong !";
	}finally {
		return result;
	}
	}

	@SuppressWarnings("finally")
	@Override
	public ReadAdminPojo readAdminLoginData() {
		ReadAdminPojo readAdmin=null;
		try {
			con = ConnectionFactory.getConnection();
			sql ="select * from industrial.adminlogin";
			
			ps=con.prepareStatement(sql);
		   
		    rs=ps.executeQuery();
		    
			if(rs.next()) {
		    readAdmin=new ReadAdminPojo(rs.getInt("sn"),rs.getString("username"),rs.getString("password"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			return readAdmin;
		}
	}

	@SuppressWarnings("finally")
	@Override
	public String changeAdminCredentialDao(int sn, String username, String password) {
		try {
			con = ConnectionFactory.getConnection();
			sql ="update industrial.adminlogin set username=?,password=? where sn=?";
			
			ps=con.prepareStatement(sql);
		    ps.setString(1,username);
		    ps.setString(2,password);
		    ps.setInt(3,sn);
		    
		    row=ps.executeUpdate();
			if(row==1) {
				result = "updated";
			}else {
				result = "Not changed";
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			result = "Something went wrong !";
		}finally {
			return result;
		}
	}
 
}
