package com.xworkz.location.servleet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 1, urlPatterns = "/meet")
public class Contact extends HttpServlet {
	public Contact() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running Contact in servers");
	
	String name = req.getParameter("name");
	String email = req.getParameter("email");
	String Mobile = req.getParameter("Mobile");
	String Comments= req.getParameter("Comments");
	
	
	System.out.println(name);
	System.out.println(email);
	System.out.println(Mobile);
	System.out.println(Comments);
	
	
	PrintWriter write=resp.getWriter();
	write.print("<html>");
	write.print("<body>");
	write.print("<h1>");
	write.print("<span style='color:green'>");
	write.print("name : "+name);
	write.print("email : "+email);
	write.print(" Mobile: "+Mobile);
	write.print(" Comments: "+Comments);
	write.print("<a href=Contact.html>Contact</a>");
	
	write.print("</span>");
	write.print("</h1>");
	write.print("</body>");
	write.print("</html>");
	resp.setContentType("text/html");

	}	
	
}
