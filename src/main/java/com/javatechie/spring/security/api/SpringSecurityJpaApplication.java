package com.javatechie.spring.security.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.javatechie.spring.security.api.model.User;
import com.javatechie.spring.security.api.service.UserService;




@SpringBootApplication
public class SpringSecurityJpaApplication implements CommandLineRunner{

	
	
	@Autowired
	 private UserService userService;
	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityJpaApplication.class, args);
	}
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		  {
    		  User newAdmin = new User("Admin", "123456","admin@gmail.com");
    		  userService.createAdmin(newAdmin); 
    	  }
}
}