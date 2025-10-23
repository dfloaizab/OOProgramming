
public class Bodega {

    private int id, cap_max_ton, cap_max_trenes, uso_ton, uso_trenes;

    private Tren.TipoCarga tipocarga;

    //ESTE ARREGLO IMPLEMENTA LA RELACIÓN DE AGREGACIÓN:
    private Tren[] trenes;

    public Bodega(int cap_max_ton, int cap_max_trenes, int id, Tren.TipoCarga tipocarga, int uso_ton, int uso_trenes) {
        this.cap_max_ton = cap_max_ton;
        this.cap_max_trenes = cap_max_trenes;
        this.id = id;
        this.tipocarga = tipocarga;
        this.uso_ton = uso_ton;
        this.uso_trenes = uso_trenes;
        trenes = new Tren[5];
    }

    //COMPLETAR:
    public void agregarTren(Tren nuevoTren)
    {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCap_max_ton() {
        return cap_max_ton;
    }

    //Los métodos set permiten cambiar los valores de los atributos:
    public void setCap_max_ton(int cap_max_ton) {

        if(cap_max_ton > 0)
            this.cap_max_ton = cap_max_ton;

    }

    public int getCap_max_trenes() {
        return cap_max_trenes;
    }

    public void setCap_max_trenes(int cap_max_trenes) {
        this.cap_max_trenes = cap_max_trenes;
    }

    public int getUso_ton() {
        return uso_ton;
    }

    public void setUso_ton(int uso_ton) {
        this.uso_ton = uso_ton;
    }

    public int getUso_trenes() {
        return uso_trenes;
    }

    public void setUso_trenes(int uso_trenes) {
        this.uso_trenes = uso_trenes;
    }

    public Tren.TipoCarga getTipocarga() {
        return tipocarga;
    }

    public void setTipocarga(Tren.TipoCarga tipocarga) {
        this.tipocarga = tipocarga;
    }




    
}
