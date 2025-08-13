package prg.sachin.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
public class DownloadResume extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServletContext servletContext = getServletContext();
		String realPath = servletContext.getRealPath("MyResume");
		String path =realPath+File.separator+"mycv.pdf";
		FileInputStream fileInputStream = new FileInputStream(path);
		
		byte[]b=new byte[fileInputStream.available()];
		fileInputStream.read(b);
		
		ServletOutputStream outputStream = response.getOutputStream();
		response.setHeader("content-disposition","filename=sachin.pdf");
		response.setContentType("application/octet-stream");
		outputStream.write(b);
		
		
		fileInputStream.close();
		outputStream.close();
	}

}
