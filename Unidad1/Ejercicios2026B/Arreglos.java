import java.util.Scanner;

public class Arreglos
{

    //Atributos y propiedades de clase:
    //(datos globales a todos los métodos) 
    //Método "main" que es el punto de inicio del programa:
    //Programa para registro de donaciones
    // alimentos (kg) y dinero.
    // con un límite de kg recibidos
    // el programa recibe donaciones hasta que el usuario desee o hasta que se 
    // alcance el límite de la bodega
    // PROGRAMA = DATOS + ALGORITMOS
    public static void main(String[] args)
    {
        //Variables y constantes, locales al método main:
        // total recibido dinero, total recibido alimentos, limite de kg..
        final int LIMITE = 2500; //limite de kg de alimentos a recibir
        int donacion_dinero, donacion_alimento, tot_alimento=0, tot_dinero=0;
        String nombre_donante;
        int opcion, contador_donaciones = 0;
        boolean donar = true;

        //ARREGLOS EN JAVA:
        //DE 1 DIMENSIÓN (estático, tamaño fijo)
        String[] donantes = new String[1000]; //{"Diego","Diana","Pedro","Luis"}

        Scanner lector = new Scanner(System.in);
     
        System.out.println("SISTEMA DE REGISTROS DE DONACIONES DE ALIMENTOS Y DINERO.");

        //pedir donaciones, y acumularlas, mientras el usuario, quiera donar (donar = true)
        while(donar == true)
        {
            System.out.println("Qué desea donar? 1. Dinero 2. Alimento. 3. No donar más.:");
            opcion = lector.nextInt(); //LEER UN ENTERO POR CONSOLA

            //ESTE IF EN CASCADA SE PUEDE REEMPLAZAR POR UN SWITCH:
            if(opcion == 1)
            {
                System.out.println("Cuánto dinero va a donar?:");
                donacion_dinero = lector.nextInt();
                tot_dinero = tot_dinero + donacion_dinero;
                 //Vamos a guardar también el nombre del donante:
                System.out.println("Cuál es tu nombre:");
                nombre_donante = lector.next();
                donantes[contador_donaciones] = nombre_donante;
                contador_donaciones++;
            }
            else if(opcion == 2)
            {
                System.out.println("Cuántos kilogramos de alimento va a donar?:");
                System.out.println("En este momento se ha donado " + tot_alimento + "kgs de alimento.");
                donacion_alimento = lector.nextInt();
                //Validar que el total de kg de alimentos no supere el límite:
                if((tot_alimento + donacion_alimento) <= LIMITE){
                    tot_alimento = tot_alimento + donacion_alimento;
                     //Vamos a guardar también el nombre del donante:
                    System.out.println("Cuál es tu nombre:");
                    nombre_donante = lector.next();
                    donantes[contador_donaciones] = nombre_donante;
                    contador_donaciones++;
                }
                else
                    System.out.println("Lo sentimos, su donación supera el límite que se puede almacenar.");
            }else if(opcion == 3)    
            {   
                System.out.println("Muchas gracias por sus donaciones. Hasta luego.");
                donar = false;
            }            
        }
        
        //EJERCICIO DE REPASO DE MANEJO DE ARREGLOS:
        //1. IMPRIMIR NOMBRES DE TODOS LOS DONANTES:
        //(RECORRER TODO EL ARREGLO DE NOMBRES)

        //2. IMPRIMIR EL NOMBRE DE LA PERSONA QUE DONÓ LA MAYOR CANTIDAD DE ALIMENTO:
        //OJO: TENER EN CUENTA CUANDO SE HAGA LA DONACIÓN, REGISTRAR EL CONTADOR CUANDO SE DONE LA MAYOR CANTIDAD

        //3. IMPRIMIR EL NOMBRE DE LA PERSONA QUE DONÓ LA MAYOR CANTIDAD DE DINERO:
        //OJO: TENER EN CUENTA CUANDO SE HAGA LA DONACIÓN, REGISTRAR EL CONTADOR CUANDO SE DONE LA MAYOR CANTIDAD

    
    }
}





