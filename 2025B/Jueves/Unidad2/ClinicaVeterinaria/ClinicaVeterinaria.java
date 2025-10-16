import java.io.*;

public class ClinicaVeterinaria {


    //atributos:
    String razonSocial, NIT, telefono, direccion;

    //relación de agregación con clase Animal:
    //1. declaración
    //funciona como un arreglo estático:
    Animal[] animales;
    final static int NUM_ANIMALES = 50;
    int pos_animal_nuevo;


    //métodos:
    //CONSTRUCTORES:
    public ClinicaVeterinaria()
    {

        //2. Inicialización del arreglo:
        animales = new Animal[NUM_ANIMALES];
        //posición actual en la cual se agregará una nueva mascota:
        pos_animal_nuevo = 0;
    }

    

    public ClinicaVeterinaria(String NIT, String direccion, String razonSocial, String telefono) {
        //2. inicialización del arreglo:
        animales = new Animal[NUM_ANIMALES];
        this.NIT = NIT;
        this.direccion = direccion;
        this.razonSocial = razonSocial;
        this.telefono = telefono;
        //posición actual en la cual se agregará una nueva mascota:
        pos_animal_nuevo = 0;
        
    }

    // 2. funcionalidades:
    public void registrarIngresoPerro(Animal mascota)
    {
        //agregar al arreglo de acuerdo a la posición actual:
        animales[pos_animal_nuevo] = mascota;
        pos_animal_nuevo++;

    }

    public void registrarSalidaMascota(Animal mascota)
    {
        //buscar en el arreglo (recorrer con un ciclo for):

        //asignar null o eliminar:
    }

    public void cargarListaMascotas(String rutaArchivo)
    {
        //los bloques try catch permiten controlar errores sin interrumpir la ejecución del programa:
        try {
            //instrucciones que pueden generar error:
            BufferedReader lectorArchivo = new BufferedReader(new FileReader(rutaArchivo));
            String linea = "";
            //lectura secuencial del archivo:
            while(   (linea = lectorArchivo.readLine()) != null       )
            {

            }
        } 
        //pueden haber varios bloques catch, de acuerdo al tipo de excepciones:
        catch (FileNotFoundException ex) 
        {
        } 
        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        finally{}



    }


    
}
