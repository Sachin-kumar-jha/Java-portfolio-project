package prg.sachin.controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import prg.sachin.service.DeleteServiceImpl;


@SuppressWarnings("serial")
public class DeleteProject extends HttpServlet {
	
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sn = request.getParameter("sn");
		String forFilename = request.getParameter("forFilename");
		ServletContext servletContext = getServletContext();
		String realPath = servletContext.getRealPath("myphoto");
	    String result=new DeleteServiceImpl().deleteProjectService(sn, forFilename,realPath);
	    HttpSession session =request.getSession();
	    session.setAttribute("msg",result);
	    response.sendRedirect("admin.jsp");
	}

}
