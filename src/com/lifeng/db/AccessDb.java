package com.lifeng.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import com.lifeng.tools.SysTools;
import com.lifeng.window.MainApp;

/**
 * @author lifeng
 *         email: shandong-li@hotmail.com
 * @date 2013-6-26
 * @version 1.0.0
 */

public class AccessDb {

	public static final String mdbPath = "C:\\Database.accdb";
	public static int size;
	public static Vector vector;
	public static Vector getMdbList()  {
		Vector resultList = new Vector();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {

			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

			String url = "jdbc:odbc:Driver={Microsoft access driver (*.mdb, *.accdb)};DBQ="
					+ AccessDb.mdbPath;// 此为NO-DSN方式
			conn = DriverManager.getConnection(url);
			stmt = conn.createStatement();
			
		
			rs = stmt.executeQuery(" select * from 客户 ");
			
			while (rs.next()) {
				Custom ms = new Custom();
				ms.setId(rs.getInt(1));
				ms.setName(rs.getString("客户名称"));
				ms.setNation(rs.getString("国家"));
				ms.setMail(rs.getString("电子邮箱"));
				ms.setPhoto(rs.getString("电话"));
				ms.setWeb(rs.getString("公司网站"));
				ms.setCreate_date(SysTools.sf.format(rs.getTimestamp("创建时间")));
				ms.setRemark(rs.getString("备注"));
				resultList.add(ms);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				rs.close();
				stmt.close();
				conn.close();
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				//throw e;
			}
		}
		return resultList;
	}
	
	public static void saveCustom(Custom custom) throws SQLException{
		Vector resultList = new Vector();
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {

			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

			String url = "jdbc:odbc:Driver={Microsoft access driver (*.mdb, *.accdb)};DBQ="
					+ AccessDb.mdbPath;// 此为NO-DSN方式
			conn = DriverManager.getConnection(url);
			if(custom.getId()!= 0){
				stmt = conn.prepareStatement(" update 客户 set 客户名称=?,国家=?,电子邮箱=?,电话=?,公司网站=?,创建时间=?,备注=?  where id=?");
				stmt.setString(1, custom.getName());
				stmt.setString(2, custom.getNation());
				stmt.setString(3, custom.getMail());
				stmt.setString(4, custom.getPhoto());
				stmt.setString(5, custom.getWeb());
				stmt.setTimestamp(6, Timestamp.valueOf(custom.getCreate_date()));
				stmt.setString(7, custom.getRemark());
				stmt.setInt(8, custom.getId());
				stmt.executeUpdate();
			}else{
				stmt = conn.prepareStatement(" insert into 客户(客户名称,国家,电子邮箱,电话,公司网站,创建时间,备注) values(?,?,?,?,?,?,?)");
				stmt.setString(1, custom.getName());
				stmt.setString(2, custom.getNation());
				stmt.setString(3, custom.getMail());
				stmt.setString(4, custom.getPhoto());
				stmt.setString(5, custom.getWeb());
				stmt.setTimestamp(6, Timestamp.valueOf(custom.getCreate_date()));
				stmt.setString(7, custom.getRemark());
				stmt.executeUpdate();
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				
				stmt.close();
				conn.close();
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw e;
				//throw e;
			}
		}
		
	}
	
	public static Custom getCustom(int id) {
	
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Custom ms = null; 
		try {

			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

			String url = "jdbc:odbc:Driver={Microsoft access driver (*.mdb, *.accdb)};DBQ="
					+ AccessDb.mdbPath;// 此为NO-DSN方式
			conn = DriverManager.getConnection(url);
			
			stmt = conn.prepareStatement(" select * from 客户  where id =?");
			stmt.setInt(1, id);
			rs = stmt.executeQuery();
			while (rs.next()) {
			    ms = new Custom();
				ms.setId(rs.getInt(1));
				ms.setName(rs.getString("客户名称"));
				ms.setNation(rs.getString("国家"));
				ms.setMail(rs.getString("电子邮箱"));
				ms.setPhoto(rs.getString("电话"));
				ms.setWeb(rs.getString("公司网站"));
				ms.setCreate_date(SysTools.sf.format(rs.getTimestamp("创建时间")));
				ms.setRemark(rs.getString("备注"));
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				
				stmt.close();
				conn.close();
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
				//throw e;
			}
		}
		return ms;
		
	}
	public static void deleteCustom(int id) {
		
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Custom ms = null; 
		try {

			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

			String url = "jdbc:odbc:Driver={Microsoft access driver (*.mdb, *.accdb)};DBQ="
					+ AccessDb.mdbPath;// 此为NO-DSN方式
			conn = DriverManager.getConnection(url);
			
			stmt = conn.prepareStatement("delete from 客户  where id =?");
			stmt.setInt(1, id);
			stmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				
				stmt.close();
				conn.close();
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
				//throw e;
			}
		}
	
		
	}
	public static void main(String args[]) throws SQLException {
		AccessDb db = new AccessDb();
		Vector resultList = db.getMdbList();
		System.out.println(resultList.size());
	}
}
