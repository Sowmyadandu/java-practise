package com.hcl.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class EmployshowServlet
 */
@WebServlet("/EmployshowServlet")
public class EmployshowServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployshowServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection con=DaoConnection.getConnection();
		String cmd="select * from employ";
		PrintWriter out=response.getWriter();
		out.println("<table border='3'>");
		out.println("<tr><th>Empno</th><th>Name</th><th>Dept</th><th>Desig</th><th>Salary</th></tr>");
		try {
			PreparedStatement pst=con.prepareStatement(cmd);
			ResultSet rs=pst.executeQuery();
			while(rs.next()){
				out.println("<tr><td>");
				out.println(rs.getInt("empno") + "</td><td>");
				out.println(rs.getString("name")+ "</td><td>");
				out.println(rs.getString("dept") +"</td><td>");
				out.println(rs.getInt("basic")+"</td><td>");
				out.println(rs.getString("desig")+"</td>");
				out.println("</tr>");
			}
			out.println("</table>");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
