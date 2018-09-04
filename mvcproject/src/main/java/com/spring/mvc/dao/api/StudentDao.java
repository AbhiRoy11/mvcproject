package com.spring.mvc.dao.api;

import com.spring.mvc.dao.entity.Student;

public interface StudentDao {
	
	public void store(Student student);
	public Student getStudent(Student student);

}