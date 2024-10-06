package com.example.demo.service;

import com.example.demo.entity.Users;

public interface UserService {
	public void addUser(Users user);
	public boolean checkEmail(String email);
	public boolean validate(String email, String password);
	public Users getUser(String email);
	public String getUserRole(String email);
	public String updateUser(Users user);
}
