package service;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CustomerDao;
import dao.impl.CustomerDaoImpl;

public class LoginServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("username");
		//判断姓名是否存在
		CustomerDao dao = new CustomerDaoImpl();
		try {
			String first_name = dao.selectCus(name);
			System.out.println("test"+first_name);
			if(first_name ==null){
				System.out.println("用户不存在");
				request.getRequestDispatcher("/fail.jsp").forward(request, response);
			}
			else{
				request.setAttribute("username", name);
				request.getRequestDispatcher("/success.jsp").forward(request, response);
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
}
