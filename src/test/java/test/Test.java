package test;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Before;

import common.ConnectionFactory;

public class Test {

	@Before
	public void setUp() throws Exception {
	}

	@org.junit.Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@org.junit.Test
	public void test_db(){
		System.out.println("test");
		String sql = "select * from film";
		Connection conn = ConnectionFactory.getConn();
		try {
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()){
				System.out.println(rs.getString("title"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
