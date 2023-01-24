package com.xworkz.tetra.serrvlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


	@WebServlet(loadOnStartup = 6, urlPatterns = "/ghi")
	public class Sahana extends HttpServlet {

		public Sahana() {
			System.out.println("Created " + this.getClass().getSimpleName());
		}

		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			System.out.println("Running Sahana in servers");
		}
}
