package Model;

/**
 * Clase que se encarga de gestionar los datos de notas de estudiantes
 * y sus operaciones
 */
public class RegistroNotasApp {

    private String nombre, curso;
    private float nota;


    public RegistroNotasApp(String nombre, String curso, float nota) {
        this.nombre = nombre;
        this.curso = curso;
        this.nota = nota;
    }

    public String toCSV()
    {
        return this.nombre + "," + this.curso + this.nota;
    }

}
