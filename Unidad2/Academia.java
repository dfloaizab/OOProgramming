
public class Academia 
{
	//Atributos
	private String razonSocial;
	private String direccion;
	private boolean acreditada;
	private String horarioAtencion;
	private String nit;
	private int anioFundacion;
	
	/* funciona cuando 1 objeto de la clase Academia está relacionado con 1 objeto de la clase
	 * ProgramaAcademico */
	//ProgramaAcademico programa;
	
	
	final int num_programas = 100;
	private ProgramaAcademico[] programas;
	
	
		
	//Método constructor con inicialización de los atributos	
	public Academia(String razonSocial, String direccion, boolean acreditada, String horarioAtencion, String nit,
			int anioFundacion) {
		
		this.razonSocial = razonSocial;
		this.direccion = direccion;
		this.acreditada = acreditada;
		this.horarioAtencion = horarioAtencion;
		this.nit = nit;
		this.anioFundacion = anioFundacion;
		programas = new ProgramaAcademico[num_programas];
	}
	
	//Tarea: Implementar método que permite agregar un nuevo programa académico a la academia
	public void agregarProgramaAcademico(ProgramaAcademico nuevoPrograma)
	{
		
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public boolean isAcreditada() {
		return acreditada;
	}

	public void setAcreditada(boolean acreditada) {
		this.acreditada = acreditada;
	}

	public String getHorarioAtencion() {
		return horarioAtencion;
	}

	public void setHorarioAtencion(String horarioAtencion) {
		this.horarioAtencion = horarioAtencion;
	}

	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}

	public int getAnioFundacion() {
		return anioFundacion;
	}

	public void setAnioFundacion(int anioFundacion) {
		this.anioFundacion = anioFundacion;
	}
	
	
	//Métodos	
	//**** De consulta - obtienen valores de los atributos para ser consultados por clases externas: ***
	public String getRazonSocial()
	{
		return razonSocial;
	}	
	//TAREA: completar los métodos de consulta de los demás atributos	
	
	//*** De modificación - Permiten cambiar los valores de los atributos: ***
	public void setRazonSocial(String nuevaRazonSocial)
	{
		razonSocial = nuevaRazonSocial;		
	}	
	//TAREA: completar los métodos de modificación de los demás atributos
}
