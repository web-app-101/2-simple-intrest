package com.simple;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SimpleInterestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Entering SimpleInterestServlet.doPost()");
	
		float principal = Float.parseFloat(request.getParameter("principal"));
		int numberOfYears = Integer.parseInt(request.getParameter("numberOfYears"));
		float rateOfInterest = Float.parseFloat(request.getParameter("rateOfInterest"));
		
		float result = (principal * numberOfYears * rateOfInterest) / 100;
		
		System.out.println("result=" + result);
		
		response.sendRedirect("index.html?result="+ result);
		
		System.out.println("Exiting SimpleInterestServlet.doPost()");
	}

}
