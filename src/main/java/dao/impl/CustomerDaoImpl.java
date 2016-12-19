package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import bean.Customer;
import common.ConnectionFactory;
import dao.CustomerDao;

public class CustomerDaoImpl implements CustomerDao{

	public String selectCus(String name) throws SQLException{
		
	
			Connection conn = ConnectionFactory.getConn();
			String sql="select * from customer where first_name=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				String username =  rs.getString("first_name");
				ConnectionFactory.Close(ps, rs, conn);
				return username;
			}
			else{
				ConnectionFactory.Close(ps, rs, conn);
				return null;
			}
			
	}

}
