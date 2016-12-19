package service;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Request;

import bean.Film;
import dao.FilmDao;
import dao.impl.FilmDaoImpl;

public class UpdateServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req,resp);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("update...");
		String film_id=req.getParameter("id");
		System.out.println(film_id);
	    req.getRequestDispatcher("/insert.jsp").forward(req, resp);
	    String title=req.getParameter("title");
	    String description=req.getParameter("description");
	    String language[]=req.getParameterValues("check");
	    Film film = new Film();
	    film.setFilm_id(Long.parseLong(film_id));
	    film.setTitle(title);
	    film.setDescription(description);
	    film.setLanguage_id(Long.parseLong(language[0]));
	    FilmDao dao = new FilmDaoImpl();
	    try {
			dao.update(film);
			req.getRequestDispatcher("/insertSuccess.jsp").forward(req, resp);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	    
	}
}
