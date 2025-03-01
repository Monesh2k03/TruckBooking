package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.UsersModel;
import com.example.demo.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService service;

	
	@PostMapping("/signup")
	public ResponseEntity<Map<String,Object>> saveUsers(@RequestBody UsersModel user){
		
		Map<String,Object> response = new HashMap<>();
		
		if(user.getFname() != null || user.getLname() != null || user.getEmail() != null || user.getPassword()!= null) {
			UsersModel model = service.saveUsers(user);
			response.put("message", model);
			response.put("Status",HttpStatus.CREATED);
		}
		
		else {
			response.put("message", "Some of the details are missing");
			response.put("Status",HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<Map<String,Object>>(response,HttpStatus.OK);
		
	}
}
