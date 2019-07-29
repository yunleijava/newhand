package com.yunlei.jdbc.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

/**
 * �û���¼����1
 * PreparedStatement
 * ��ֹSQLע��
 * @author mysql
 *
 */
public class LoginTest {
	@Test
	public void test() throws Exception {

		System.out.println(this.login("'OR 1=1 OR'", "12333224"));
	}

	String login(String userName, String pwd) throws Exception {
		// 1.�������ݿ�
		Connection conn = JDBCUtil.getConn();
		// 2.�鿴��û���û���Ϊ�����,����Ҫ��
		String sql = "select * from user where name = ? and pwd = ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, userName);
		ps.setString(2, pwd);
	
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			JDBCUtil.close(conn, ps, rs);
			return "��¼�ɹ�";
		} else {
			JDBCUtil.close(conn, ps, rs);
			return "��¼ʧ��";
		}

	}
}
