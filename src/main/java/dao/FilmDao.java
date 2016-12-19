package dao;

import java.sql.SQLException;
import java.util.List;

public interface FilmDao {

	public List selectFilms() throws SQLException;
	public boolean  deleteFilm(long id) throws SQLException;
}
