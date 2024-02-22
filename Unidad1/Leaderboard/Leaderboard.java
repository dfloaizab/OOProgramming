import java.util.Scanner;

public class Leaderboard 
{
	//***** atributos ***
	static String nombreVideojuego;	
	//arreglo de nombres:
	static String nombresJugadores[];	
	//matriz de puntajes:
	static int puntajes[][];	
	//promedios:
	static float promPuntos, promHP;	
	//constante para el número de jugadores:
	static final int NUM_JUGADORES = 10;	
	
	//***** métodos
	public static void main(  String[] args   )
	{
		pedirNombreVJ();
	}
	
	public static void pedirNombreVJ()
	{
		//se crea objeto para leer por consola:
		Scanner lectorConsola = new Scanner(System.in);
		System.out.println("Ingrese el nombre del videojuego:");
		nombreVideojuego = lectorConsola.next();		
	}
	
	//LEER NOMBRES DE JUGADORES Y PUNTAJES:
	///TAREA: terminar método (leer puntajes)
	public static void leerDatos()
	{
		Scanner lectorConsola = new Scanner(System.in);
		//recorrer arreglo:
		for( int i = 0; i < NUM_JUGADORES; i++  )
		{		
			System.out.println("Ingrese el nombre del jugador:");
			//leer cada nombre:
			nombresJugadores[i] =   lectorConsola.next();
		}
		
	}	
	
	//TAREA:
	public static void calcularPromedios()
	{
		
	}
	
	//TAREA:
	public static void mostrarPromedios()
	{
		
	}

}
