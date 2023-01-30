package com.xworkz.location.servleet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 2, urlPatterns = "/place")
public class Location extends HttpServlet {
	public Location() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running Location in servers");
	
	String name = req.getParameter("name");
	String email = req.getParameter("email");
	String StartPoint = req.getParameter("StartPoint");
	String Destination= req.getParameter("Destination");
	String Gender = req.getParameter("Gender");
	
	System.out.println(name);
	System.out.println(email);
	System.out.println(StartPoint);
	System.out.println(Destination);
	System.out.println(Gender);
	
	PrintWriter write=resp.getWriter();
	write.print("<html>");
	write.print("<body>");
	write.print("<h1>");
	write.print("<span style='color:green'>");
	write.print("name : "+name);
	write.print("email : "+email);
	write.print(" StartPoint: "+StartPoint);
	write.print(" Destination: "+Destination);
	write.print(" Gender: "+Gender);
	write.print("<a href=location.html>Location</a>");
	write.print("</span>");
	write.print("</h1>");
	write.print("</body>");
	write.print("</html>");
	resp.setContentType("text/html");

	}	
	
}
