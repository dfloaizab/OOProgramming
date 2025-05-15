
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class MainPersistencia
{
    


    public static void main(String[] args)
    {

        //Lista dinámica de estudiantes:
        ArrayList<Estudiante> estudiantes = new ArrayList<>();

        //Se va a cargar una lista de estudiantes desde el archivo data.txt:
        try{
            //vamos a abrir un buffer a un archivo de texto:
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));
            String linea, datos[];
            //Leemos línea por línea hasta que llegue al final del archivo:
            while(   (linea = br.readLine()) != null    )
            {
                //descomponer cada línea en varios campos:
                datos = linea.split(";");

                //Se crea un nuevo estudiante:
                //datos[0] = documento
                //datos[1] = nombre
                //datos[2] = anio_nac
                //datos[3] = ciudad                
                Estudiante nuevo = new Estudiante(Integer.parseInt(datos[2]), datos[3], datos[0], datos[1]);

                //Se agrega a la lista:
                estudiantes.add(nuevo);
            }

        }
        catch(Exception ex)
        {

        }
        finally{         }


    }


}