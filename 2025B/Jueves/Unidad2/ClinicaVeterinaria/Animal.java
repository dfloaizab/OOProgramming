/**
 * Esta clase modela características y operaciones comunes (generaliza) de TODOS los animales:
 */
public abstract class  Animal 
{

    // ATRIBUTOS
    public enum Genero
    {
        MACHO,
        HEMBRA
    }

    String nombre, doc_propietario, historial;
    Genero genero;
    int edad;
    float peso;

    //MÉTODOS

    // Alt + insert + source actions + generate constructor
       public Animal(String doc_propietario, int edad, Genero genero, String nombre, float peso, String historial) {
        this.doc_propietario = doc_propietario;
        this.edad = edad;
        this.genero = genero;
        this.nombre = nombre;
        this.peso = peso;
        this.historial = historial;
    }


    // Alt + insert + source actions + generate getters and setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDoc_propietario() {
        return doc_propietario;
    }

    public void setDoc_propietario(String doc_propietario) {
        this.doc_propietario = doc_propietario;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

     public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
}
