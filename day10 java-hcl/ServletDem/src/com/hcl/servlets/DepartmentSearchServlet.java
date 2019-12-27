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
 * Servlet implementation class DepartmentSearchServlet
 */
@WebServlet("/DepartmentSearchServlet")
public class DepartmentSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DepartmentSearchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int deptno=Integer.parseInt(request.getParameter("deptno"));
		String cmd="SELECT * FROM Department where deptno=?";
		Connection conn=DaoConnection.getConnection();
		PrintWriter out=response.getWriter();
		
		PreparedStatement pst;
		try {
		 pst=conn.prepareStatement(cmd);
			pst.setInt(1, deptno);
			ResultSet rs=pst.executeQuery();
		while(rs.next()) {
		out.println("Deptno" +rs.getInt("Deptno") + "<br/>");
		out.println("Dept name :" +rs.getString("dname") +"<br/>");
		out.println("Location:" +rs.getString("Loc") + "<br/>");
		out.println("city :" +rs.getString("city") +"<br/>");
		out.println("Head :" +rs.getString("head") +"<br/><hr/>");
		}
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
