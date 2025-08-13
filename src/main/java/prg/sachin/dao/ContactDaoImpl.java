package prg.sachin.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import prg.sachin.model.ReadContentPojo;

public class ContactDaoImpl implements ContactDao {
 private String result;
 private Connection con;
 private String sql;
 private PreparedStatement ps;
 private int row;
	
 private ResultSet rs;
 
 @SuppressWarnings("finally")
	@Override
	public String insertContact(String username, String email, String message,String datetime) {
		try {
			con=ConnectionFactory.getConnection();
			sql="insert into industrial.emp(username,email,message,date) values(?,?,?,?)";
			ps=con.prepareStatement(sql);
		    ps.setString(1,username);
		    ps.setString(2,email);
		    ps.setString(3, message);
		    ps.setString(4, datetime);
			row=ps.executeUpdate();
			if(row == 1) {
				result="saved";
			}
		} catch (Exception e) {
			e.printStackTrace();
			result="failed";
		}finally {
			return result;
		}
		
	}
	
	
 @SuppressWarnings("finally")
@Override
	public ArrayList<ReadContentPojo> readContact() {
	 ArrayList<ReadContentPojo> arrayList = new ArrayList<ReadContentPojo>();
		try {
			con=ConnectionFactory.getConnection();
			sql="select * from industrial.emp";
			ps=con.prepareStatement(sql);
		   
			rs =ps.executeQuery();
			while(rs.next()) {
//				ReadContentPojo obj=new ReadContentPojo(rs.getInt("eid"),rs.getString("username"),rs.getString("email"),rs.getString("message"));
//				arrayList.add(obj);
				arrayList.add(new ReadContentPojo(rs.getInt("eid"),rs.getString("username"),rs.getString("email"),rs.getString("message")));
			}
		} catch (Exception e) {
			e.printStackTrace();
			arrayList.clear();
			result="failed";
		}finally {
			
			return arrayList;
		}
	}

}
