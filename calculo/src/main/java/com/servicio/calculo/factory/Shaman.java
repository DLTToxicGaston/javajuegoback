package com.servicio.calculo.factory;


public class Shaman implements IEnemigos{
	
	
	private String name;
	
	private int nivel;
	
	private int experiencia;
	
	private String tipo;
	
	private int inteligencia;
	
	private int fuerza;
	
	private int agilidad;
	
	private int defensaFisica;
	
	private int defensaMagica;
	
	private int hp;
	
	private int maxHp;
	
	private int mp;
	
	private int maxMp;

	
	public Shaman() {
		
		this.name = "shaman";
		this.nivel = 79;
		this.tipo = "mago";
		this.inteligencia = 1000;
		this.fuerza = 400;
		this.defensaFisica = 200;
		this.defensaMagica = 100;
		this.agilidad = 30;
		this.hp = 3500;
		this.maxHp = 3500;
		this.mp = 5000;
		this.maxMp = 5000;
		
		
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getNivel() {
		return nivel;
	}


	public void setNivel(int nivel) {
		this.nivel = nivel;
	}


	public int getExperiencia() {
		return experiencia;
	}


	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public int getInteligencia() {
		return inteligencia;
	}


	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}


	public int getFuerza() {
		return fuerza;
	}


	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}


	public int getAgilidad() {
		return agilidad;
	}


	public void setAgilidad(int agilidad) {
		this.agilidad = agilidad;
	}


	public int getDefensaFisica() {
		return defensaFisica;
	}


	public void setDefensaFisica(int defensaFisica) {
		this.defensaFisica = defensaFisica;
	}


	public int getDefensaMagica() {
		return defensaMagica;
	}


	public void setDefensaMagica(int defensaMagica) {
		this.defensaMagica = defensaMagica;
	}


	public int getHp() {
		return hp;
	}


	public void setHp(int hp) {
		this.hp = hp;
	}


	public int getMaxHp() {
		return maxHp;
	}


	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}


	public int getMp() {
		return mp;
	}


	public void setMp(int mp) {
		this.mp = mp;
	}


	public int getMaxMp() {
		return maxMp;
	}


	public void setMaxMp(int maxMp) {
		this.maxMp = maxMp;
	}

}



