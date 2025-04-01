
public class MainClass {
	
	public static void main(String[] args)
	{
		
		Empresa miEmpresa = new Empresa();
		
		//Cambiando valores del objeto modificando los atributos públicos.
		// NO OK
		miEmpresa.Nombre = "Diego's Development Company Inc.";
		miEmpresa.Direccion = "Calle Falsa 123";
		
		//Es válido?
		miEmpresa.capital_inicial = 0.0f;
				
		
	}

}
