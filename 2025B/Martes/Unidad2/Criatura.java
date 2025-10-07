/**
 * Modela una criatura en términos más generales
 */
public abstract class Criatura {

    //atributos:
    String nombre;
    int edad, nivelEnergia;

    //métodos:

    //alt + insert, source action

    public Criatura(int edad, int nivelEnergia, String nombre) {
        this.edad = edad;
        this.nivelEnergia = nivelEnergia;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNivelEnergia() {
        return nivelEnergia;
    }

    public void setNivelEnergia(int nivelEnergia) {
        this.nivelEnergia = nivelEnergia;
    }

    
    
}
