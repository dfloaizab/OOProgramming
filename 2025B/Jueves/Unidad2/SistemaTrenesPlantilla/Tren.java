public class Tren {

    
    //Atributos:
    public static enum TipoCarga
    {
        ALIMENTOS, INSUMOS
    }

    private int id, carga_max, carga_actual;
    private TipoCarga tipoCarga;

    //Metodos:
    public Tren(int carga_actual, int carga_max, int id, TipoCarga tipoCarga) {
        this.carga_actual = carga_actual;
        this.carga_max = carga_max;
        this.id = id;
        this.tipoCarga = tipoCarga;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCarga_max() {
        return carga_max;
    }

    public void setCarga_max(int carga_max) {
        this.carga_max = carga_max;
    }

    public int getCarga_actual() {
        return carga_actual;
    }

    public void setCarga_actual(int carga_actual) {
        this.carga_actual = carga_actual;
    }

    public TipoCarga getTipoCarga() {
        return tipoCarga;
    }

    public void setTipoCarga(TipoCarga tipoCarga) {
        this.tipoCarga = tipoCarga;
    }

    
}
