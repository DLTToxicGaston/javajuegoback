package com.servicio.calculo.factory;

public class EnemigosFactory {
	
	public IEnemigos crearEnemigos(int index) {
		
		switch (index) {
		case 1 : return new Shaman();
		case 2 : return new Drake();
		case 3 : return new Goblins();
		
		}
		
		return null;
		
	}

}
