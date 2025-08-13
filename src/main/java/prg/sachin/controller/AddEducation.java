package prg.sachin.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import prg.sachin.service.AddEducationServiceImpl;


@SuppressWarnings("serial")
public class AddEducation extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	 int year = Integer.parseInt(request.getParameter("year"));
	 String title =  request.getParameter("title");
	 String subtitle = request.getParameter("subtitle");
	 String desc=  request.getParameter("desc");
	 HttpSession session = request.getSession();
	 String result= new AddEducationServiceImpl().addEducationService(year, title, subtitle, desc);
	 if(result.equals("valid")) {
		 RequestDispatcher requestDispatcher = request.getRequestDispatcher("AddEducation2");
		 requestDispatcher.forward(request, response);
	 }else {
		 session.setAttribute("msg", result);
		 response.sendRedirect("Education.jsp");
	 }
	}

}
