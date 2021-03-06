package com.aprendiendo.springboot.web.app.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.thymeleaf.expression.Arrays;

import com.aprendiendo.springboot.web.app.models.Usuario;

@Controller
@RequestMapping("/app")
public class IndexController {
	
	@Value("${texto.indexcontroller.index.titulo}")
	private String textoIndex;

	@Value("${texto.indexcontroller.perfil.titulo}")
	private String textoPerfil;

	@Value("${texto.indexcontroller.listar.titulo}")
	private String textoListar;

	// @RequestMapping(value = "/index", method = RequestMethod.GET)
	@GetMapping({ "/index", "/", "", "home" })
	public String index(Model model, ModelMap modelMap, Map<String, Object> map) {

		//model.addAttribute("title", "Aprendiendo Spring Boot");
		model.addAttribute("title", textoIndex);
		
		model.addAttribute("model", "Model");
		modelMap.addAttribute("modelMap", "ModelMap");
		map.put("map", "Map Java");

		return "index";
	}

	@GetMapping({ "/index1", "home1" })
	public ModelAndView index2(ModelAndView modelAndView) {

		modelAndView.addObject("title", "Aprendiendo Spring MODELANDVIEW");
		modelAndView.setViewName("index");

		return modelAndView;
	}

	@RequestMapping("/perfil")
	public String perfil(Model model) {

		Usuario usuario = new Usuario();
		usuario.setNombre("Aimer");
		usuario.setApellido("Rodriguez");
		usuario.setEmail("aimerr@uninorte.edu.co");

		//model.addAttribute("title", "Perfil de" + usuario.getNombre());
		model.addAttribute("title", textoPerfil+ usuario.getNombre());
		
		model.addAttribute("usuario", usuario);

		return "perfil";
	}

	@RequestMapping("/listar")
	public String listar(Model model) {

		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(new Usuario("Aimer", "Rodriguez", "aimerr@uninorte.edu.co"));
		usuarios.add(new Usuario("Emily", "Vergara", "emilyrv@uninorte.edu.co"));
		usuarios.add(new Usuario("Luisa", "Valencia", "luisava@uninorte.edu.co"));
		usuarios.add(new Usuario("Sofia", "Zapata", "sofia@uninorte.edu.co"));
		//model.addAttribute("title", "Lista de Usuarios");
		model.addAttribute("title", textoListar);
		model.addAttribute("usuarios", usuarios);

		return "listar";
	}

	@ModelAttribute("usuarioCreador")
	public String datoTodasLasVistas() {
		
		return "AIMER JOSE RODRIGUEZ";
		
	}
	
	
}
