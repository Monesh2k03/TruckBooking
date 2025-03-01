package com.example.demo;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordHasher {
	public static void main(String[] args) {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder(12);
		String pass = "admin123";
		String hashPassword = passwordEncoder.encode(pass);
		System.out.println(hashPassword+":");
	}

}
