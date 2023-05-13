package USC.ClinicaVet.Model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ClinicaVet {
	
	ArrayList<Especialista> especialistas;
	
		
	public ClinicaVet()
	{
		especialistas = new ArrayList<Especialista>();
	}
	
	public static void main(String args[])
	{
		ClinicaVet miClinica = new ClinicaVet();
		miClinica.CargarEspecialistas("./data/medicos.csv");
	}
	
	/**
	 * Este método realiza una carga de los especialistas de la 
	 * clínica
	 * @param filePath ruta del archivo plano, csv, desde el cual 
	 * se cargan los datos
	 */
	public void CargarEspecialistas(String filePath)
	{
		try 
		{
			BufferedReader lector = new BufferedReader(new FileReader(filePath));
			String linea = "", nombre="", especialidad="";
			String datos[] = new String[2];
			do
			{
				linea = lector.readLine().trim();
				//linea = "traumatologia;Pedro Perez"
				datos = linea.split(";");
			
			}while(lector != null);
		} 
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}	

}
