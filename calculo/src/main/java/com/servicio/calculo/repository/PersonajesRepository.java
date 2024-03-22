package com.servicio.calculo.repository;

import org.springframework.data.repository.CrudRepository;

import com.servicio.calculo.model.Personajes;

public interface PersonajesRepository extends CrudRepository<Personajes, Integer>{

	Personajes findByname(String name);
	
	
	
	
	
	
}
