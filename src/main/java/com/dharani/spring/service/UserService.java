package com.dharani.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dharani.entity.User;
import com.dharani.spring.repository.UserRepositoryInterface;

@Service
public class UserService {
	
	
	  @Autowired
	  private UserRepositoryInterface userRepository;
	 
	
	public List<User> getAllUser(){
	
		
		return userRepository.findAll();
		
	}

}
