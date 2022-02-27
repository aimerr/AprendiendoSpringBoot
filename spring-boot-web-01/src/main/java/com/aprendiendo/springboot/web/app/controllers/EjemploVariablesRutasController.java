package com.aprendiendo.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/variables")
public class EjemploVariablesRutasController {

	
	@GetMapping("/")
	public String index(Model model) {
		
		return "variables/index";
	}
	
	
	 @GetMapping("/string/{text}")
	 public String variables(@PathVariable(name = "text") String texto, Model model) {
		 
		 model.addAttribute("resultado", "El parametro de la ruta enviado es: "+texto);
		 
		 return "variables/ver";
	 }
	 
	 @GetMapping("/string/{text}/{edad}")
	 public String variables(@PathVariable(name = "text") String texto, 
			 @PathVariable int edad, Model model) {
		 
		 model.addAttribute("resultado", "El parametro de la ruta enviado es: "+texto+" - y la edad es:"+edad);
		 
		 return "variables/ver";
	 }
	 
}
