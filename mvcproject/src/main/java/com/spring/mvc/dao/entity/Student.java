package com.spring.mvc.dao.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int roll;
private String name;
private String course;

public int getRoll() {
	return roll;
	
}
public void setRoll(int roll) {
	this.roll=roll;

}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}


}