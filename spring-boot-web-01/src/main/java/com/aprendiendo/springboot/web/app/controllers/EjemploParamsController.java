package com.aprendiendo.springboot.web.app.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/params")
public class EjemploParamsController {

	@GetMapping("/")
	public String index(Model model) {
		
		model.addAttribute("resultado", "");
		return "param/index";
	}
	
	
	@GetMapping("/string")
	public String param(@RequestParam(name = "text") String textOtro, 
			@RequestParam(required = false, defaultValue = "") String textOpcinal,
			Model model) {
		
		model.addAttribute("resultado", "El parametro enviado es: "+textOtro+" - "+textOpcinal);
		return "param/ver";
	}
	
	
	@GetMapping("/mix-params")
	public String param(@RequestParam String saludo, 
			@RequestParam int edad,
			Model model) {
		
		model.addAttribute("resultado", "El enviado es: "+saludo+" - y tu edad es: "+edad);
		return "param/ver";
	}
	
	@GetMapping("/mix-params-request")
	public String param(HttpServletRequest request,
			Model model) {
		
		String saludo = request.getParameter("saludo");
		int edad= 0;
		try {
			edad = Integer.parseInt(request.getParameter("edad"));
		} catch (NumberFormatException e) {
			// TODO: handle exception
		}
		
		
		model.addAttribute("resultado", "El enviado es: "+saludo+" - y tu edad es: "+edad);
		return "param/ver";
	}
}
