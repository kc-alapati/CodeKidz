package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Users;
import com.example.demo.service.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
public class NavigationController {

	private UserService us;

	public NavigationController(UserService userService) {
		this.us = userService;
	}

	@GetMapping("/register")
	public String register() {
		return "register";
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@PostMapping("/register")
	public String addUser(@RequestParam("name") String name, @RequestParam("email") String email,
			@RequestParam("password") String password, @RequestParam("role") String role, Model model) {
		boolean emailExists = us.checkEmail(email);
		if (emailExists == false) {
			Users user = new Users();
			user.setName(name);
			user.setEmail(email);
			user.setPassword(password);
			user.setRole(role);
			us.addUser(user);

			model.addAttribute("userSuccess", true);
			System.out.println("User Registered Succesfully");
			return "index";

		} else {
			model.addAttribute("userExists", true);
			System.out.println("User Already Exists!");
			return "register";
		}
	}

	@GetMapping("/services")
	public String service() {
		return "services";
	}

	@GetMapping("/help")
	public String help() {
		return "help";
	}

	@GetMapping("/aboutus")
	public String aboutus() {
		return "aboutus";
	}

	@PostMapping("/validate")
	public String validate(@RequestParam("email") String email, @RequestParam("password") String password,
			HttpSession session, Model model) {
		if (us.checkEmail(email)) {
			boolean val = us.validate(email, password);
			// if user is valid
			if (val) {
				Users user = us.getUser(email);
				session.setAttribute("loggedInUser", user);
				if (us.getUserRole(email).equals("trainer")) {
					model.addAttribute("trainerName", user.getName());
					return "trainerHome";
				} else {
					model.addAttribute("studentName", user.getName());
					return "studentHome";
				}
			} else {
				model.addAttribute("loginFailed", true); // Add loginFailed attribute to indicate failure
				return "index"; // Assuming your index.html template is named "index.html"
			}
		} else {
			model.addAttribute("loginFailed", true); // Add loginFailed attribute to indicate failure
			return "index"; // Assuming your index.html template is named "index.html"
		}
	}

	@GetMapping("/createCourse")
	public String createCourse() {
		return "createCourse";
	}

	@GetMapping("/addLesson")
	public String addLesson() {
		return "addLesson";
	}

}
