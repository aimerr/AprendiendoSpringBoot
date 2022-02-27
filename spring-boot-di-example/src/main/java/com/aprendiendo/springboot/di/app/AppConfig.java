package com.aprendiendo.springboot.di.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.aprendiendo.springboot.di.app.models.domain.ItemFactura;
import com.aprendiendo.springboot.di.app.models.domain.Producto;
import com.aprendiendo.springboot.di.app.models.service.IMiServicio;
import com.aprendiendo.springboot.di.app.models.service.PojoServicioService;

@Configuration
public class AppConfig {

	@Bean("listaItems")
	public List<ItemFactura> registrarItems() {
		
		Producto producto1 = new Producto("Camara Web", 100);
		Producto producto2 = new Producto("Microfono Web", 25);
		
		ItemFactura item1 = new ItemFactura(producto1, 3);
		ItemFactura item2 = new ItemFactura(producto2, 2);
		
		
		return Arrays.asList(item1,item2);
	}
	
}
