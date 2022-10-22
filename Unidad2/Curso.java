
public class Curso {
	
	String nombre;
	String codigo;
	int creditos;
	boolean habilitable;
	
	public Curso()
	{
		
	}
	
	public Curso(String nombre, String codigo, int creditos, boolean habilitable) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.creditos = creditos;
		this.habilitable = habilitable;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getCreditos() {
		return creditos;
	}

	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}

	public boolean isHabilitable() {
		return habilitable;
	}

	public void setHabilitable(boolean habilitable) {
		this.habilitable = habilitable;
	}
	
	

}
