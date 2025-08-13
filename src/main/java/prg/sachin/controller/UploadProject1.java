package prg.sachin.controller;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import prg.sachin.service.UploadProjectServiceImpl;


@SuppressWarnings("serial")
/*This tag is important to add when we are using file upload */
@MultipartConfig
public class UploadProject1 extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 Part part =request.getPart("myfile");
//		 String filename = part.getSubmittedFileName();
//		// InputStream Is =part.getInputStream();
//		  String datetime = request.getParameter("datetime");
//		  
		String result =  new UploadProjectServiceImpl().uploadProjectService1(part);
		 HttpSession session = request.getSession();
		
		if (result.equals("valid")) {
			//Dispatch to next servlet
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("UploadProject2");
			requestDispatcher.forward(request, response);
		}else {
			session.setAttribute("msg", result);
			response.sendRedirect("UploadProject.jsp");
		}
	}

}
