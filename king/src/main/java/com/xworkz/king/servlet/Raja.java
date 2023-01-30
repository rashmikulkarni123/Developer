package com.xworkz.king.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 1, urlPatterns = "/Series")
public class Raja extends HttpServlet {
	System.out.println("Created " + this.getClass().getSimpleName());
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running WebSeries in servers");
	
	String Name = req.getParameter("Name");
	String Region = req.getParameter("Region");
	String noOfQueens = req.getParameter("noOfQueens");
	String DOB= req.getParameter("DOB");
	String DOD = req.getParameter("DOD");
	
	System.out.println(Name);
	System.out.println(Region);
	System.out.println(noOfQueens);
	System.out.println(DOB);
	System.out.println(DOD);
	
	PrintWriter write=resp.getWriter();
	write.print("<html>");
	write.print("<body>");
	write.print("<h1>");
	write.print("<span style='color:green'>");
	write.print("Name : "+Name);
	write.print("Region : "+Region);
	write.print(" noOfQueens: "+noOfQueens);
	write.print(" DOB: "+DOB);
	write.print(" DOD: "+DOD);
	write.print("</span>");
	write.print("</h1>");
	write.print("</body>");
	write.print("</html>");
	resp.setContentType("text/html");

	}	
}
