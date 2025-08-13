package prg.sachin.controller;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import prg.sachin.service.AdminLoginServiceImpl;



@SuppressWarnings("serial")
public class ChangeCredential2 extends HttpServlet {
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         HttpSession session = request.getSession();
		
		String username =request.getParameter("username");
		String password = request.getParameter("password");
		String sn = request.getParameter("sn");
		
		String result = new AdminLoginServiceImpl().changeAdminCredential2(sn,username,password);
		
		if(result.equals("updated")) {
			session.setAttribute("msg", result);
			response.sendRedirect("admin.jsp");
		}else {
			session.setAttribute("msg", result);
			response.sendRedirect("changeCredential.jsp");
		}
	}

}
