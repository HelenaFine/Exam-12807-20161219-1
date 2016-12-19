package service;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.FilmDao;
import dao.impl.FilmDaoImpl;

public class DeleteServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("delete..");
		FilmDao dao =new  FilmDaoImpl();
		long id =Long.parseLong(request.getParameter("id"));
		System.out.println(id);
		try {
			dao.deleteFilm(id);
			System.out.println("删除成功");
			request.getRequestDispatcher("/deleteSuccess.jsp").forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
	
	}
}
