package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RailwayBServlet
 */

public class RailwayBServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RailwayBServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String fstation = request.getParameter("fstation");
		String Tstation = request.getParameter("Tstation");
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		int age = Integer.parseInt(request.getParameter("age"));
		String sex = request.getParameter("sex");
		int phno = Integer.parseInt(request.getParameter("phno"));
		String adddress = request.getParameter("adddress");

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = ConnectionFactory.getDBConnection();
			String sql = "insert into railwaybooking values (?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, firstName);
			pstmt.setString(2, lastName);
			pstmt.setInt(3, age);
			pstmt.setString(4, sex);
			pstmt.setInt(5, phno);
			pstmt.setString(6, adddress);

			pstmt.executeQuery();
		} catch (Exception e) {
		}
		out.println("Booking Complete " +" "+ firstName +" "+ lastName);
		out.close();

	}

}
