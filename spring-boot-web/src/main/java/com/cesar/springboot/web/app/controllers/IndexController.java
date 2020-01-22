/**
 * 
 */
package com.cesar.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
 
}
