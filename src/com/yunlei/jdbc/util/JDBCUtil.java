package com.yunlei.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * JDBC������1
 * 
 * @author mysql
 *
 */
public class JDBCUtil {
	public static String url = "jdbc:mysql://localhost:3306/jdbc_db?useUnicode=true&characterEncoding=UTF-8"
			+ "&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	// user���ݿ��û���
	public static String user = "root";
	// password���ݿ�����
	public static String password = "123456";
	// 1.�������ݿ�
	public static String driverName = "com.mysql.cj.jdbc.Driver";
	static {
		// ��������
		try {
			Class.forName(JDBCUtil.driverName);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static Connection getConn() {

		// 2.�������ݿ�
		try {
			return DriverManager.getConnection(JDBCUtil.url, JDBCUtil.user, JDBCUtil.password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public static void close(Connection conn, Statement st, ResultSet rs) {
		// 5.�ͷ���Դ
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (st != null) {
			try {
				st.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
