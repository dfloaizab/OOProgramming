
public class ProgramaAcademico {
	
	
	//Atributos:
	private String codigo;
	private String nombre;
	private boolean acreditado;
	private int creditos;
	
	public ProgramaAcademico()
	{
		
	}	
	
	
	public ProgramaAcademico(String codigo, String nombre, boolean acreditado, int creditos) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.acreditado = acreditado;
		this.creditos = creditos;
	}

	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isAcreditada() {
		return acreditada;
	}
	public void setAcreditada(boolean acreditada) {
		this.acreditada = acreditada;
	}
	public int getCreditos() {
		return creditos;
	}
	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}
	
	//Métodos:
	
	
	
	
	

}
