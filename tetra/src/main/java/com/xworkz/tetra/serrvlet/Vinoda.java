package com.xworkz.tetra.serrvlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


	@WebServlet(loadOnStartup = 3, urlPatterns = "/traine")
	public class Vinoda extends HttpServlet {

		public Vinoda() {
			System.out.println("Created " + this.getClass().getSimpleName());
		}

		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			System.out.println("Running Vinoda in servers");
		}
	}

