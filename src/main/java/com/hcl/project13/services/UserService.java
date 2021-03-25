package com.hcl.project13.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.project13.repositories.UserRepository;
import com.hcl.project13.entities.User;

@Service
public class UserService {

	@Autowired
	 private UserRepository userRepository;
	
	public User GetUserByName(String name) {
		
		User retrievedUser = userRepository.findByName(name);
		return retrievedUser;
	}
	
	public User CreateUser(User newUser) {
		return userRepository.save(newUser);
	}
}
