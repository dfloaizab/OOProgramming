
public class Main {


    public static void main(String[] args)
    {

        // "new" invoca al método constructor de la clase, para crear un nuevo objeto
        // invoco a un método constructor con todos los parámetros para crear un objeto con todos esos valores en sus atributos
        //Perro kira = new Perro(12, true, "", "Kira", 200.0f, Perro.Raza.YORKIE, "todas");
        ClinicaVeterinaria nuevaClinica = new ClinicaVeterinaria("777","Calle 12 #34-56","Silvestre y Piolin","888");
        nuevaClinica.cargarListaMascotas("C:\\Users\\loaiz\\Documents\\USC\\APO2_JUEVES\\2025B\\mascotas.csv");


        // crea objetos de la clase perro pero sin valores aún en sus atributos

        //Perro falkor = new Perro();
        //Perro pulgas = new Perro(11,true,"","Falkor",500.0f,Perro.Raza.BICHON_FRISE,"");

    }
    
}
