package com.spring.jdbc.dao;

import java.util.List;

import com.spring.jdbc.entities.Student;

public interface StudentDao {
	public int insert(Student student); // interface ke andr body nhi likh sakte
	public int update(Student student);  // for updation
	public int delete(int studentId);  //for delete data
	public Student getStudent(int studentId);   //select single student data
	public List<Student> getAllStudent();   //select multiple student data/object

}
