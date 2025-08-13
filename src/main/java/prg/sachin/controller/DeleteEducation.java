package prg.sachin.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import prg.sachin.service.DeleteServiceImpl;


public class DeleteEducation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		  String id =request.getParameter("id");
		  String result= new DeleteServiceImpl().deleteEducation(Integer.parseInt(id));
		  if(result.equals("Deleted")) {
			  session.setAttribute("msg",result+" "+"successfully!");
			  response.sendRedirect("ReadEducation");
		  }else{
			  session.setAttribute("msg", result+" "+"to Delete!");
			  response.sendRedirect("error.jsp");
		  }
	}

}
