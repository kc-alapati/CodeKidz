package com.example.demo.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="lesson")
public class Lesson {
	@Id
	@Column(name="lesson_id")
	int id;
	
	@Column(name="lesson_name")
	String name;
	
	@Column(name="link")
	String link;
	
	@Column(name="topics")
	String topics;
	
	@ManyToOne
	Course course;
	
	@OneToMany
	List<Comments> commentsList;
	
	public Course getCourse() {
		return course;
	}


	public void setCourse(Course course) {
		this.course = course;
	}


	public List<Comments> getCommentsList() {
		return commentsList;
	}


	public void setCommentsList(List<Comments> commentsList) {
		this.commentsList = commentsList;
	}


	public Lesson() {
		super();
	}


	public Lesson(int id, String name, String link, String topics, Course course) {
		super();
		this.id = id;
		this.name = name;
		this.link = link;
		this.topics = topics;
		this.course = course;
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

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getTopics() {
		return topics;
	}

	public void setTopics(String topics) {
		this.topics = topics;
	}

	@Override
	public String toString() {
		return "lesson [id=" + id + ", name=" + name + ", link=" + link + ", topics=" + topics + "]";
	}
	
	

}
