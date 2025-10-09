

/**
 * Modela la información de un perro
 * LOS NOMBRES DE CLASE EMPIEZAN EN MAYÚSCULA
 */
public class Perro extends Animal
{  

    public Perro(String doc_propietario, int edad, Genero genero, String nombre, float peso, String historial) {
        //Está usando el constructor de la super clase, es decir, de la clase que hereda
        super(doc_propietario, edad, genero, nombre, peso, historial);
    }

    public Perro(boolean esterilizado, Raza raza, String vacunas, String doc_propietario, int edad, Genero genero, String nombre, float peso, String historial) {
        super(doc_propietario, edad, genero, nombre, peso, historial);
        this.esterilizado = esterilizado;
        this.raza = raza;
        this.vacunas = vacunas;
    }


    
    //Una enumeración es un tipo de datos con un número limitado de valores predefinido:
    public static enum Raza{
        LABRADOR,
        YORKIE,
        ROTTWEILER,
        DOBERMAN,
        CRIOLLO,
        BICHON_FRISE
    }

    //1. ATRIBUTOS:
    // raza, nombre, peso, fecha nac, 
    private String vacunas;
    private boolean esterilizado;   
    private Raza raza;

    
}