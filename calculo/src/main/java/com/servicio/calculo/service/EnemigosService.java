package com.servicio.calculo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.servicio.calculo.factory.Drake;
import com.servicio.calculo.factory.EnemigosFactory;
import com.servicio.calculo.factory.Goblins;
import com.servicio.calculo.factory.IEnemigos;
import com.servicio.calculo.factory.Shaman;
import com.servicio.calculo.model.Enemigos;
import com.servicio.calculo.repository.EnemigosRepository;


@Service
public class EnemigosService  {
	
	@Autowired
	private EnemigosRepository repository;
	
	public List<Enemigos> crearEnemigos(){
		
	List<Enemigos> crearEnemigos = new ArrayList<>();	
		
	List<IEnemigos> listaEnemigos = new ArrayList<>();
	
		
	EnemigosFactory enemigos = new EnemigosFactory();
	
	for(int i = 1; i <=3; i++) {
		
	listaEnemigos.add(enemigos.crearEnemigos(i));
	
		
	}
	
	
	for(int i = 0 ; i < listaEnemigos.size(); i++ ) {
		
	crearEnemigos.add(transformIEnemyIntoEnemy(listaEnemigos.get(i)));
		
	}
	
	repository.saveAll(crearEnemigos);
	return crearEnemigos;
	
	
	
	}
	
	private Enemigos transformIEnemyIntoEnemy(IEnemigos IEnemigo){
		
		String nombreClase = IEnemigo.getClass().getName();

		Enemigos nuevoEnemigo = new Enemigos();
		
        if("com.servicio.calculo.factory.Shaman".equals(nombreClase)) {

        	Shaman enemigo = (Shaman) IEnemigo;
        	nuevoEnemigo.setName(enemigo.getName());
        	nuevoEnemigo.setAgilidad(enemigo.getAgilidad());
        	nuevoEnemigo.setDefensaFisica(enemigo.getDefensaFisica());
        	nuevoEnemigo.setDefensaMagica(enemigo.getDefensaMagica());
        	nuevoEnemigo.setExperiencia(enemigo.getExperiencia());
        	nuevoEnemigo.setFuerza(enemigo.getFuerza());
        	nuevoEnemigo.setHp(enemigo.getHp());
        	nuevoEnemigo.setMaxHp(enemigo.getMaxHp());
        	nuevoEnemigo.setInteligencia(enemigo.getInteligencia());
        	nuevoEnemigo.setMp(enemigo.getMp());
        	nuevoEnemigo.setMaxMp(enemigo.getMaxMp());
        	nuevoEnemigo.setNivel(enemigo.getNivel());
        	nuevoEnemigo.setTipo(enemigo.getTipo());
        }
        else if ("com.servicio.calculo.factory.Drake".equals(nombreClase)){

            Drake enemigo1 = (Drake) IEnemigo;
            nuevoEnemigo.setName(enemigo1.getName());
        	nuevoEnemigo.setAgilidad(enemigo1.getAgilidad());
        	nuevoEnemigo.setDefensaFisica(enemigo1.getDefensaFisica());
        	nuevoEnemigo.setDefensaMagica(enemigo1.getDefensaMagica());
        	nuevoEnemigo.setExperiencia(enemigo1.getExperiencia());
        	nuevoEnemigo.setFuerza(enemigo1.getFuerza());
        	nuevoEnemigo.setHp(enemigo1.getHp());
        	nuevoEnemigo.setMaxHp(enemigo1.getMaxHp());
        	nuevoEnemigo.setInteligencia(enemigo1.getInteligencia());
        	nuevoEnemigo.setMp(enemigo1.getMp());
        	nuevoEnemigo.setMaxMp(enemigo1.getMaxMp());
        	nuevoEnemigo.setNivel(enemigo1.getNivel());
        	nuevoEnemigo.setTipo(enemigo1.getTipo());
        }
        else if ("com.servicio.calculo.factory.Goblins".equals(nombreClase)) {

            Goblins enemigo2 = (Goblins) IEnemigo;
            nuevoEnemigo.setName(enemigo2.getName());
        	nuevoEnemigo.setAgilidad(enemigo2.getAgilidad());
        	nuevoEnemigo.setDefensaFisica(enemigo2.getDefensaFisica());
        	nuevoEnemigo.setDefensaMagica(enemigo2.getDefensaMagica());
        	nuevoEnemigo.setExperiencia(enemigo2.getExperiencia());
        	nuevoEnemigo.setFuerza(enemigo2.getFuerza());
        	nuevoEnemigo.setHp(enemigo2.getHp());
        	nuevoEnemigo.setMaxHp(enemigo2.getMaxHp());
        	nuevoEnemigo.setInteligencia(enemigo2.getInteligencia());
        	nuevoEnemigo.setMp(enemigo2.getMp());
        	nuevoEnemigo.setMaxMp(enemigo2.getMaxMp());
        	nuevoEnemigo.setNivel(enemigo2.getNivel());
        	nuevoEnemigo.setTipo(enemigo2.getTipo());

        }
		
		return nuevoEnemigo;
	}
	
}