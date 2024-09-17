import java.util.Scanner;

public class GaleriaArte {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar número de obras de arte
        System.out.print("¿Cuántas obras de arte quieres registrar? ");        
        int numObras = scanner.nextInt();

        // Crear arreglos para almacenar nombres y precios
        // arreglo de String para los nombres de las obras
        // arreglo de double para los precios (de tamaño numObras)
        

        // Registrar obras de arte
        registrarObrasDeArte(nombresObras, preciosObras, scanner);

        // Mostrar menú de opciones
        mostrarMenu(nombresObras, preciosObras, scanner);

        scanner.close();
    }

    /**
     * Contrato: Registrar el nombre y precio de cada obra de arte.
     * @param nombresArreglo Arreglo que almacena los nombres de las obras.
     * @param preciosArreglo Arreglo que almacena los precios de las obras.
     * @param scanner Objeto Scanner para leer la entrada del usuario.
     */
    public static void registrarObrasDeArte(String[] nombresArreglo, double[] preciosArreglo, Scanner scanner) {
        for (int i = 0; i < nombresArreglo.length; i++) {
            System.out.println("Obra de arte #" + (i + 1));
            
            // Solicitar el nombre de la obra
            System.out.print("Nombre de la obra: ");
            nombresArreglo[i] = scanner.next();

            // Solicitar y validar el precio
            double precio;
            do {
                //Validar que el precio sea correcto
            } while (precio < 100 || precio > 10000);
            preciosArreglo[i] = precio;
        }
    }

    /**
     * Contrato: Mostrar el menú de opciones y ejecutar las funciones correspondientes.
     * @param nombresArreglo Arreglo que almacena los nombres de las obras.
     * @param preciosArreglo Arreglo que almacena los precios de las obras.
     * @param scanner Objeto Scanner para leer la entrada del usuario.
     */
    public static void mostrarMenu(String[] nombresArreglo, double[] preciosArreglo, Scanner scanner) {
        int opcion;
        do {
            System.out.println("\nOpciones:");
            System.out.println("1. Mostrar todas las obras de arte y sus precios");
            System.out.println("2. Mostrar la obra de arte más cara");
            System.out.println("3. Mostrar la obra de arte más barata");
            System.out.println("4. Calcular el precio promedio de las obras de arte");
            System.out.println("5. Mostrar obras de arte cuyo precio esté por encima de un valor");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    mostrarObras(nombresArreglo, preciosArreglo);
                    break;
                case 2:
                    mostrarObraMasCara(nombresArreglo, preciosArreglo);
                    break;
                case 3:
                    mostrarObraMasBarata(nombresArreglo, preciosArreglo);
                    break;
                case 4:
                    mostrarPrecioPromedio(preciosArreglo);
                    break;
                case 5:
                    System.out.print("Introduce el valor de precio mínimo: ");
                    double precioMinimo = scanner.nextDouble();
                    mostrarObrasPorPrecio(nombresArreglo, preciosArreglo, precioMinimo);
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }

        } while (opcion != 6);
    }

    /**
     * Contrato: Mostrar todas las obras de arte con sus precios.
     * terminar contrato
     */
    public static void mostrarObras(String[] nombresArreglo, double[] preciosArreglo) {
        // Completar: Mostrar todas las obras y sus precios
    }

    /**
     * Contrato: Mostrar la obra de arte más cara.
     * terminar contrato
     */
    public static void mostrarObraMasCara(String[] nombresArreglo, double[] preciosArreglo) {
        // Completar: Encontrar y mostrar la obra más cara
    }

    /**
     * Contrato: Mostrar la obra de arte más barata.
     * terminar contrato
     */
    public static void mostrarObraMasBarata(String[] nombresArreglo, double[] preciosArreglo) {
        // Completar: Encontrar y mostrar la obra más barata
    }

    /**
     * Contrato: Calcular y mostrar el precio promedio de las obras de arte.
     * terminar contrato
     */
    public static void mostrarPrecioPromedio(double[] preciosArreglo) {
        // Completar: Calcular el precio promedio de las obras
    }

    /**
     * Contrato: Mostrar todas las obras de arte cuyo precio esté por encima de un valor dado.
     * terminar contrato
     */
    public static void mostrarObrasPorPrecio(String[] nombresArreglo, double[] preciosArreglo, double precioMinimo) {
        // Completar: Mostrar las obras con precio mayor al valor dado
    }
}
