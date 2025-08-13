package prg.sachin.dao;

import java.sql.Connection;

import com.mysql.cj.jdbc.MysqlDataSource;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class ConnectionFactory {
private static Connection con = null;
@SuppressWarnings("finally")
public static Connection getConnection() {
	try {
		MysqlDataSource ds = new MysqlDataSource();
		ds.setUrl("jdbc:mysql://localhost:3306?useSSL=false&allowPublicKeyRetrieval=true");
		String user = ConfigLoader.get("DB_USER");
        String password = ConfigLoader.get("DB_PASSWORD");
  
		ds.setUser(user);
		ds.setPassword(password);
		
		HikariConfig hc = new HikariConfig();
		hc.setMaximumPoolSize(20);
		hc.setDataSource(ds);
	
	
		@SuppressWarnings("resource")
		HikariDataSource hds = new HikariDataSource(hc);
		 con = hds.getConnection();
	} catch (Exception e) {
	      e.printStackTrace();
	}finally {
		return con;
		
	}
}
}
