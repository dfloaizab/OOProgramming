import java.util.ArrayList;

public class Humedal {

    String nombre;
    Ubicacion ubicacion;

    ArrayList<Especimen> especimenes;

    public Humedal(String nombre, Ubicacion ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        especimenes = new ArrayList<Especimen>();
    }

    public void agregarEspecimen(Especimen nuevoEspecimen)
    {
        especimenes.add(nuevoEspecimen);
    }


}
