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

import prg.sachin.service.UploadProjectServiceImpl;


@SuppressWarnings("serial")
@MultipartConfig
public class UploadProject2 extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ServletContext servletContext = getServletContext();
		String realPath = servletContext.getRealPath("myphoto");
		
		Part part = request.getPart("myfile");

		String datetime = request.getParameter("datetime");
		String result = new UploadProjectServiceImpl().uploadProjectService2(part, datetime,realPath);
        HttpSession session = request.getSession();
        session.setAttribute("msg",result);
        response.sendRedirect("admin.jsp");
       
	}

}
