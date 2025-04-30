package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SumServlet
 */

public class SumServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SumServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int n1 = Integer.parseInt(request.getParameter("t1"));
		int n2 = Integer.parseInt(request.getParameter("t2"));
		int n3 = n1 + n2;

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		System.out.println("Sum of two no is : " + n3);
		RequestDispatcher  rDispatcher1=request.getRequestDispatcher("/FooterServlet");
		rDispatcher1.forward(request, response);
		

	}

}
