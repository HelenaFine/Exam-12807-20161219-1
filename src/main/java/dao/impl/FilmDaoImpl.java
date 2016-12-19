package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
		String sql="delete from film where film_id=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setLong(1, id);
		boolean flag = ps.execute();
		conn.close();
		return flag;
	}

	
	
	//插入Film
	public void insertFilm(Film film) throws SQLException {
		Connection conn = ConnectionFactory.getConn();
		String sql="insert into film (film_id,title,description,language_id) values(?,?,?,?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setLong(1, film.getFilm_id());
		ps.setString(2,film.getTitle());
		ps.setString(3, film.getDescription());
		ps.setLong(4, film.getLanguage_id());
		ps.execute();
		
	}

	
	//更新
	
	public  void  update(Film film) throws SQLException {
		Connection conn = ConnectionFactory.getConn();
		String sql = "update film set title="+film.getTitle()+",description="+film.getDescription()+",language_id="+film.getLanguage_id() +"where film_id="+film.getFilm_id();
		Statement st = conn.createStatement();
		st.executeQuery(sql);
	}
	
	
	
	
	

}
