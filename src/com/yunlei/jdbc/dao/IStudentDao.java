package com.yunlei.jdbc.dao;
/**
 * DAOѧ������������Ľӿ�1
 */
import java.util.List;

import com.yunlei.jdbc.domain.Student;

public interface IStudentDao {
	//1.��������
	void save(Student stu);
	//2.�޸�ָ��ѧ����Ϣ
	void update(int id,Student stu);
	//3.ɾ��ѧ��
	void delete(int id);
	//4.��ȡָ��ѧ��
	Student get(int id);
	//5.��ȡ����ѧ��
	List<Student>getAll();
	

}
