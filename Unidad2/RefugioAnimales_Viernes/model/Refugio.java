package edu.usc.refugio.model;

import java.util.ArrayList;

import edu.usc.refugio.model.Animal.Especie;

public class Refugio 
{
	
	//Atributos
	private  String nit, nombre;
	private String repLegal, docRepLegal, direccion, telefono, email;
	private int capacidad, poblacion;
	private float fondos;
	
	//Arreglo dinámico para guardar la info de los animales acogidos
	private ArrayList<Animal> animales; 
	private ArrayList<Donacion> donaciones; 
	
	//Pendiente: Método constructor con parámetros
	// y métodos get y set
	
	public Refugio()
	{
		animales = new ArrayList<Animal>();
		
	}

	public Refugio(String nit, String repLegal, String docRepLegal, String direccion, String telefono, String email,
			int capacidad, int poblacion, float fondos) 
	{
		animales = new ArrayList<Animal>();
		this.nit = nit;
		this.repLegal = repLegal;
		this.docRepLegal = docRepLegal;
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
		this.capacidad = capacidad;
		this.poblacion = poblacion;
		this.fondos = fondos;
	}

	public void acogerAnimal(Animal nuevoAnimal)
	{
		this.animales.add(nuevoAnimal);
	}
	
	public void acogerAnimal(int id, String nombre, int edad, 
			boolean esterilizado, Especie especie)
	{
		Animal nuevoRefugiado = new Animal(id, nombre,"",edad, esterilizado,especie);
		this.animales.add(nuevoRefugiado);
	}


	public String getNit() {
		return nit;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}

	public String getRepLegal() {
		return repLegal;
	}

	public void setRepLegal(String repLegal) {
		this.repLegal = repLegal;
	}

	public String getDocRepLegal() {
		return docRepLegal;
	}

	public void setDocRepLegal(String docRepLegal) {
		this.docRepLegal = docRepLegal;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public int getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(int poblacion) {
		this.poblacion = poblacion;
	}

	public float getFondos() {
		return fondos;
	}

	public void setFondos(float fondos) {
		this.fondos = fondos;
	}
	
		
	

}
