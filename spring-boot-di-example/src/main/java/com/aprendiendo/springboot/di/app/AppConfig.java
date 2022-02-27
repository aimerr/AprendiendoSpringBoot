package com.aprendiendo.springboot.di.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.aprendiendo.springboot.di.app.models.service.IMiServicio;
import com.aprendiendo.springboot.di.app.models.service.PojoServicioService;

@Configuration
public class AppConfig {

	@Bean("pojo")
	public IMiServicio registrarMiervicio() {
		
		return new PojoServicioService();
	}
	
}
