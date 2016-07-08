package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection("jdbc:mysql://localhost/21pointgame?" + 
					"user=root$password=root");
		} catch (SQLException e) {
			System.out.println("SQLException:" + e.getMessage());
			System.out.println("SQLState:" + e.getSQLState());
			System.out.println("VendorError:" + e.getErrorCode());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if(conn != null){
				try {
					conn.close();
				} catch (Exception e2) {
					System.out.println(e2.getMessage());
				}
			}
		}
		return conn;
	}
	
	public static void closeConnection(Connection conn) {
		if(conn != null){
			try {
				conn.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
