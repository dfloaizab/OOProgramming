public class Unicornio extends Criatura{


     //atributos propios de Unicornio:
    String poderMagico;

    public Unicornio(int edad, int nivelEnergia, String nombre) {
        //invoca el constructor de la super clase, es decir, de la clase de la cual hereda:
        //(la superclase de Unicornio es Criatura)
        super(edad, nivelEnergia, nombre);
        //TODO Auto-generated constructor stub
    }

   
    //métodos:
    public Unicornio(String poderMagico, int edad, int nivelEnergia, String nombre) {
        super(edad, nivelEnergia, nombre);
        this.poderMagico = poderMagico;
    }

    
}
