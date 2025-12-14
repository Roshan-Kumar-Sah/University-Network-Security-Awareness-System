package com.dao;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.beans.CollegeBean;
import com.beans.StoreBean;
import com.beans.UserBean;

public class DBConnection {
	public static Connection connect() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/Mjns07-2024", "root", "root");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return con;
}
	public static int URegister(String sql, UserBean ub) {
		// TODO Auto-generated method stub
		int i = 0;
		Connection con = connect();
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, ub.getCollegename());
			ps.setString(2, ub.getCollegeid());
			ps.setString(3, ub.getCollegepwd());
			i = ps.executeUpdate();
			ps.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
	public static boolean getData(String sql) {
		// TODO Auto-generated method stub
		boolean b = false;
		Connection con = connect();
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			b = rs.next();
			rs.close();
			ps.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return b;
	}
	public static String getName(String sql) {
		// TODO Auto-generated method stub
		String name ="";
		Connection con = connect();
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				name = rs.getString(1);
			}
			rs.close();
			ps.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return name;

	}
	public static int setCollege(String collegename, String collegeid,String collegepwd) {
		// TODO Auto-generated method stub
		int i=0;
		Connection con=DBConnection.connect();
		try {
			Statement st=con.createStatement();
			String sql="insert into regcollege values('"+collegename+"','"+collegeid+"','"+collegepwd+"')";
			i=st.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return i;
	}
	public static ResultSet getCollegeInfo() throws SQLException
	{
		Connection con=connect();
		java.sql.Statement s=con.createStatement();
		ResultSet rs=(ResultSet) s.executeQuery("select * from gnit");
		return rs;
	}
	public static ResultSet getCollegeInfo1() throws SQLException
	{
		Connection con=connect();
		java.sql.Statement s=con.createStatement();
		ResultSet rs=(ResultSet) s.executeQuery("select * from regcollege");
		return rs;
	}
	public static int CRegister(CollegeBean u)
	{
		Connection con=DBConnection.connect();
		try {
			Statement s=con.createStatement();
			int i=s.executeUpdate("insert into rcollege values('"+u.getCname()+"','"+u.getCid()+"','"+u.getCaddress()+"','"+u.getCpassword()+"','Pending','"+u.getUselection()+"')");
			return i;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		return 0;
		}
		
	}
	public static List<String> getCServer(String sql) {
		// TODO Auto-generated method stub
		List<String> lt = new ArrayList<String>();
		Connection con = connect();
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				lt.add(rs.getString(1));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lt;
	}
	 public static ResultSet getData5(String sql) {
			// TODO Auto-generated method stub
				Connection con = connect();
				ResultSet rs = null;
				try{
					PreparedStatement ps = con.prepareStatement(sql);
					rs = ps.executeQuery();
				}catch(SQLException e){
					e.printStackTrace();
				}
				return rs;
			}
	 public static int update(String sql) {
			// TODO Auto-generated method stub
			int i = 0;
			Connection con = connect();
			try {
				PreparedStatement ps = con.prepareStatement(sql);
				i = ps.executeUpdate();
				ps.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return i;
		}
	 public static int userRegister(String sql1, CollegeBean ub) {
			// TODO Auto-generated method stub
				int i = 0;
				Connection con = connect();
				try{
					PreparedStatement ps = con.prepareStatement(sql1);
					ps.setString(1, ub.getCname());
					ps.setString(2, ub.getCid());
					ps.setString(3, ub.getCaddress());
					ps.setString(4, ub.getCpassword());
					ps.setString(5, "Approved");
					i = ps.executeUpdate();
				}catch(Exception e){
					e.printStackTrace();
				}
				return i;
			}
	 public static ResultSet getCollegeRequest(String university) throws SQLException
		{
			Connection con =DBConnection.connect();
			String sql="select * from rcollege where status1='Pending' and university1='"+university+"'";
			Statement s=con.createStatement();
			ResultSet r=s.executeQuery(sql);
			return r;
		}
	 public static int store(String sql, StoreBean sb) {
			// TODO Auto-generated method stub
			int i = 0;
			Connection con = connect();
			try {
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, sb.getId());
				ps.setString(2, sb.getUid());
				ps.setString(3, sb.getName());
				InputStream photo = sb.getPhoto();
				if(photo != null){
					ps.setBinaryStream(4, photo);
				}
				ps.setString(6, sb.getDa());
				ps.setString(5, sb.getContent());
				ps.setDouble(7, sb.getSize());
				i = ps.executeUpdate();
			}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return i;
		}
	 public static int addActivity(String email,String activity,String time) throws SQLException
		{	Connection con=null;
		int i=0;	
		try{
			 con =DBConnection.connect();
			String sql="insert into dataanalysis values(0,?,?,?);";
			PreparedStatement p=con.prepareStatement(sql);

			p.setString(3, time);
			p.setString(1, email);
			p.setString(2, activity);
			
			i=p.executeUpdate();
			}catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			}finally{
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return i;
		}
	 public static ResultSet getDataInfo() throws SQLException
		{
			Connection con=connect();
			java.sql.Statement s=con.createStatement();
			ResultSet rs=(ResultSet) s.executeQuery("select * from dataanalysis");
			return rs;
		}
	 public static ResultSet getUnversityData() throws SQLException
		{
			Connection con=connect();
			java.sql.Statement s=con.createStatement();
			ResultSet rs=(ResultSet) s.executeQuery("select * from gnit");
			return rs;
		}
	 public static ResultSet getACollegeInfo(String uid) throws SQLException
		{
			Connection con=connect();
			java.sql.Statement s=con.createStatement();
			ResultSet rs=(ResultSet) s.executeQuery("select * from rcollege where university1='"+uid+"'");
			return rs;
		}
	 public static List<String> getUnversity(String sql) {
			// TODO Auto-generated method stub
			List<String> lt = new ArrayList<String>();
			Connection con = connect();
			try {
				PreparedStatement ps = con.prepareStatement(sql);
				ResultSet rs = ps.executeQuery();
				while(rs.next()){
					lt.add(rs.getString(1));
				}
				rs.close();
				ps.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return lt;
		}
	 public static List<String> getUName(String sql) {
			// TODO Auto-generated method stub
			List<String> lt = new ArrayList<String>();
			Connection con = connect();
			try {
				PreparedStatement ps = con.prepareStatement(sql);
				ResultSet rs = ps.executeQuery();
				while(rs.next()){
					lt.add(rs.getString(1));
					lt.add(rs.getString(2));
					lt.add(rs.getString(3));
				//	lt.add(rs.getString(4));
					lt.add(rs.getString(6));
					lt.add(rs.getString(7));
				}
				rs.close();
				ps.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return lt;
		}
	 public static String getUniversityname1(String sql) {
			// TODO Auto-generated method stub
			String name ="";
			Connection con = connect();
			try {
				PreparedStatement ps = con.prepareStatement(sql);
				ResultSet rs = ps.executeQuery();
				if(rs.next()){
					name = rs.getString(1);
				}
				rs.close();
				ps.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return name;

		}
	 public static int addActivity1(String universityname,String email,String activity,String time) throws SQLException
		{	Connection con=null;
		int i=0;	
		try{
			 con =DBConnection.connect();
			String sql="insert into alarm values(0,?,?,?,?);";
			PreparedStatement p=con.prepareStatement(sql);
			p.setString(4, universityname);
			p.setString(3, time);
			p.setString(1, email);
			p.setString(2, activity);
			i=p.executeUpdate();
			}catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			}finally{
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return i;
		}
	 public static ResultSet getAlarmEventInfo() throws SQLException
		{
			Connection con=connect();
			java.sql.Statement s=con.createStatement();
			ResultSet rs=(ResultSet) s.executeQuery("select * from alarm");
			return rs;
		}
	 public static ResultSet sendAlarmEventInfo() throws SQLException
		{
			Connection con=connect();
			java.sql.Statement s=con.createStatement();
			ResultSet rs=(ResultSet) s.executeQuery("select * from alarm");
			return rs;
		}
	 public static ResultSet getAlarmNotificationInfo(String name ) throws SQLException
		{
			Connection con=connect();
			java.sql.Statement s=con.createStatement();
			ResultSet rs=(ResultSet) s.executeQuery("select * from notify1 where victimname='"+name+"'");
			return rs;
		}
	 public static String getkey (String fid)
		{
		String key="";
			Connection con =DBConnection.connect();
			String sql="select collegename from regcollege";
			Statement s;
		try {
			s = con.createStatement();
			ResultSet r=s.executeQuery(sql);
			r.next();
			key=r.getString(1);
			r.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
			return key;
		}
}