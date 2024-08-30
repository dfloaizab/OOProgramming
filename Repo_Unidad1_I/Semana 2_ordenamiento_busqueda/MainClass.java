import java.util.ArrayList;
import java.util.Collections;

public class MainClass {

    final static int NUM_PERSONAS = 6;
    static Persona[] personas_s;

    public static void main(String[] args) {
        // ordenamiento con un arreglo dinámico:
        ArrayList<Persona> personas = new ArrayList<Persona>();
        personas.add(new Persona(28, "Ximena"));
        personas.add(new Persona(25, "Diego"));
        personas.add(new Persona(30, "Diana"));
        personas.add(new Persona(32, "Catalina"));
        personas.add(new Persona(45, "Pedro"));
        personas.add(new Persona(5, "Sebastián"));
        Collections.sort(personas);
        for (Persona p : personas) {
            System.out.println(p);
        }
        // ordenamiento con un arreglo estático:
        personas_s = new Persona[10];
        personas_s[0]=new Persona(28, "Ximena"));
        personas_s[1]=new Persona(25, "Diego"));
        personas_s[2]=new Persona(30, "Diana"));
        personas_s[3]=new Persona(32, "Catalina"));
        personas_s[4]=new Persona(45, "Pedro"));
        personas_s[5]=new Persona(5, "Sebastián"));
        
        miOrdenamiento_MS();

        for(Persona p: personas_s)
        {
            System.out.print(p);
        }

        //buscar elemento con búsqueda binaria:

        //serializar:
    }

    /**
     * ordenar usando quicksort una lista de objetoc con compareTo
     */
    public static void miOrdenamiento_QS() {

    }

    // ordenar el arreglo usando mergesort
    public static void miOrdenamiento_MS() {
        for(int i=1; i<personas_s.length;i++){
            int j = i-1;
            while( j>=0 && (personas_s[j].compareTo(personas_s[i]) == 1)){
                personas_s[j+1] = personas_s[j];
                j = j-1;
            }
            personas_s[j+1]=personas_s[i];
        }
    }
}
