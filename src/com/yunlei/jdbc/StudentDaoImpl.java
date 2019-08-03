package com.yunlei.jdbc.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.yunlei.jdbc.dao.IStudentDao;
import com.yunlei.jdbc.domain.Student;
import com.yunlei.jdbc.util.JDBCUtil;

/**
 * 学生表方法的实现类1
 * 
 * @author mysql
 *
 */
public class StudentDaoImpl implements IStudentDao{
	@Override
	/**
	 * 存储学生的方法
	 */
	public void save(Student stu) {
		String sql = "insert into student(name,age) values(?,?)";
		QueryRunner qr = new QueryRunner(JDBCUtil.getDataSource());
		try {
			qr.update(sql,stu.getName(),stu.getAge());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	/**
	 * 插入新学生的方法
	 */
	public void update(int id, Student stu) {
		String sql = "update student set name= ?, age = ?  where id= ? ";
		QueryRunner qr = new QueryRunner(JDBCUtil.getDataSource());
		try {
			qr.update(sql,stu.getName(),stu.getAge(),id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	@Override
	/**
	 * 删除指定id的学生的方法
	 */
	public void delete(int id) {
		String sql = "delete from student where id = ? ";
		QueryRunner qr = new QueryRunner(JDBCUtil.getDataSource());
		try {
			qr.update(sql,id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	/**
	 * 获得指定id学生的信息
	 */
	public Student get(int id) {
		String sql = "select * from student where id = ?";
		QueryRunner qr = new QueryRunner(JDBCUtil.getDataSource());
		try {
			return qr.query(sql, new BeanHandler<Student>(Student.class),id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	/**
	 * 获得表里所有学生的信息
	 */
	public List<Student> getAll() {
	     String sql = "select * from student";
	 	QueryRunner qr = new QueryRunner(JDBCUtil.getDataSource());
		try {
			return qr.query(sql, new BeanListHandler<Student>(Student.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Integer getCount() {
		String sql = "select count(*) as count from student";
	return null;
		
	}
	
	
}




