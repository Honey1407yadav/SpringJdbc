package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

public class Main {
	public static void main(String[] args) {
		System.out.println("My program started...............");
		//spring jdbc ---> jdbcTemplate
		
		//using xml file
		//ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");

		
		
		//using annotation
		ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
		
		
		
		//		JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
//		
//		//insert query
//		String query = "insert into student(id,name,city)values(?,?,?)";
//		
//		//fire query
//		int result = template.update(query,3,"Priya tomar", "Delhi");
//		System.out.println("Number of record inserted.."+ result);
	
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
		
//		//for insertion
//		Student student = new Student();
//		student.setId(5);
//		student.setName("Priya tomar");
//		student.setCity("Delhi");
//		
//		int result = studentDao.insert(student);
//		
//		System.out.println("Student added" + result);
	
	
		
//		//for updation
//		Student student = new Student();
//		student.setId(3);
//		student.setName("Ankita");
//		student.setCity("Lucknow");
//		
//		int result = studentDao.update(student);
//		System.out.println("Data Updated..." + result );
//		
	
		
//	//For Delete 
//		int result = studentDao.delete(4);
//		System.out.println("Deleted"+ result);
//	
		
		
		
//		//select single student data
//		Student student = studentDao.getStudent(2);
//		System.out.println(student);
		
		
		// select multiple student data
		List<Student> students = studentDao.getAllStudent();
		for(Student s : students)
		{
			System.out.println(s);
		}
		
		
	}
}
