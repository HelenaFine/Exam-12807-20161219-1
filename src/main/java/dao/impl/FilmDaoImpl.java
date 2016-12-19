package dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bean.Film;
import common.ConnectionFactory;
import dao.FilmDao;

public class FilmDaoImpl implements FilmDao{
	private List list;
	private Film film =null;
	
	public FilmDaoImpl(){
		list = new ArrayList();
	}
	
	//查询所有的film
	public List selectFilms() throws SQLException{
		Connection conn = ConnectionFactory.getConn();
		Statement st = conn.createStatement();
		String sql = "select film_id,title,description,name from film,language where language.language_id=film.language_id";
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()){
			film = new Film();
			film.setFilm_id(rs.getLong("film_id"));
			film.setTitle(rs.getString("title"));
			film.setDescription(rs.getString("description"));
			film.setLanguage(rs.getString("name"));
			list.add(film);
		}
		conn.close();
		return list;
	}

	
	//删除选中film
	public boolean deleteFilm(long id) throws SQLException {
		Connection conn = ConnectionFactory.getConn();
		Statement st = conn.createStatement();
		String sql="delete from film,film_actor where film_actor.film_id=film.film_id and film_id="+id;
		boolean flag = st.execute(sql);
		conn.close();
		return flag;
	}
	
	
	
	

}
