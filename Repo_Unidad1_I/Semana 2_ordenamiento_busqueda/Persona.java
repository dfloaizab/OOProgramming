import java.io.Serializable;

public class Persona implements Comparable<Persona>, Serializable
{
    private int edad;
    private String nombre;

    public Persona(int edad, String nombre)
    {
        this.edad = edad;
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public int compareTo(Persona o) {        
        if(this.nombre.compareTo(o.getNombre()) > 0)
            return 1;
        else if(this.nombre.compareToIgnoreCase(o.getNombre()) < 0)
            return -1;
        else
            return 0;
    }

    @Override    
    public String toString() {        
        return "nombre: " + this.nombre + ", edad: " +  this.edad;
    }    
}