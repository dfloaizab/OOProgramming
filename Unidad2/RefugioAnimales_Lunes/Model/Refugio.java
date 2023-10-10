package Model;

import java.util.*;

public class Refugio 
{
	//**** atributos:
	private String NIT,razonSocial,direccion, telefono, email,repLegal;
	private int capacidad, poblacion;
	private float fondos;	
	
	//Refugio contiene un arreglo dinámico de objetos de la clase animal:
	private ArrayList<Animal> animales; 
	
	//**** métodos:
	//constructores
	
	public Refugio()
	{
		//el arreglo debe inicializarse en cada versión del constructor
		animales = new ArrayList<Animal>();
	}

	public Refugio(String nIT, String razonSocial, 
			String direccion, 
			String telefono, 
			String email, 
			String repLegal,
			int capacidad, int poblacion, float fondos) 
	{
		//el arreglo debe inicializarse en cada versión del constructor
		animales = new ArrayList<Animal>();
		this.NIT = nIT;
		//"this"  hace referencia a "este" objeto que estoy creando
		this.razonSocial = razonSocial;
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
		this.repLegal = repLegal;
		this.capacidad = capacidad;
		this.poblacion = poblacion;
		this.fondos = fondos;
	}
	
	public void acogerAnimal(Animal nuevoAnimal)
	{
		
		//   * validar que al agregar un nuevo animal, no se supere la capacidad:
		//   * incrementar población
		
		if(poblacion < capacidad) {
		
			animales.add(nuevoAnimal);
			this.poblacion += 1;
		}
		
		//		
	}
	
	public Animal buscarAnimal(String nombre, String id)
	{
		Animal result = null;
		
		//recorre todo el arreglo dinámico de animales
		for(int i=0; i < animales.size(); i++)
		{
			if(  animales.get(i).getId().equals(id) || animales.get(i).getNombre().equals(nombre))
			{
				result = animales.get(i);
				break;
			}
		}		
		return result;		
	}
	
	
	public int contarPorEspecie(Especie especie)
	{
		int cuantos = 0;
		//recorrer y contar:
		for(int i = 0; i < animales.size(); i++)
		{
			if(animales.get(i).getEspecie().equals(especie))
				cuantos++;
		}		
		//
		return cuantos;
	}
	
	public int contarEsterilizados()
	{
		int cuantos = 0;
		//iterador sobre array list
		for(Animal individuo: animales)
		{
			if(individuo.isEsterilizado())
				cuantos++;
		}		
		return cuantos;
	}

	//getters y setters
	public String getNIT() {
		return NIT;
	}

	public void setNIT(String nIT) {
		this.NIT = nIT;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
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

	public String getRepLegal() {
		return repLegal;
	}

	public void setRepLegal(String repLegal) {
		this.repLegal = repLegal;
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

