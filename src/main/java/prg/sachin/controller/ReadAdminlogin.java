package prg.sachin.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import prg.sachin.model.ReadAdminPojo;
import prg.sachin.service.AdminLoginServiceImpl;


@SuppressWarnings("serial")
public class ReadAdminlogin extends HttpServlet {


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		ReadAdminPojo readAdmin = new AdminLoginServiceImpl().readAdminloginService();
		if(readAdmin==null) {
			session.setAttribute("msg","Something went wrong try again");
			response.sendRedirect("admin.jsp");
		}else {
			session.setAttribute("adminloginData", readAdmin);
			response.sendRedirect("changeCredential.jsp");
		}
	}

}
