package com.servicio.calculo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.servicio.calculo.constants.PersonajesClases;
import com.servicio.calculo.model.Personajes;
import com.servicio.calculo.repository.PersonajesRepository;


@Service
public class PersonajesService implements CrearPersonajeInicialInterface {
	
	@Autowired
	private PersonajesRepository delta;
	
	public Personajes obtenerPersonajes(String name) {
		
		return delta.findByname(name);
		
	}
	
	
	
	public String delta (Personajes boys) {
		String respuesta="";
		
		Personajes creado = new Personajes();
		
			
		if(boys.getClase().equalsIgnoreCase(PersonajesClases.MAGO.clases)) {
			creado = crearMago(boys);
			
		if(creado != null) {
			respuesta = "mago se creo con exito";
			
		}
		}
		
		else if(boys.getClase().equalsIgnoreCase(PersonajesClases.GUERRERO.clases)) {
			creado = crearGuerrero(boys);
			
			if(creado != null) {
				respuesta = "guerrero se creo con exito";
				
			}
		}
		
		if(boys.getClase().equalsIgnoreCase(PersonajesClases.DUELISTA.clases)) {
			creado = crearDuelista(boys);
			
		if(creado != null)	{
			respuesta = "duelista se creo con exito";
			
		}
		}
		
		else {
			respuesta = "lo lamentamos no pudimos crear tu clase , los nombres aceptados son mago , guerrero";
		}
		
		creado = delta.save(creado);
		
		return respuesta;
					
	}



	@Override
	public Personajes crearMago(Personajes mago) {
		Personajes personajeMago = new Personajes();
		personajeMago.setName(mago.getName());
		personajeMago.setClase(mago.getClase());
		personajeMago.setNivel(1);
		personajeMago.setExperiencia(0);
		personajeMago.setAgilidad(10);
		personajeMago.setFuerza(5);
		personajeMago.setInteligencia(20);
		personajeMago.setDefensaFisica(50);
		personajeMago.setDefensaMagica(80);
		personajeMago.setHp(600);
		personajeMago.setMaxHp(600);
		personajeMago.setMp(800);
		personajeMago.setMaxMp(800);
		
		return personajeMago;
	}



	@Override
	public Personajes crearGuerrero(Personajes guerrero) {
		Personajes personajeGuerrero = new Personajes();
		personajeGuerrero.setName(guerrero.getName());
		personajeGuerrero.setClase(guerrero.getClase());
		personajeGuerrero.setNivel(1);
		personajeGuerrero.setExperiencia(0);
		personajeGuerrero.setAgilidad(14);
		personajeGuerrero.setFuerza(30);
		personajeGuerrero.setInteligencia(5);
		personajeGuerrero.setDefensaFisica(100);
		personajeGuerrero.setDefensaMagica(50);
		personajeGuerrero.setHp(1000);
		personajeGuerrero.setMaxHp(1000);
		personajeGuerrero.setMp(400);
		personajeGuerrero.setMaxMp(400);
		
		return personajeGuerrero;
	}
	
	
	public Personajes crearDuelista(Personajes duelista) {
		Personajes personajeDuelista = new Personajes();
		personajeDuelista.setName(duelista.getName());
		personajeDuelista.setClase(duelista.getClase());
		personajeDuelista.setNivel(1);
		personajeDuelista.setExperiencia(0);
		personajeDuelista.setAgilidad(8);
		personajeDuelista.setFuerza(15);
		personajeDuelista.setInteligencia(5);
		personajeDuelista.setDefensaFisica(90);
		personajeDuelista.setDefensaMagica(70);
		personajeDuelista.setHp(900);
		personajeDuelista.setMaxHp(900);
		personajeDuelista.setMp(300);
		personajeDuelista.setMaxMp(300);
		
		return personajeDuelista;
		
	}
	
		
	

}
