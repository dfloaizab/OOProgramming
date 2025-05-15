public class Estudiante
{


    private String doc, nombre, ciudad;
    private int anio_nac;

    public Estudiante(int anio_nac, String ciudad, String doc, String nombre) {
        this.anio_nac = anio_nac;
        this.ciudad = ciudad;
        this.doc = doc;
        this.nombre = nombre;
    }

    public String getDoc() {
        return doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getAnio_nac() {
        return anio_nac;
    }

    public void setAnio_nac(int anio_nac) {
        this.anio_nac = anio_nac;
    }

   
}