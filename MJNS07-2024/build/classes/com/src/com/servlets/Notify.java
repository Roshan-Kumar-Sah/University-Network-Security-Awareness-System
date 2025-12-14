package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.DBConnection;

/**
 * Servlet implementation class Notify
 */
@WebServlet("/Notify")
public class Notify extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Notify() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=response.getWriter();
		String id=request.getParameter("attackername");
		String uid=request.getParameter("activityname");
		String time=request.getParameter("attackeruniversity");
		String victimname=request.getParameter("victimname");
		System.out.println("id :"+id);
		System.out.println("uid :"+uid);
		System.out.println("time :"+time);
		System.out.println("victimname :"+victimname);
		Connection con=DBConnection.connect();
		try {
			Statement st=con.createStatement();
			 int i=st.executeUpdate("insert into notify1 values('"+id+"','"+uid+"','"+time+"','"+victimname+"')");
			 pw.println("<script type=\"text/javascript\">");
			 pw.println("alert('Notification Sent To The University...');");
			 pw.println("location='SendNotification.jsp';");
			 pw.println("</script>");
		}
		catch (SQLException e) 
		{
			 pw.println("<script type=\"text/javascript\">");
			 pw.println("alert('Already Notified To The University...');");
			 pw.println("location='SendNotification.jsp';");
			 pw.println("</script>");
			e.printStackTrace();
			}
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
