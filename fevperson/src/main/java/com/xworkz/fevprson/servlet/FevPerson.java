package com.xworkz.fevprson.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


	@WebServlet(loadOnStartup = 1, urlPatterns = "/msg")
	public class FevPerson extends HttpServlet {
		public FevPerson() {
			System.out.println("Created " + this.getClass().getSimpleName());
		}

		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			System.out.println("Running Fev Person in servers");
		
		String Fname = req.getParameter("Fname");
		String Lname = req.getParameter("Lname");
		String gender = req.getParameter("gender");
		String reason= req.getParameter("reason");
		String address= req.getParameter("address");
		
		System.out.println(Fname);
		System.out.println(Lname);
		System.out.println(gender);
		System.out.println(reason);
		System.out.println(address);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("Display.jsp");
		req.setAttribute("Fname", Fname);
		req.setAttribute("Lname", Lname);
		req.setAttribute("gender", gender);
		req.setAttribute("reason", reason);
		req.setAttribute("address", address);
		dispatcher.forward(req, resp);
		
		
}
}