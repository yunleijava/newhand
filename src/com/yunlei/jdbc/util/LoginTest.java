package com.yunlei.jdbc.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

/**
 * 用户登录测试1
 * PreparedStatement
 * 防止SQL注入
 * @author mysql
 *
 */
public class LoginTest {
	@Test
	public void test() throws Exception {

		System.out.println(this.login("'OR 1=1 OR'", "12333224"));
	}

	String login(String userName, String pwd) throws Exception {
		// 1.连接数据库
		Connection conn = JDBCUtil.getConn();
		// 2.查看有没有用户名为传入的,密码要对
		String sql = "select * from user where name = ? and pwd = ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, userName);
		ps.setString(2, pwd);
	
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			JDBCUtil.close(conn, ps, rs);
			return "登录成功";
		} else {
			JDBCUtil.close(conn, ps, rs);
			return "登录失败";
		}

	}
}
