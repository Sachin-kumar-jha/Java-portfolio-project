package prg.sachin.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import prg.sachin.service.AdminLoginServiceImpl;

@SuppressWarnings("serial")
public class AdminLogin1 extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
	  String result=new AdminLoginServiceImpl().adminLoginservice1(username, password);
		if (result.equals("valid")) {
			RequestDispatcher requestdispatcher = request.getRequestDispatcher("AdminLogin2");
			requestdispatcher.forward(request,response);
			
		}else {
			session.setAttribute("msg", result);
			response.sendRedirect("adminlogin.jsp");
		}
	}

}
