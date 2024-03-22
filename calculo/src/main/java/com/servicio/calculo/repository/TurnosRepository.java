package com.servicio.calculo.repository;

import org.springframework.data.repository.CrudRepository;

import com.servicio.calculo.model.Turnos;

public interface TurnosRepository extends CrudRepository<Turnos, Integer>{
	
	Turnos findByjugadorId (Integer jugadorId);
	
	Turnos findByenemigoId (Integer enemigoId);

}
