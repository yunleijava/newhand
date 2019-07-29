package com.yunlei.jdbc.dao.test;

import java.util.List;

import org.junit.Test;

import com.yunlei.jdbc.dao.IStudentDao;
import com.yunlei.jdbc.dao.impl.StudentDaoImpl;
import com.yunlei.jdbc.domain.Student;

/**
 * ѧ����DAO������1
 * @author mysql
 *
 */
public class StudentDaoTest {
@Test
/**
 * ��ѧ�����������ݿ���
 */
public void save(){
	Student stu = new Student();
	stu.setName("���");
	stu.setAge(200);
	//��ѧ�����������ݿ���
	IStudentDao dao = new StudentDaoImpl();//��̬��д��
	dao.save(stu);
}
@Test
/**
 * ��ѧ�����ݸ��µ����ݿ���
 */
public void update(){
	IStudentDao dao = new StudentDaoImpl();
	Student stu = new Student();
	stu.setName("����7");
	stu.setAge(23);
	//��ѧ�����������ݿ���
	dao.update(3, stu);
}
@Test
/**
 * ��ѧ�����ݸ��µ����ݿ���
 */
public void delete (){
	IStudentDao dao = new StudentDaoImpl();//��̬��д��
	dao.delete(4);
}
@Test
/**
 * 	��ȡָ��ѧ��
 */
public void get(){
	IStudentDao dao = new StudentDaoImpl();
	Student stu = dao.get(4);
	System.out.println(stu);
}
@Test
/**
 * 	��ȡѧ����
 */
public void getAll(){
	IStudentDao dao = new StudentDaoImpl();
    List<Student> allStu = dao.getAll();
    System.out.println(allStu);
}
}
