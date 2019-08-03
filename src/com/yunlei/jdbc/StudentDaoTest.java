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
	stu.setName("��we��");
	stu.setAge(683);
	//��ѧ�����������ݿ���
	IStudentDao dao = new StudentDaoImpl();//��̬��д��
	dao.save(stu);
}
@Test
/**
 * ����ѧ��id����ѧ�����ݸ��µ����ݿ���
 */
public void update(){
	Student stu = new Student();
	stu.setName("����");
	stu.setAge(28);
	//��ѧ�����������ݿ���
	IStudentDao dao = new StudentDaoImpl();
	dao.update(11, stu);
}
@Test
/**
 * ��ѧ�����ݸ��µ����ݿ���
 */
public void delete (){
	IStudentDao dao = new StudentDaoImpl();//��̬��д��
	dao.delete(11);
}
@Test
/**
 * 	��ȡָ��ѧ��
 */
public void get(){
	IStudentDao dao = new StudentDaoImpl();
	Student stu = dao.get(5);
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
@Test
/**
 * 	��ȡָ��ѧ��
 */
public void getCount(){
	IStudentDao dao = new StudentDaoImpl();
	System.out.println(dao.getCount());
}
}
