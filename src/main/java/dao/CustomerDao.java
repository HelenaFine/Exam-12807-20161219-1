package dao;

import java.sql.SQLException;



public interface CustomerDao {

	public String selectCus(String name) throws SQLException;
}
