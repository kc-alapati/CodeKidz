package com.example.demo.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="course")
public class Course {
	@Id
	@Column(name="course_id")
	int id;
	
	@Column(name="course_name")
	String name;
	
	@Column(name="course_price")
	int price;
	
	@OneToMany
	List<Lesson> lessons;
	
	@ManyToMany
	List<Users> userList;

	
	public List<Lesson> getLessons() {
		return lessons;
	}


	public void setLessons(List<Lesson> lessons) {
		this.lessons = lessons;
	}


	public List<Users> getUserList() {
		return userList;
	}


	public void setUserList(List<Users> userList) {
		this.userList = userList;
	}


	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Course(int id, String name, int price, List<Lesson> lessons) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.lessons = lessons;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "course [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
}
