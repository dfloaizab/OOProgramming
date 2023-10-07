package edu.usc.refugio.model;

import edu.usc.refugio.model.Animal.Especie;
import edu.usc.refugio.model.Animal.EstadoSalud;
import edu.usc.refugio.model.Animal.Genero;

public class MainClass {

	public static void main(String[] args) {
		
		
		
		Refugio miPrimerRefugio = new Refugio();
		
		miPrimerRefugio.setNit("959595");
		miPrimerRefugio.setNombre("Hugo, Paco y Luis");
		//Establecer los valores de los demás atributos del objeto...
		
		//Crear otros cinco refugios inicializando los atributos:
		Refugio miSegundoRefugio = new Refugio("959999","Diego L","9599990","","","",100,0,0);
		Refugio miTercerRefugio = new Refugio("9796666","Diana L","9766666","","","",200,0,0);
		Refugio miCuartoRefugio = new Refugio("9796666","Diana L","9766666","","","",200,0,0);
		Refugio miQuintoRefugio = new Refugio("9796666","Diana L","9766666","","","",200,0,0);
		
	
	}

}
