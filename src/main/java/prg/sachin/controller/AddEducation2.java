package prg.sachin.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import prg.sachin.service.AddEducationServiceImpl;


public class AddEducation2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 int year = Integer.parseInt(request.getParameter("year"));
		 String title =  request.getParameter("title");
		 String subtitle = request.getParameter("subtitle");
		 String desc=  request.getParameter("desc");
		 HttpSession session = request.getSession();
		 String result= new AddEducationServiceImpl().addEducationService2(year, title, subtitle, desc);
		 if(result.equals("saved")) {
			 session.setAttribute("msg","Education added to the database");
			 response.sendRedirect("admin.jsp");
		 }else {
			 session.setAttribute("msg",result);
			 response.sendRedirect("Education.jsp");
		 }
	}

}
