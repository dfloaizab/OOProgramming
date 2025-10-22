import java.util.ArrayList;

public class Institucion {

  

    //atributos y métodos:
    private String nombre;
    private ArrayList<Tutor> tutores;

    public Institucion(String nombre) {
        this.nombre = nombre;
        tutores = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarTutor(Tutor nuevoTutor)
    {
        tutores.add(nuevoTutor);
    }    


    
}
