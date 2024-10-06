package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Course;
import com.example.demo.entity.Lesson;
import com.example.demo.service.TrainerService;

@Controller
public class TrainerController {

	private TrainerService ts;

	public TrainerController(TrainerService ts) {
		this.ts = ts;
	}

	@PostMapping("/addCourse")
	public String addCourse(@RequestParam("courseId") int courseId, @RequestParam("courseName") String courseName,
			@RequestParam("coursePrice") int coursePrice) {
		Course course = new Course();
		course.setId(courseId);
		course.setName(courseName);
		course.setPrice(coursePrice);
		Course c = ts.addCourse(course);
		if (c != null) {
			return "/trainerHome";
		} else {
			return "/createCourseFail";
		}
	}

	@PostMapping("/lesson")
	public String lesson(
			@RequestParam("courseId") int courseId, 
			@RequestParam("lessonId") int lessonId,
			@RequestParam("lessonName") String lessonName, 
			@RequestParam("link") String link,
			@RequestParam("topics") String topics)
			 {

		Course course = ts.getCourse(courseId);
		Lesson lesson = new Lesson(lessonId, lessonName,  link, topics, course);
		ts.addLesson(lesson);
		course.getLessons().add(lesson);
		ts.saveCourse(course);
		return "/trainerHome";
	}

	@GetMapping("/showCourses")
	public String showCourses(Model model) {
	    List<Course> courseList = ts.courseList();
	    model.addAttribute("courses", courseList);
	    return "courses"; // The template name remains as "courses"
	}


	@GetMapping("/courses/{course_id}/lessons")
	public String showCourseLessons(@PathVariable("course_id") int courseId, Model model) {
		Course course = ts.getCourse(courseId);
		model.addAttribute("course", course);
		return "/course_lessons";
	}

}