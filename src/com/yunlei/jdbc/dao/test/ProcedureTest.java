package com.yunlei.jdbc.dao.test;
/**
 * JD
 */
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import com.yunlei.jdbc.domain.Student;
import com.yunlei.jdbc.util.JDBCUtil;

public class ProcedureTest {

	public static void main(String[] args) throws Exception {
		// //1�������ݿ�
		// Connection conn = JDBCUtil.getConn();
		// //2.���ô洢����
		// CallableStatement cs = conn.prepareCall("{ call getStu(?) }");
		// //3.���ò���
		// cs.setString(1, "���");
		// //4.ִ�д洢����
		// ResultSet rs = cs.executeQuery();
		// if(rs.next()){
		// Student stu = new Student();
		// stu.setId(rs.getInt("id"));
		// stu.setName(rs.getString("name"));
		// stu.setAge(rs.getInt("age"));
		// System.out.println(stu);
		//
		// }

		// 1�������ݿ�
		Connection conn = JDBCUtil.getConn();
		// 2.���ô洢����
		CallableStatement cs = conn.prepareCall("{ call getName(?,?) }");
		// 3.���ò���
		cs.setInt(1, 7);
		cs.registerOutParameter(2, Types.VARCHAR);
		cs.execute();
		String name = cs.getString(2);
		System.out.println(name);
		cs.close();

	}

}