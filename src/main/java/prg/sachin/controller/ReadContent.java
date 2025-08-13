package prg.sachin.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import prg.sachin.model.ReadContentPojo;
import prg.sachin.service.ContactServiceImpl;


@SuppressWarnings("serial")
public class ReadContent extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<ReadContentPojo> list = new ContactServiceImpl().readContactService();
		
		HttpSession session = request.getSession();
		session.setAttribute("readContact",list);
		response.sendRedirect("readContact.jsp");
	}

}
