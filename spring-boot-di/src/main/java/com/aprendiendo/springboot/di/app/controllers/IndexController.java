package com.aprendiendo.springboot.di.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.aprendiendo.springboot.di.app.services.IMiServicio;
import com.aprendiendo.springboot.di.app.services.MiServicioService;

@Controller
public class IndexController {

	@Autowired
	//@Qualifier("funcion")
	@Qualifier("pojo")
	private IMiServicio servicio;
	
	@GetMapping({"","/","index"})
	public String index(Model model) {
		
		model.addAttribute("objeto", servicio.operacion());
		return "index";
	}

	public IMiServicio getServicio() {
		return servicio;
	}

//	@Autowired
//	@Qualifier("funcion")
//	public void setServicio(IMiServicio servicio) {
//		this.servicio = servicio;
//	}

//	@Autowired
//	//Toca ponerle @Primary a una de las clases que implementa la interface por que si no no sirve
//	public IndexController(IMiServicio servicio) {
//		this.servicio = servicio;
//	}
	
	
	
	
}
