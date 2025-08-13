package prg.sachin.controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import prg.sachin.service.UploadResumeServiceImpl;

@MultipartConfig
public class UploadResume extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Part part = request.getPart("myresume");
		ServletContext servletContext = getServletContext();
		String realPath = servletContext.getRealPath("MyResume");
		String result=new UploadResumeServiceImpl().uploadResumeService(part,realPath);
		HttpSession session = request.getSession();
		session.setAttribute("msg",result);
		response.sendRedirect("UploadResume.jsp");
	}

}
