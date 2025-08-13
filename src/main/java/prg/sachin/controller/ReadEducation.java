package prg.sachin.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import prg.sachin.model.ReadEducationPojo;
import prg.sachin.service.AddEducationServiceImpl;



public class ReadEducation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<ReadEducationPojo> list = new AddEducationServiceImpl().readEducationService();
		HttpSession session = request.getSession();
		session.setAttribute("readEducation",list);
		response.sendRedirect("readEducation.jsp");
	}

}
