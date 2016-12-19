package service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.FilmDao;
import dao.impl.FilmDaoImpl;

public class FilmServlet extends HttpServlet{
	
	
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		HttpSession session = request.getSession();
		FilmDao dao = new FilmDaoImpl();
		try {
			System.out.println("2");
			List filmList = dao.selectFilms();
			session.setAttribute("filmList", filmList);
			System.out.println("1");
			request.getRequestDispatcher("/showFilms.jsp").forward(request, response);;
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
}
