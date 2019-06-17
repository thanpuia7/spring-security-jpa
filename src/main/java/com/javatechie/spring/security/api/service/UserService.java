package com.javatechie.spring.security.api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.javatechie.spring.security.api.model.Role;
import com.javatechie.spring.security.api.model.User;
import com.javatechie.spring.security.api.repository.UserRepository;



@Service
public class UserService {
	
	
	@Autowired
	private UserRepository userRepository;
	
	public void createUser(User user) {
		BCryptPasswordEncoder  encoder = new  BCryptPasswordEncoder();
		user.setPassword(encoder.encode(user.getPassword())); 
		Role userRole = new Role("USER");
		List<Role> role = new ArrayList<>();
		role.add(userRole);
		user.setRoles(role);
		userRepository.save(user);
	}
	
	public void createAdmin(User user) {
		BCryptPasswordEncoder  encoder = new  BCryptPasswordEncoder();
		user.setPassword(encoder.encode(user.getPassword())); 
		Role userRole = new Role("ADMIN");
		List<Role> role = new ArrayList<>();
		role.add(userRole);
		user.setRoles(role);
		userRepository.save(user);
	}
	
	public User findOne(String email) {
		
	  return userRepository.findByEmail(email);
	}

}
