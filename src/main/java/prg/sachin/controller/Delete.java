package prg.sachin.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import prg.sachin.service.DeleteServiceImpl;


@SuppressWarnings("serial")
public class Delete extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
	  String eid =request.getParameter("eid");
	  String result= new DeleteServiceImpl().delete(Integer.parseInt(eid));
	  if(result.equals("Deleted")) {
		  session.setAttribute("msg",result+" "+"successfully!");
		  response.sendRedirect("ReadContent");
	  }else{
		  session.setAttribute("msg", result+" "+"to Delete!");
		  response.sendRedirect("error.jsp");
	  }
	}

}
