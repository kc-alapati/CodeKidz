package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Users;
import com.example.demo.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	private UserRepository ur;

	@Autowired
	public UserServiceImpl(UserRepository userRepository) {
		this.ur = userRepository;
	}

	@Override
	public boolean checkEmail(String email) {
		boolean emailExists = ur.existsByEmail(email);
		return emailExists;
	}

	@Override
	public void addUser(Users user) {
		ur.save(user);

	}

	@Override
	public boolean validate(String email, String password) {
		if (ur.existsByEmail(email)) {
			Users u = ur.getByEmail(email);
			String dbPassword = u.getPassword();
			if (password.equals(dbPassword)) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@Override
	public Users getUser(String email) {
		Users u = ur.getByEmail(email);
		return u;
	}

	@Override
	public String getUserRole(String email) {
		Users u = ur.getByEmail(email);
		String role = u.getRole();
		return role;
	}

	@Override
	public String updateUser(Users user) {
		// TODO Auto-generated method stub
		return null;
	}

}
