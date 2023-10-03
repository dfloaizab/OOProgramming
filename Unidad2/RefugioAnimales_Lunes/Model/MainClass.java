package Model;

public class MainClass 
{

	public static void main(String[] args) 
	{
		
		//implementación de la relación entre MainClass y Refugio:
		//la aplicación puede contener máximo 5 refugios
		final int NUM_REFUGIOS = 5;
		Refugio[] refugios = new Refugio[NUM_REFUGIOS];
		
		Refugio refugio1 = new Refugio();
		refugio1.setNIT("949494");
		refugio1.setRazonSocial("Silvestre y Piolín");
		//Tarea: establecer los valores de los demás atributos:
		
		Refugio refugio2 = new Refugio("949494","Pinky y Cerebro","Calle 5 6200",
										"5183000","email","Diego L",500,100,0);
		
		//Refugio refugio3 = new Refugio()
		
		//Tarea: crear información de otros 3 refugios:
				
				
	}

}
