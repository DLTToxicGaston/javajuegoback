package com.servicio.calculo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.servicio.calculo.model.Personajes;
import com.servicio.calculo.service.PersonajesService;

@RestController
@RequestMapping("/personajes")
public class PersonajesController {

	
	@Autowired
	private PersonajesService service;
	
	@GetMapping("/{name}")
	public ResponseEntity<Personajes> obtenerPersonajes(@PathVariable String name ) {
		try {
			return new ResponseEntity<>(service.obtenerPersonajes(name),HttpStatusCode.valueOf(201));
		}catch(Exception msj) {
			return new ResponseEntity<>(null,HttpStatusCode.valueOf(406));
		}
		
		
		
	}
	
	@PostMapping("/crear")
	public ResponseEntity<String> reformacionPersonajes(@RequestBody Personajes personaje) {
		try {
			return new ResponseEntity<>(service.delta(personaje),HttpStatusCode.valueOf(201));
		}catch(Exception msj) {
			return new ResponseEntity<>("lo sentimos no pudimos crear el personaje",HttpStatusCode.valueOf(406));
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
