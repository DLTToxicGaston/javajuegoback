package com.servicio.calculo.repository;

import org.springframework.data.repository.CrudRepository;

import com.servicio.calculo.model.Enemigos;

public interface EnemigosRepository extends CrudRepository<Enemigos, Integer>{

	Enemigos findByname(String name);
	
	
}
