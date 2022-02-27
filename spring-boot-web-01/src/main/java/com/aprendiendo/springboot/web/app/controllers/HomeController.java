package com.aprendiendo.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String home(){
		
		//Cambia la url - Otro request
		//return "redirect:app/index";
		//return "redirect:https://www.google.com/";
		
		//Re-dirije  a otros controladores y mantiene el mismo request
		return "forward:/app/index";
		
	}
	
	
	
}
