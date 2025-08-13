package prg.sachin.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import prg.sachin.service.AdminLoginServiceImpl;


public class AdminLogin2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		String result = new AdminLoginServiceImpl().adminLoginservie2(username, password);
		if(result.equals("Exists")) {
			session.setAttribute("adminlogin",username);
			response.sendRedirect("admin.jsp");
		}else {
			session.setAttribute("msg","please enter valid credentials!");
			response.sendRedirect("adminlogin.jsp");
		}
	}

}
