package com.cesar.springboot.web.app.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {

	private String name;
	private String lastName;
	private String email;
	
	public User(){
	}
	
	public User(String name, String lastName, String email){
		this.name = name;
		this.lastName = lastName;
		this.email = email;
	}
	
	
}
