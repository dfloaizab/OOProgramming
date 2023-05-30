package USC.ClinicaVet.Model;

import java.util.ArrayList;
import java.io.*;

public class ClinicaVet 
{	
	private String nombre, NIT, direccion, telefono;		
	private ArrayList<Especialista> especialistas;
	
	private ArrayList<String> strEspecialistas;
	
	
	public ArrayList<String> getStrEspecialistas() {
		return strEspecialistas;
	}

	public static void main(String[] args)
	{
		ClinicaVet miClinica = new ClinicaVet("888", "Pinky y Cerebro");
		miClinica.cargarDatos("./data/especialistas.csv");
		
	}
	
	public void cargarDatos(String pRutaArchivo)	{
		try 
		{
			BufferedReader lector = new BufferedReader(new FileReader(pRutaArchivo));			
			String linea = "";	
			String[] datos;
			while( (linea = lector.readLine()) != null  )
			{
				datos = linea.split(";");
				//especialistas.add(new Especialista( datos[0], datos[1]  ));
				strEspecialistas.add(linea);
			}
			lector.close();
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{			
			e.printStackTrace();
		}
		finally
		{
			System.out.print("Revise el archivo de log para ver posibles errores");
		}
	}
	
	public ClinicaVet(String pNIT, String pNombre)
	{
		this.NIT = pNIT;
		this.nombre = pNombre;
		strEspecialistas = new ArrayList<String>();

	}
	

}
