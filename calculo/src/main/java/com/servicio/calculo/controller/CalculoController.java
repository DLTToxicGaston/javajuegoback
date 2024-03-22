package com.servicio.calculo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.servicio.calculo.dto.SumaDto;
import com.servicio.calculo.service.CalculoService;

@RestController
@RequestMapping("/calculo")
public class CalculoController {
	
	@Autowired
	public CalculoService calculoService; 
	
	@PostMapping(value="/sumar")
	public int sumas(@RequestBody SumaDto datatransfer){
		return calculoService.suma(datatransfer);
	}
	
	@PostMapping(value="/resta")
	public int r(@RequestBody SumaDto datatransfer) {
		return calculoService.resta(datatransfer);
	}
			
    @PostMapping(value="/multiplicar")
    public int m(@RequestBody SumaDto datatransfer) {
    	return calculoService.multiplicacion(datatransfer);
    	
    }
}
