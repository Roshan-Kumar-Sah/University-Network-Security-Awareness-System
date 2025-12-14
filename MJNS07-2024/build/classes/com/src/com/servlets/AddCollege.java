package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.UserBean;
import com.dao.DBConnection;

/**
 * Servlet implementation class AddCollege
 */
@WebServlet("/AddCollege")
public class AddCollege extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCollege() {
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
		PrintWriter out = response.getWriter();
		String collegename = request.getParameter("collegename");
		String collegeid = request.getParameter("collegeid");
		String collegepwd = request.getParameter("collegepwd");
		
		/*UserBean ub = new UserBean();
		ub.setCollegename(collegename);
		ub.setCollegeid(collegeid);
		ub.setCollegepwd(collegepwd);
		ub.setCollegemob(collegemob);
		ub.setCollegeaddress(collegeaddress);*/
		Connection con =DBConnection.connect();
		/*try {
			Statement st=con.createStatement();
			 int i = DBConnection.setCollege(collegename,collegeid,collegepwd);
			 String sql="create table "+collegename+"(id int not null auto_increment,userid varchar(255),filename varchar(255),file longtext,content varchar(255),date1 varchar(255),primary key(id))";
		   	 int j=st.executeUpdate(sql);
		   	if(i > 0&&j==0){
				o.println("<script type=\"text/javascript\">");
				o.println("alert('College Added Successfully...');");
				o.println("window.location='AddCollege.jsp';</script>");
			}else{
				o.println("<script type=\"text/javascript\">");
				o.println("alert('Please enter valid Details/Already Exist');");
				o.println("window.location='AddCollege.jsp';</script>");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		UserBean ub = new UserBean();
		ub.setCollegename(collegename);
		ub.setCollegeid(collegeid);
		ub.setCollegepwd(collegepwd);
		String sql = "insert into regcollege values(?,?,?)";
		int i=DBConnection.URegister(sql, ub);
		if(i>0)
		{
				out.println("<script type=\"text/javascript\">");
				out.println("alert('University Added Successfully');");
				out.println("window.location='AddCollege.jsp'</script>");
			} 
		else{
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Failed to Add University');");
			out.println("window.location='AddCollege.jsp'</script>");
		}
}
}