package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.CollegeBean;
import com.dao.DBConnection;

/**
 * Servlet implementation class CollegeReg
 */
@WebServlet("/CollegeReg")
public class CollegeReg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CollegeReg() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		String cname	=	request.getParameter("cname");
		String cid		=	request.getParameter("cid");
		String caddress		=	request.getParameter("caddress");
		String cpassword		=	request.getParameter("cpassword");
		String uselection		= request.getParameter("uselection");
		CollegeBean u=new CollegeBean();
		u.setCname(cname);
		u.setCid(cid);
		u.setCaddress(caddress);
		u.setCpassword(cpassword);
		u.setUselection(uselection);
		int i=DBConnection.CRegister(u);
		if(i>0)
		{
			try {
				DBConnection.addActivity(cname, "Register in successfully", new Date().toLocaleString());
				out.println("<script type=\"text/javascript\">");
				out.println("alert('College Registered');");
				out.println("window.location='CollegeLog.jsp'</script>");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			out.println("<script type=\"text/javascript\">");
			out.println("alert('College Failed to Register');");
			out.println("window.location='CollegeReg.jsp'</script>");
		}
	}

}
