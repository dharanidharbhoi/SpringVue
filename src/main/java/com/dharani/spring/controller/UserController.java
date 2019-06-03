package com.dharani.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dharani.entity.User;
import com.dharani.spring.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping(path="/user")
	public List<User> getAllUser(){
		return userService.getAllUser();
		
	}

}
