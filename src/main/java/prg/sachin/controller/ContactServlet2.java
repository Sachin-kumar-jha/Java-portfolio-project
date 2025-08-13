package prg.sachin.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import prg.sachin.service.ContactServiceImpl;


@SuppressWarnings("serial")

public class ContactServlet2 extends HttpServlet {


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String username = request.getParameter("username");
	String email = request.getParameter("email");
	String msg = request.getParameter("message");
	String result =new ContactServiceImpl().contactService2(username, email, msg);
	
	HttpSession session = request.getSession();
	if(result.equals("saved")) {
		session.setAttribute("msg","Message sent successfully!");
		response.sendRedirect("index.jsp");
	}else if(result.equals("failed")) {
		session.setAttribute("msg","Something went wrong!");
		response.sendRedirect("index.jsp");
	}else {
		session.setAttribute("msg","Something went wrong(Service)");
		response.sendRedirect("index.jsp");
	}
	}

}
