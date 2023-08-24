import java.util.Scanner;

public class Reservas 
{
	/* atributos (datos constantes, variables) */
	
	//tamaño de la sala:
	static final int NUM_FILAS=20, NUM_COLUMNAS=20;
	static final int FILA_PREFERENCIAL=10;
	//precios de las entradas:
	static final float PRECIO_GENERAL=12000.0f,
			    PRECIO_PREFERENCIAL=18000.0f;
	
	//matriz reservas:	
	static boolean reservas[][];
	//otras variables:
	static int fila_sel, col_sel;
	static int reservadas_gen, reservadas_pref;
	static float total_gen, total_pref;	
	static int num_sillas;
	
	/* funciones */
	public static void main(String[] args) 
	{
		//inicializar la matriz:
		reservas = new boolean[NUM_FILAS][NUM_COLUMNAS];
		Scanner miLectorConsola = new Scanner(System.in);
		
		int opcion=0;		
		do
		{
			//imprimir menú:			
			System.out.print("\n1. Reserva silla");
			System.out.print("\n2. Salir\n");			
			//pedir opción al usuario:
			opcion = miLectorConsola.nextInt();			
			//verificar disp. silla:
			//y reservar si es el caso
			if(opcion == 1)
			{
				System.out.println("Ingrese la fila que desea reservar:\n");
				fila_sel = miLectorConsola.nextInt();
				System.out.println("Ingrese la columna que desea reservar:\n");
				col_sel = miLectorConsola.nextInt();
				
				//validar que la silla no esté reservada:
				if(  reservas[fila_sel][col_sel] == true )		
					System.out.print("La silla ya está reservada");					
				else		
					//reservar:
				{
					reservas[fila_sel][col_sel] = true;
					System.out.print("La silla se reservó correctamente");
				}
			}					
		}while(opcion != 2);	
	}
	
	public void reserva_una_silla()
	{
		Scanner miLectorConsola = new Scanner(System.in);
		
		//pedir número de sillas:
		num_sillas = miLectorConsola.nextInt();
		
		//MODIFICAR: REPETIR POR EL NÚMERO DE SILLAS:
		//pedir al usuario fila y columna de la reserva (por consola):
		System.out.println("Ingrese la fila que desea reservar:");
		fila_sel = miLectorConsola.nextInt();
		System.out.println("Ingrese la columna que desea reservar:");
		col_sel = miLectorConsola.nextInt();
		
		//validar que la silla no esté reservada:
		if(  reservas[fila_sel][col_sel] == true )		
			System.out.print("La silla ya está reservada");					
		else		
			//reservar:
			reservas[fila_sel][col_sel] = true;	
	}

}
