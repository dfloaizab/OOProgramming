import java.util.Scanner;

public class BombaMisil 
{
	static final int numMaxIntentos = 10;
	static int tablero[][] = 
		    {
				{8,7},
				{4,0}
	        };
	
	static String numeroUsuario;

	public static void main(String[] args) 
	{
		
		Scanner lector = new Scanner(System.in);		
		int numIntentosUsuario = 1;
		boolean ganador = false;	
		int digitos[]= {0,0,0,0};
		int casilla;
		int bombas,misiles;
		//0. Mientras le queden intentos al usuario,
		while( numIntentosUsuario <= numMaxIntentos && !ganador  )
		{
			bombas=0;
			misiles=0;
			//1. Pedir un entero de 4 digitos al usuario:
			System.out.println("Ingrese un entero de 4 dígitos:");
			numeroUsuario = lector.next();
					
			//2. recorrer la matriz buscando los digitos del usuario en 
			//   en el tablero			
			digitos[0] = Character.getNumericValue(numeroUsuario.charAt(0));
			digitos[1] = Character.getNumericValue(numeroUsuario.charAt(1));
			digitos[2] = Character.getNumericValue(numeroUsuario.charAt(2));
			digitos[3] = Character.getNumericValue(numeroUsuario.charAt(3));	
		    casilla=0;
			for(int i = 0; i < 2; i++)
			{
				for(int j=0; j < 2; j++)
				{
					//3. si uno de los dígitos del número del usuario está en el tablero
					//   en la posición correcta, cuenta una bomba. Si está, pero en otra
					//   posición, es un misil.
					//3.1 la posición coincide:
					if(tablero[i][j] == digitos[casilla])
					{
						bombas++;
					}
					else
					{
						//no, coincide, lo busca en otra posición:
						for(int k=0; k < 4; k++)
						{
							if(digitos[k] == tablero[i][j])
							{
								misiles++;
							}
						}
					}
					casilla++;				}
			}
			//4.Al final del recorrido, le indica
			//   al usuario, cuántas bombas y cuántos misiles.
			System.out.printf("Hay %d bombas y %d misiles",bombas, misiles);			
		}
	}

}
