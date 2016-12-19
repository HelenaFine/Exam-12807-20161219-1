package service;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Film;
import dao.FilmDao;
import dao.impl.FilmDaoImpl;

public class InsertServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		String film_id = request.getParameter("film_id");
	   String title = request.getParameter("title");
	   String description = request.getParameter("description");
	   String languages []= request.getParameterValues("check");
	   System.out.println(languages[0]);
	   FilmDao dao = new FilmDaoImpl();
	   Film film = new Film();
	   film.setFilm_id(Long.parseLong(film_id));
	   film.setTitle(title);
	   film.setDescription(description);
	   film.setLanguage_id(Long.parseLong(languages[0]));
	   
	   try {
		dao.insertFilm(film);
		request.getRequestDispatcher("/insertSuccess.jsp").forward(request, response);
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	
	}
}
