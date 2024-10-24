package model;

public class Referee {

    private String id, nombre, country;

    public Referee(String country, String id, String nombre) {
        this.country = country;
        this.id = id;
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    enum refereeType
    {
        linesman,
        central
    }

    
    
}
