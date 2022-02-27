package com.aprendiendo.springboot.di.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aprendiendo.springboot.di.app.models.domain.Factura;
import com.aprendiendo.springboot.di.app.models.service.IMiServicio;
import com.aprendiendo.springboot.di.app.models.service.MiServicioService;

@Controller
@RequestMapping("/factura")
public class FacturaController {

	@Autowired
	private Factura factura;
	
	
	@GetMapping({"/ver"})
	public String ver(Model model) {
		
		model.addAttribute("title", "Ejemplo de factura con inyección de dependencia.");
		model.addAttribute("factura", factura);
		return "factura/ver";
	}

	
	
	
	
}
