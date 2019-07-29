package com.yunlei.jdbc.dao;
/**
 * DAO学生表操作方法的接口1
 */
import java.util.List;

import com.yunlei.jdbc.domain.Student;

public interface IStudentDao {
	//1.保存数据
	void save(Student stu);
	//2.修改指定学生信息
	void update(int id,Student stu);
	//3.删除学生
	void delete(int id);
	//4.获取指定学生
	Student get(int id);
	//5.获取所有学生
	List<Student>getAll();
	

}
