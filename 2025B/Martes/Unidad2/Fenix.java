public class Fenix extends Criatura {

    //atributos propios del fenix:
    String colorPlumas;
    boolean resucitar;
    int numResurrecciones;
    
    public Fenix(int edad, int nivelEnergia, String nombre) {
        super(edad, nivelEnergia, nombre);

    }

    //método constructos que incluya los atributos propios:    

    public Fenix(String colorPlumas, int numResurrecciones, boolean resucitar, int edad, int nivelEnergia, String nombre) {
        super(edad, nivelEnergia, nombre);
        this.colorPlumas = colorPlumas;
        this.numResurrecciones = numResurrecciones;
        this.resucitar = resucitar;
    }

    public String getColorPlumas() {
        return colorPlumas;
    }

    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }

    public boolean isResucitar() {
        return resucitar;
    }

    public void setResucitar(boolean resucitar) {
        this.resucitar = resucitar;
    }

    public int getNumResurrecciones() {
        return numResurrecciones;
    }

    public void setNumResurrecciones(int numResurrecciones) {
        this.numResurrecciones = numResurrecciones;
    }



}
