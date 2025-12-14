package com.servlets;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
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
import javax.servlet.http.HttpSession;

import com.beans.AttackBean;
import com.dao.DBConnection;

/**
 * Servlet implementation class ViewOtherFiles
 */
@WebServlet("/ViewOtherFiles")
public class ViewOtherFiles extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewOtherFiles() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*try {
			PrintWriter pw = response.getWriter();
			HttpSession session=request.getSession();
			String fid = request.getParameter("fid");
			String col=(String)session.getAttribute("email");
			System.out.println(fid);
			Connection con = DBConnection.connect();
			Statement st = con.createStatement();
			ResultSet r = st.executeQuery("select * from gnit where universityname ='"
					+ fid + "'");
			OutputStream o = response.getOutputStream();
			if (r.next()) {
				DBConnection.addActivity(col, "Suspicious Data Trying To View by '"+col+"' ", new Date().toLocaleString());
				response.setContentType(r.getString(5));
				o.write(r.getBytes(4));
			
			o.flush();
			o.close();
		} else
			{
				DBConnection.addActivity(col, "Suspicious Data Trying To View by '"+col+"' ", new Date().toLocaleString());
				pw.println("<script type=\"text/javascript\">");
				pw.println("alert('Suspicious Data Vieweing Threat Detected');");
				pw.println("window.location='CollegeLog.jsp';</script>");
			}
			}catch (Exception exception)
			{
			
			exception.printStackTrace();
	}*/
		PrintWriter o = response.getWriter();
		HttpSession session = request.getSession(false);
		String email = (String) session.getAttribute("email");
		String fid = request.getParameter("fid");
		String universityname = request.getParameter("universityname");
		String victimname = request.getParameter("victimname");
		System.out.println("universityname:"+universityname);
		String sql = "select * from gnit where id='" + fid + "' and universityname ='"
				+ universityname + "' and status1 ='Approved' ";
		if (DBConnection.getData(sql) == true) {
		//	response.sendRedirect("ViewFile?fid=" + fid);
		} else {
			try {
				DBConnection.addActivity1(fid,email, "Suspicious Data Trying To View by '"+email+"' ", new Date().toLocaleString());
				sql = "select * from gnit ";
				o.println("<script type=\"text/javascript\">");
				o.println("alert('Suspicious Data Vieweing Threat Detected');");
				o.println("window.location='ViewOtherUniversityData.jsp';</script>");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
			
			/*if (DBConnection.getData(sql) == true) {
				sql = "select * from fcount where uid='" + email + "' && fid='"
						+ fid + "'";*/
				/*if (DBConnection.getData(sql) == true) {
					sql = "select fcount from fcount where uid='" + email
							+ "' && fid='" + fid + "'";
					int count = DBConnection.getCount(sql);
					count = count + 1;
					sql = "update fcount set fcount=" + count + " where uid='"
							+ email + "' && fid='" + fid + "'";
					int i = DBConnection.update(sql);
					if (i > 0) {
						o.println("<script type=\"text/javascript\">");
						o.println("alert('File Keys are Wrong...This is your first attempt');");
						o.println("window.location='apfiles.jsp';</script>");
					} else {
						o.println("<script type=\"text/javascript\">");
						o.println("alert('File Keys are Wrong... This is your first attempt');");
						o.println("window.location='ViewOtherUniversityData.jsp';</script>");
					}
				} else {
					sql = "insert into fcount(fid, uid, fcount) values('" + fid
							+ "','" + email + "',1)";
					int i = DbConnection.update(sql);
					if (i > 0) {
						o.println("<script type=\"text/javascript\">");
						o.println("alert('File Keys are Wrong... This is your first attempt');");
						o.println("window.location='ViewOtherUniversityData.jsp';</script>");
					} else {
						o.println("<script type=\"text/javascript\">");
						o.println("alert('File Keys are Wrong... This is your first attempt');");
						o.println("window.location='ViewOtherUniversityData.jsp';</script>");
					}
				}
			} else {
				int fcount = 0;
				InetAddress ia = InetAddress.getLocalHost();
				String ip = ia.getHostAddress();
				
				sql = "select uid from upload1 where fid='" + fid + "'";
				String own = DBConnection.getName(sql);
				sql = "select * from attack where fid='" + fid
						+ "' and userid='" + email + "'";
				if (DBConnection.getData(sql) == true) {
					sql = "select fcount from attack where fid='" + fid
							+ "' and userid='" + email + "'";
					fcount = DBConnection.getCount(sql);
					fcount = fcount + 1;
					sql = "update attack set fcount="+fcount+" where fid='"+fid+"' and userid='"+email+"'";
					DBConnection.update(sql);
					if (fcount >= 3) {
						sql = "update user set status1='Blocked' where email='"
								+ email + "'";
						int i = DBConnection.update(sql);
						if (i > 0) {
							o.println("<script type=\"text/javascript\">");
							o.println("alert('You try to attack the file multiple times, Now you are Blocked...');");
							o.println("window.location='index.html';</script>");
						} else {
							o.println("<script type=\"text/javascript\">");
							o.println("alert('Please enter valid file keys...');");
							o.println("window.location='ViewOtherUniversityData.jsp';</script>");
						}
					}else {
						o.println("<script type=\"text/javascript\">");
						o.println("alert('Please enter valid file keys... This is your Second attempt');");
						o.println("window.location='ViewOtherUniversityData.jsp';</script>");
					}
				} else {
					Date d = new Date();
					String da = "" + d;
					fcount = 1;
					AttackBean ab = new AttackBean();
					ab.setFid(fid);
					ab.setEmail(email);
					ab.setOwn(own);
					ab.setIp(ip);
					ab.setDa(da);
					ab.setFcount(fcount);
					sql = "insert into attack values(?,?,?,?,?,?)";
					int i = DBConnection.setAttack(sql, ab);
					if (i > 0) {
						o.println("<script type=\"text/javascript\">");
						o.println("alert('File Keys are Wrong...This is your Second attempt');");
						o.println("window.location='ViewOtherUniversityData.jsp';</script>");
					} else {
						o.println("<script type=\"text/javascript\">");
						o.println("alert('Please enter valid file keys... This is your Second attempt');");
						o.println("window.location='ViewOtherUniversityData.jsp';</script>");
					}
				}
			}*/
		}
}
