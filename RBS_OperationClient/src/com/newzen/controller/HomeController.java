package com.newzen.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(request.getRequestURI());
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		RequestDispatcher rd = null;

		// request.getRequestDispatcher("static/navigation.html").include(request,
		// response);

		request.getRequestDispatcher("static/home.html").include(request, response);

		pw.close();
	}

}
