package com.servicio.calculo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.servicio.calculo.model.Enemigos;
import com.servicio.calculo.model.Personajes;
import com.servicio.calculo.model.Turnos;
import com.servicio.calculo.repository.EnemigosRepository;
import com.servicio.calculo.repository.PersonajesRepository;
import com.servicio.calculo.repository.TurnosRepository;

public class CombateService {

	@Autowired
	private PersonajesRepository repository;
	
	@Autowired
	private EnemigosRepository enemigosRepository;
	
	@Autowired
	private TurnosRepository turnosRepository;
	
	private Turnos turnoActual = new Turnos();
	
	
	public String iniciarCombate(String nombre) {
		
		Personajes personajeCombate = repository.findByname(nombre);
		
		Enemigos enemigoCombate = obtenerEnemigosPorTurno(personajeCombate);
		
		combatir(enemigoCombate, personajeCombate); 
		
		
		return null;
		
	}
	
	private Integer obtenerEnemigos() {
		
		int min = 1; // Valor mínimo del rango
		int max = 3; // Valor máximo del rango

		double numeroAleatorio = Math.random() * (max - min + 1) + min;
		int numeroEntero = (int) numeroAleatorio; // Convertir a entero si es necesario
		
		
		return numeroEntero;
		
	}
	
	private boolean combatir(Enemigos enemigoCombate , Personajes personajeCombate){
		
		return false;
		
	}
	
	private Enemigos obtenerEnemigosPorTurno(Personajes personajeCombate) {
		
		turnoActual = turnosRepository.findByjugadorId(personajeCombate.getId());
		
		
		if(turnoActual!= null) {
		
		
		Optional<Enemigos> enemigos = enemigosRepository.findById(turnoActual.getEnemigoId());
		
		return enemigos.get();
		
		
		} else {
			
			Optional<Enemigos> enemigos = enemigosRepository.findById(obtenerEnemigos());
			
			inicializarTurno(enemigos.get(), personajeCombate);
			
			return enemigos.get();
			
		}
		
	}
	
	private void inicializarTurno(Enemigos enemigos, Personajes personajes){
		
		turnoActual.setbCombateTermino(false);
		turnoActual.setEnemigoId(enemigos.getId());
		turnoActual.setJugadorId(personajes.getId());
		turnoActual.setTurno(true);
		
		turnoActual = turnosRepository.save(turnoActual);
		
	
	}
	
}
