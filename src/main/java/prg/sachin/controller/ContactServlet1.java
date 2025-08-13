package prg.sachin.controller;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import prg.sachin.service.ContactServiceImpl;


@SuppressWarnings("serial")
public class ContactServlet1 extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String email = request.getParameter("email");
		String message = request.getParameter("message");
		  HttpSession session = request.getSession();
		  
		String result =new ContactServiceImpl().contactService1(username,email,message);
		
		if(result.equals("valid")) {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("ContactServlet2");
			requestDispatcher.forward(request, response);
		}else {
			session.setAttribute("msg", result);
			response.sendRedirect("index.jsp");
		}
	}

}
