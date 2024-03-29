package com.yunlei.jdbc.dao.test;
/**
 * JD1
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
		// //1连接数据库
		// Connection conn = JDBCUtil.getConn();
		// //2.调用存储过程
		// CallableStatement cs = conn.prepareCall("{ call getStu(?) }");
		// //3.设置参数
		// cs.setString(1, "李白");
		// //4.执行存储过程
		// ResultSet rs = cs.executeQuery();
		// if(rs.next()){
		// Student stu = new Student();
		// stu.setId(rs.getInt("id"));
		// stu.setName(rs.getString("name"));
		// stu.setAge(rs.getInt("age"));
		// System.out.println(stu);
		//
		// }

		// 1连接数据库
		Connection conn = JDBCUtil.getConn();
		// 2.调用存储过程
		CallableStatement cs = conn.prepareCall("{ call getName(?,?) }");
		// 3.设置参数
		cs.setInt(1, 7);
		cs.registerOutParameter(2, Types.VARCHAR);
		cs.execute();
		String name = cs.getString(2);
		System.out.println(name);
		cs.close();

	}

}
