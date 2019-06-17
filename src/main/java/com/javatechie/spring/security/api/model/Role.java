package com.javatechie.spring.security.api.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;




@Entity


public class Role {
	@Id
	private String role;
	
	@ManyToMany(mappedBy = "roles")
	private List<User> user;

	
	
	public Role( String role) {
	
		this.role = role;
	}


	


	public Role() {
		
	}




	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}
	
	
	
}
