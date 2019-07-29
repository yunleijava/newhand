package com.yunlei.jdbc.dao.test;

import java.util.List;

import org.junit.Test;

import com.yunlei.jdbc.dao.IStudentDao;
import com.yunlei.jdbc.dao.impl.StudentDaoImpl;
import com.yunlei.jdbc.domain.Student;

/**
 * 学生表DAO测试类1
 * @author mysql
 *
 */
public class StudentDaoTest {
@Test
/**
 * 把学生保存在数据库中
 */
public void save(){
	Student stu = new Student();
	stu.setName("李白");
	stu.setAge(200);
	//把学生保存在数据库中
	IStudentDao dao = new StudentDaoImpl();//多态的写法
	dao.save(stu);
}
@Test
/**
 * 把学生数据更新到数据库中
 */
public void update(){
	IStudentDao dao = new StudentDaoImpl();
	Student stu = new Student();
	stu.setName("魯班7");
	stu.setAge(23);
	//把学生保存在数据库中
	dao.update(3, stu);
}
@Test
/**
 * 把学生数据更新到数据库中
 */
public void delete (){
	IStudentDao dao = new StudentDaoImpl();//多态的写法
	dao.delete(4);
}
@Test
/**
 * 	获取指定学生
 */
public void get(){
	IStudentDao dao = new StudentDaoImpl();
	Student stu = dao.get(4);
	System.out.println(stu);
}
@Test
/**
 * 	获取学生表
 */
public void getAll(){
	IStudentDao dao = new StudentDaoImpl();
    List<Student> allStu = dao.getAll();
    System.out.println(allStu);
}
}
