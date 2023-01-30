package com.xworkz.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 1, urlPatterns = "/Series")

public class WebSeries extends HttpServlet {
	public WebSeries() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running WebSeries in servers");
	
	String Seriesname = req.getParameter("Seriesname");
	String Language = req.getParameter("Language");
	String episodes = req.getParameter("episodes");
	String ott= req.getParameter("ott");
	String budget = req.getParameter("budget");
	
	System.out.println(Seriesname);
	System.out.println(Language);
	System.out.println(episodes);
	System.out.println(ott);
	System.out.println(budget);
	
	PrintWriter write=resp.getWriter();
	write.print("<html>");
	write.print("<body>");
	write.print("<h1>");
	write.print("<span style='color:green'>");
	write.print("name : "+Seriesname);
	write.print("language : "+Language);
	write.print(" episode: "+episodes);
	write.print(" ott: "+ott);
	write.print(" budget: "+budget);
	write.print("</span>");
	write.print("</h1>");
	write.print("</body>");
	write.print("</html>");
	resp.setContentType("text/html");

	}	
}
