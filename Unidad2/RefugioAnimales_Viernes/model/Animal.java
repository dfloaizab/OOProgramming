package edu.usc.refugio.model;

public class Animal {
	
	
	//**** Atributos o campos
	private long id;
	private String nombre, raza;	
	private int edad;
	private boolean esterilizado;
	
	private Especie especie;
	private EstadoSalud salud;
	private Sexo genero;	
	
	
	//*** Métodos

	public Animal(long id, String nombre, 
			String raza, int edad, boolean esterilizado, Especie especie) 
	{
		this.id = id;
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
		this.esterilizado = esterilizado;
		this.especie = especie;		
	}

	public Animal() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isEsterilizado() {
		return esterilizado;
	}

	public void setEsterilizado(boolean esterilizado) {
		this.esterilizado = esterilizado;
	}

	public Especie getEspecie() {
		return especie;
	}

	public void setEspecie(Especie especie) {
		this.especie = especie;
	}

	public EstadoSalud getSalud() {
		return salud;
	}

	public void setSalud(EstadoSalud salud) {
		this.salud = salud;
	}

	public Sexo getGenero() {
		return genero;
	}

	public void setGenero(Sexo genero) {
		this.genero = genero;
	}
	

	
	

}
