package com.xworkz.tetra.serrvlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

	@WebServlet(loadOnStartup = 4, urlPatterns = "/Series")
	public class Rashmi extends HttpServlet {

		public Rashmi() {
			System.out.println("Created " + this.getClass().getSimpleName());
		}

		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			System.out.println("Running Rashmi in servers");
		}
}
