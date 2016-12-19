package dao;

import java.sql.SQLException;
import java.util.List;

import bean.Film;

public interface FilmDao {

	public List selectFilms() throws SQLException;
	public boolean  deleteFilm(long id) throws SQLException;
	public void insertFilm(Film film) throws SQLException;
	public void update(Film film) throws SQLException;
}
