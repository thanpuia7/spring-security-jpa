package com.javatechie.spring.security.api.model;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity

public class User {
	@Id
	private String username;
	private String password;
	private String email;
	
	
	
	@ManyToMany(fetch=FetchType.EAGER,
			cascade= {CascadeType.ALL
			})
	@JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "username"), inverseJoinColumns = @JoinColumn(name = "role"))
	private List<Role> roles;
	
	
	public User(String username, String password, String email) {
		
		this.username = username;
		this.password = password;
		this.email = email;
	}


	public User(String username, String password, String email, List<Role> roles) {
	
		this.username = username;
		this.password = password;
		this.email = email;
		this.roles = roles;
	}





	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public List<Role> getRoles() {
		return roles;
	}


	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}


	public User() {
		
	}


	
}
