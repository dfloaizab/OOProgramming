public class ClinicaVeterinaria {


    //atributos:
    String razonSocial, NIT, telefono, direccion;

    //1. IMPLEMENTACIÓN DE LA RELACIÓN CON LA CLASE GATO Y PERRO:
    Perro[] perros;
    Gato[] gatos;


    //métodos:
    public ClinicaVeterinaria()
    {

    }


    //alt + insert 

    public ClinicaVeterinaria(String NIT, String direccion, String razonSocial, String telefono) {
        this.NIT = NIT;
        this.direccion = direccion;
        this.razonSocial = razonSocial;
        this.telefono = telefono;
        
        perros = new Perro[50];
        gatos = new Gato[50];
    }

    // 2. funcionalidades:
    public void registrarIngresoPerro(Perro mascota)
    {
        //ToDO: 
    }

    public void registrarSalidaMascota(Perro mascota)
    {
        //ToDO:
    }




    
}
