package com.spring.mvc.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.mvc.dao.api.StudentDao;
import com.spring.mvc.dao.entity.Student;

@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired
	SessionFactory sessionFactory;
	
	public void store(Student student) {
		Session s=sessionFactory.openSession();
		s.getTransaction().begin();
		s.persist(student);
		s.getTransaction().commit();
		s.close();
		
	}

	public Student getStudent(Student student) {
		return null;
	}
	

}