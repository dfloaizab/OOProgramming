import java.util.Scanner;
import java.math.*;

public class EjercicioFunciones 
{
	
	
	public static void main(String[] args)
	{
		//declara datos
		//a. círculo , centro y radio aleatorios
		int radio=50, xc=0, yc=0, num_intentos=10, xu, yu, intento=0;
		Scanner lector = new Scanner(System.in);
		float distancia;
		
		//b. datos: x, y que pide al usuario, distancia
		// plus 1: con número de intentos
		while(intento <= num_intentos)
		{
			/**/
			System.out.print("\nIngrese la coordenada x del dardo:");
			xu = lector.nextInt();			
			System.out.print("\nIngrese la coordenada y del dardo:");
			yu = lector.nextInt();			
			distancia = CalcularDistancia(xu, yu, xc, yc);		
			/**/
			intento++;
		}	
	}
	
	
	/**
	 * Función que calcula la distancia entre dos puntos cuyas coordenadas se reciben
	 * @param x	 x del dardo  
	 * @param y y del dardo
	 * @param xt x del centro del tablero
	 * @param yt y del centro del tablero
	 * @return distancia de (x,y) a (xt, yt)
	 */
	public static double CalcularDistancia(int x, int y, int xt, int yt)
	{
		double dist = 0.0d;		
		dist = Math.sqrt(  Math.pow(( x - xt),2.0d)  +   Math.pow((y - yt),2.0d));		
		return dist;
	}
	

}
