package prg.sachin.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import prg.sachin.model.ReadEducationPojo;


public class AddEducationDaoImpl implements AddEducationDao {
	 private String result;
	 private Connection con;
	 private String sql;
	 private PreparedStatement ps;
	 private int row;
	 private ResultSet rs;
	@SuppressWarnings("finally")
	@Override
	public String addeduationDao(int year, String title, String subtitle, String desc) {
		try {
			con = ConnectionFactory.getConnection();
			sql="insert into industrial.education(year,title,subtitle,description) values(?,?,?,?)";
			ps=con.prepareStatement(sql);
		    ps.setInt(1,year);
		    ps.setString(2,title);
		    ps.setString(3, subtitle);
		    ps.setString(4, desc);
			row=ps.executeUpdate();
			if(row == 1) {
				result="saved";
			}
		} catch (Exception e) {
			e.printStackTrace();
			result="something went wrong";
		}finally {
			return result;
		}
	}
	@SuppressWarnings("finally")
	@Override
	public ArrayList<ReadEducationPojo> readEducation() {
		ArrayList<ReadEducationPojo> arrayList = new ArrayList<ReadEducationPojo>();
		try {
			con=ConnectionFactory.getConnection();
			sql="select * from industrial.education";
			ps=con.prepareStatement(sql);
			rs =ps.executeQuery();
			while(rs.next()) {
//				ReadContentPojo obj=new ReadContentPojo(rs.getInt("eid"),rs.getString("username"),rs.getString("email"),rs.getString("message"));
//				arrayList.add(obj);
				arrayList.add(new ReadEducationPojo(rs.getInt("id"),rs.getInt("year"),rs.getString("title"),rs.getString("subtitle"),rs.getString("description"),rs.getString("created_at")));
			}
		} catch (Exception e) {
			e.printStackTrace();
			result="failed";
		}finally {
			return arrayList;
		}
	}
	

}
