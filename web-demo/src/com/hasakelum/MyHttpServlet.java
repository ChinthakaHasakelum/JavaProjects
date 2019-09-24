package com.hasakelum;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.Session;

public class MyHttpServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		try(PrintWriter out=resp.getWriter()){
			out.print("<h1>Welcome to the Http Servlet</h1>");
			
		}catch(Exception e){
			e.printStackTrace();
		}
			
		
	}
	

	
	
	
	
	
}
