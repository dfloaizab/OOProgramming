import java.io.*;
import java.util.*;

public class MainClass {
	
	private static ArrayList<String> registros;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//readFile("./Data/Veterinarios.csv");
		escribirArchivo("./Data/salida.txt");

	}	
	
	/**
	 * Crear información de nuevos especialistas veterinarios
	 * desde información leída por consola
	 * @param ruta
	 */
	public static void escribirArchivo(String ruta)
	{
		String lecturaConsola="",lineaEscribir="";
		Scanner lector = new Scanner(System.in);
		
		//Abrir archivo para escritura:
		try {
			FileWriter escritor = new FileWriter(ruta);
			
			//leer desde consola:
			for(int i=0; i<3;i++)
			{
				//leer desde consola información del veterinario
				System.out.println("\nIngrese el documento del veterinario:");
				lecturaConsola = lector.nextLine();
				lineaEscribir = lecturaConsola + ",";
				
				System.out.println("Ingrese el nombre del veterinario:");
				lecturaConsola = lector.nextLine();
				lineaEscribir += lecturaConsola + ",";			
				
				System.out.println("Ingrese la especialidad del veterinario:");
				lecturaConsola = lector.nextLine();
				lineaEscribir += lecturaConsola;				
				
				System.out.print(lineaEscribir);				
				//escribir en el archivo:
				escritor.write(lineaEscribir);
			}
			escritor.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	
	/**
	 * lee archivo plano que se encuentra en ruta y guarda la información
	 * en el arreglo dinámico "registros"
	 * @param ruta
	 */
	public static void readFile(String ruta)
	{
		
		registros = new ArrayList<String>();
		
		//abrir archivo
		try {
			BufferedReader br = new BufferedReader(new FileReader(ruta));
			String linea;
			//leer cada renglón
			while(  (linea = br.readLine()) != null       )
			{
				System.out.println(linea);
				
				//agregar al arreglo registros:
				registros.add(linea);
				
			}
			
			//guardar cada renglón en el arreglo "registros"
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}		
	}

}
