package com.servicio.calculo.service;

import org.springframework.stereotype.Service;

import com.servicio.calculo.dto.SumaDto;

@Service
public class CalculoService {
	public int suma(SumaDto dataTransfer) {
		int resultadosDeSuma=dataTransfer.getNumero1() + dataTransfer.getNumero2();
	return resultadosDeSuma; 
		
	}
	 public int resta(SumaDto c) {
		 int resultadosDeR=c.getNumero1() - c.getNumero2();
		 return resultadosDeR;
		 
	 }
	 
	public int multiplicacion(SumaDto m) {
		 int resultadosDeM=m.getNumero1() * m.getNumero2();
	       return resultadosDeM;
	       
	}
}
