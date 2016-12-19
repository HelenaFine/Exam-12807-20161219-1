package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionFactory {
	
	
	
	public static  Connection getConn(){
		 String user = "root";
		 String password="root";
		 String driver = "com.mysql.jdbc.Driver";
		 String url="jdbc:mysql://localhost:3306/sakila?useUnicode=true&characterEncoding=utf-8";
	     Connection conn = null;
		try {
			
			Class.forName(driver) ;
			conn = DriverManager.getConnection(url,user,password);
			
		} catch (Exception e) {
			e.printStackTrace();
		}   
		return conn;
	}
	
	public static void Close(Statement st,ResultSet rs,Connection conn){
		try {
			if(st!=null){
				st.close();
			}
			if(rs!=null){
				rs.close();
			}
			if(conn!=null){
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	
}
}
