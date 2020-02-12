/**
 * 
 */
package com.cesar.springboot.web.app.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cesar.springboot.web.app.models.User;

/**
 * @author Cesar Gutierrez
 *
 */
@Controller
public class IndexController {
	
	@GetMapping({"/index", "/", "home"})
	public String index(Model model){
		model.addAttribute("title", "Hello Spring boot Framework! :D ");
		return "index";
	}
 
	
	
	@GetMapping("/perfil")
	public String perfil(Model model){
		User user = new User();
		user.setName("Cesar Jesus");
		user.setLastName("Gutierrez");
		model.addAttribute("title", "Hello "+user.getName()+"! :D ");
		model.addAttribute("user", user);
		return "perfil";
	}
	

	@GetMapping("/list")
	public String list(Model model){
		List<User> users = new ArrayList<>();
		users.add(new User("Cesar Jesus", "Gutierrez", "cgutierrez@na-at.com"));
		users.add(new User("Pablo", "Suarez", "psuarez@na-at.com"));
		users.add(new User("Andres", "Torres", "atorres@na-at.com"));
		model.addAttribute("title", "Lista de usuarios");
		model.addAttribute("users", users);
		return "list";
	}
}
