package com.servicio.calculo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.servicio.calculo.service.CombateService;


@RestController
@RequestMapping("/combate")
public class CombateController {

	@Autowired
	private CombateService service;
	
	@PostMapping("/iniciar")
	public ResponseEntity<List<String>> iniciarCombate() {
		
		service.iniciarCombate(null);
		
		
		return null;
		
		
	}
	
	
	
	
	
	
	
}

