package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Course;
import com.example.demo.entity.Lesson;
import com.example.demo.repository.CourseRepository;
import com.example.demo.repository.LessonRepository;

@Service
public class TrainerServiceImpl implements TrainerService {
	private LessonRepository lr;
	private CourseRepository cr;

	public TrainerServiceImpl(LessonRepository lr, CourseRepository cr) {
		this.lr = lr;
		this.cr = cr;
	}

	@Override
	public Course addCourse(Course course) {
		return cr.save(course);
	}

	@Override
	public String addLesson(Lesson lesson) {
		lr.save(lesson);
		return "Lesson Added Succesfully!";
	}
	
	@Override
	public String saveCourse(Course course) {
		cr.save(course);
		return "Course Saved Successfully!";
	}


	@Override
	public Course getCourse(int courseid) {
		return cr.findById(courseid).get();
	}

	@Override
	public List<Course> courseList() {
		return cr.findAll();
	}

}
