public class Ave extends Animal{


    //atributos de las aves:
    boolean corral, vuela, ornamental;
    String color_plumaje;

    //Constructor con los mínimos atributos, los de animal
    public Ave(String doc_propietario, int edad, Genero genero, String nombre, float peso, String historial) {
        //invoca al constructor de la superclase:
        super(doc_propietario, edad, genero, nombre, peso, historial);
    }

    //Constructor con todos los atributos
    public Ave(String color_plumaje, boolean corral, boolean ornamental, boolean vuela, String doc_propietario, int edad, Genero genero, String nombre, float peso, String historial) {
        super(doc_propietario, edad, genero, nombre, peso, historial);
        this.color_plumaje = color_plumaje;
        this.corral = corral;
        this.ornamental = ornamental;
        this.vuela = vuela;
    }

    
}
