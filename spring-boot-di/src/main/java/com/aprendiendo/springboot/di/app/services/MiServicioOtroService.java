package com.aprendiendo.springboot.di.app.services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service("funcion")
public class MiServicioOtroService implements IMiServicio{

	public String operacion() {
		
		return "ejecutando una función importante...";
	}
}
