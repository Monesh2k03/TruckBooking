package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.model.UsersModel;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {
	
	BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder(12);
	
	@Autowired
	private UserRepository repo;

	public UsersModel saveUsers(UsersModel user) {
		
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		return repo.save(user);
	}
	
	

}
