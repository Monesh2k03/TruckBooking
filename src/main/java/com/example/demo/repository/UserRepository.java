package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.UsersModel;

@Repository
public interface UserRepository extends JpaRepository<UsersModel, Integer> {
	
	UsersModel getByEmail(String userMail);

}
