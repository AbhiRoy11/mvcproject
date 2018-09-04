package com.spring.mvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.mvc.dao.api.StudentDao;
import com.spring.mvc.dao.entity.Student;

@Controller
public class BaseController {

	@Autowired
	StudentDao dao;
	
	@RequestMapping("/")
	public String getIndexPage(){
		return "index";
		
	}
	@RequestMapping(value="/storeData",method=RequestMethod.POST)
	public String storeData(HttpServletRequest req) {
		String name=req.getParameter("name");
		String course=req.getParameter("course");
		Student student=new Student();
		student.setName(name);
		student.setCourse(course);
		dao.store(student);
		return "index";
	}


}