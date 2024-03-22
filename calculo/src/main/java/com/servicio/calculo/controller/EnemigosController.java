package com.servicio.calculo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.servicio.calculo.model.Enemigos;
import com.servicio.calculo.model.Personajes;
import com.servicio.calculo.service.EnemigosService;
import com.servicio.calculo.service.PersonajesService;

@RestController
@RequestMapping("/enemigos")
public class EnemigosController {

	
	@Autowired
	private EnemigosService service;
	
	
	@PostMapping("/crear")
	public ResponseEntity<List<Enemigos>> crearEnemigos() {
		try {
			return new ResponseEntity<>(service.crearEnemigos(),HttpStatusCode.valueOf(201));
		}catch(Exception msj) {
			return new ResponseEntity<>(null,HttpStatusCode.valueOf(406));
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
