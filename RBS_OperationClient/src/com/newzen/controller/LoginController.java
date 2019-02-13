
/**
 * @author Manish Verma
 *  
 */
package com.newzen.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		RequestDispatcher rd = request.getRequestDispatcher("static/login.html");
		rd.forward(request, response);// method may be include or forward

		pw.close();

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		RequestDispatcher rd = null;

		String userName = request.getParameter("uname");
		String password = request.getParameter("psw");

		// Business Layer
		// boolean b = LoginBOImpl.getInstance().login(userName,password);
		if (true) {
			request.getRequestDispatcher("static/navigation.html").include(request, response);

			request.getRequestDispatcher("static/home.html").include(request, response);

		} else {
			rd = request.getRequestDispatcher("static/login.html");
			rd.forward(request, response);// method may be include or forward

		}
		pw.close();
	}

}
