package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Lesson;
import com.example.demo.repository.LessonRepository;
import com.example.demo.repository.UserRepository;

@Service
public class StudentServiceImpl implements StudentService {

	UserRepository ur;
	LessonRepository lr;
	public StudentServiceImpl(UserRepository ur, LessonRepository lr) {
		this.ur=ur;
		this.lr=lr;
	}
	
	@Override
	public Lesson getLesson(int lessonId) {
		
		return lr.findById(lessonId).get();
	}

}
