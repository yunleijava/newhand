package com.yunlei.jdbc.domain;
/**
 * student表数据库映射1
 * 符合JAVABbean规范
 * @author mysql
 *
 */
public class Student {
	Integer id;
	String name;
	Integer age;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "] \n";
	}
	
}
