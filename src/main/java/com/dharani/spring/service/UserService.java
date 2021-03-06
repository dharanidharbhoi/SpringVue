package com.dharani.spring.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dharani.entity.User;
import com.dharani.spring.dto.UserDTO;
import com.dharani.spring.repository.UserRepositoryInterface;

@Service
public class UserService {
	
	
	  @Autowired
	  private UserRepositoryInterface userRepository;
	 
	
	public List<User> getAllUser(){
		
		
		return userRepository.findAll();
		
	}
	

	public void saveUser(UserDTO userDto){
		
		if(userDto != null) {
			User user = new User();
			user.setUserName(userDto.getUserName());
			user.setFirstName(userDto.getFirstName());
			user.setLastName(userDto.getLastName());
			user.setPassword(userDto.getPassword());
			user.setCreated(new Date());
			userRepository.save(user);
		}
		
		
		
	}

}
