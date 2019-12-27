package com.hcl.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DemoServlet
 */
public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DemoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletConfig cfg=getServletConfig();

		String course=cfg.getInitParameter("course");
		PrintWriter out=response.getWriter();
		out.println("course is "+course+"<br/>");
		String company=cfg.getInitParameter("company");
		
		out.println("companyis "+company+"<br/>");
		String venue=cfg.getInitParameter("venue");
		
		out.println("venue is "+venue+"<br/>");
		ServletContext cft=getServletContext();

		out.println(cft.getInitParameter("driver")+"<br/>");
		out.println(cft.getInitParameter("connection")+"<br/>");
		out.println(cft.getInitParameter("user")+"<br/>");
		out.println(cft.getInitParameter("pwd")+"<br/>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
