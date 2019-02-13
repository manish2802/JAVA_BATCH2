/**FileName:DBUtil.java
 *  @author manish
 */

package com.newzen.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtil {

	
	static String DRIVER_NAME="oracle.jdbc.driver.OracleDriver";
	static String URL="jdbc:oracle:thin:@127.0.0.1:1521:ORCL";
	static String USER_NAME="gen";
	static String PASSWORD="manish";
	
	/**
	 * For getting the connection
	 * 
	 * @return
	 */
	public static Connection getConnection() {
		Connection con = null;
		// step1 load the driver class
		try {
			Class.forName(DRIVER_NAME);
			con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
		} catch (Exception e) {
			System.out.println("Issued occure while connection " + e);
		}

		return con;
	}

	
	/**
	 * 
	 * @param con
	 */
	public static void close(Connection con, PreparedStatement psmt) {

		try {
			if (null != con) {
				con.close();
			}
			if (null != psmt) {
				psmt.close();
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	
	
	/**
	 * 
	 * @param con
	 */
	public static void close(Connection con, PreparedStatement psmt, ResultSet rs) {

		try {
			if (null != con) {
				con.close();
			}
			if (null != psmt) {
				psmt.close();
			}
			if (null != rs) {
				rs.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
