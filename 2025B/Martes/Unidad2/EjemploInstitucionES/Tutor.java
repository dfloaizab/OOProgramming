import java.util.ArrayList;

public class Tutor {

    String nombre;
    ArrayList<Curso> cursos;

    public Tutor(String nombre) {
        this.nombre = nombre;
        cursos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarCurso(Curso nuevoCurso)
    {
        cursos.add(nuevoCurso);
    }


    
}
