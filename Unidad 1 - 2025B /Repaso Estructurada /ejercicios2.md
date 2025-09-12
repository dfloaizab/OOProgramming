# Ejercicios de Programación Estructurada en C

## Ejercicio 3: Donación de alimentos

**Enunciado:**  
Se requiere un programa en C que registre la cantidad de alimentos donados a una fundación durante una semana. Se debe usar un arreglo de tamaño fijo para almacenar las donaciones diarias (en kilogramos). El programa debe permitir al usuario, a través de un menú de opciones, consultar el total de alimentos recibidos en la semana, calcular el promedio diario de donaciones y mostrar todas las donaciones registradas.

**Objetivos del ejercicio:**  
- Reforzar el uso de arreglos unidimensionales para almacenar datos diarios.  
- Practicar ciclos para recorrer y procesar los valores de un arreglo.  
- Aplicar operaciones aritméticas básicas para obtener sumatorias y promedios.  
- Diseñar un menú que permita seleccionar operaciones sobre los datos almacenados.  

**Plantilla de código en C:**
```c
#include <stdio.h>

int main() {
    int donaciones[7];
    int i, opcion;
    int total = 0;
    float promedio;

    // Entrada de datos
    for (i = 0; i < 7; i++) {
        printf("Ingrese la cantidad de alimentos donados el día %d (kg): ", i + 1);
        scanf("%d", &donaciones[i]);
    }

    do {
        printf("\n--- Menú de opciones ---\n");
        printf("1. Mostrar total de alimentos donados en la semana\n");
        printf("2. Mostrar promedio diario de donaciones\n");
        printf("3. Mostrar todas las donaciones registradas\n");
        printf("4. Salir\n");
        printf("Seleccione una opción: ");
        scanf("%d", &opcion);

        switch (opcion) {
            case 1:
                total = 0;
                for (i = 0; i < 7; i++) {
                    total += donaciones[i];
                }
                printf("Total de alimentos donados en la semana: %d kg\n", total);
                break;
            case 2:
                total = 0;
                for (i = 0; i < 7; i++) {
                    total += donaciones[i];
                }
                promedio = total / 7.0;
                printf("Promedio diario de donaciones: %.2f kg\n", promedio);
                break;
            case 3:
                printf("Donaciones registradas:\n");
                for (i = 0; i < 7; i++) {
                    printf("Día %d: %d kg\n", i + 1, donaciones[i]);
                }
                break;
            case 4:
                printf("Saliendo del programa...\n");
                break;
            default:
                printf("Opción inválida. Intente de nuevo.\n");
        }
    } while (opcion != 4);

    return 0;
}
```

---

## Ejercicio 4: Refugio de animales

**Enunciado:**  
Un refugio de animales lleva un registro del número de animales recibidos cada mes durante un año. Se debe desarrollar un programa en C que permita ingresar los datos en un arreglo de 12 elementos (uno por cada mes). Luego, mediante un menú de opciones, el programa debe calcular el total anual de animales recibidos, identificar el mes con el mayor número de ingresos y mostrar el registro completo de los meses.

**Objetivos del ejercicio:**  
- Practicar la manipulación de arreglos para registrar información mensual.  
- Reforzar el uso de ciclos y condicionales para encontrar el valor máximo en un conjunto de datos.  
- Consolidar la lógica de procesamiento de información en estructuras secuenciales, iterativas y selectivas.  
- Implementar un menú de opciones para interactuar con el usuario.  

**Plantilla de código en C:**
```c
#include <stdio.h>

int main() {
    int ingresos[12];
    int i, opcion, total = 0;
    int mesMayor = 0, maxIngresos = 0;

    // Entrada de datos
    for (i = 0; i < 12; i++) {
        printf("Ingrese el número de animales recibidos en el mes %d: ", i + 1);
        scanf("%d", &ingresos[i]);
    }

    do {
        printf("\n--- Menú de opciones ---\n");
        printf("1. Mostrar total anual de animales recibidos\n");
        printf("2. Mostrar mes con mayor número de ingresos\n");
        printf("3. Mostrar el registro completo de ingresos\n");
        printf("4. Salir\n");
        printf("Seleccione una opción: ");
        scanf("%d", &opcion);

        switch (opcion) {
            case 1:
                total = 0;
                for (i = 0; i < 12; i++) {
                    total += ingresos[i];
                }
                printf("Total anual de animales recibidos: %d\n", total);
                break;
            case 2:
                maxIngresos = ingresos[0];
                mesMayor = 1;
                for (i = 1; i < 12; i++) {
                    if (ingresos[i] > maxIngresos) {
                        maxIngresos = ingresos[i];
                        mesMayor = i + 1;
                    }
                }
                printf("El mes con más ingresos fue el mes %d con %d animales.\n", mesMayor, maxIngresos);
                break;
            case 3:
                printf("Registro completo de ingresos:\n");
                for (i = 0; i < 12; i++) {
                    printf("Mes %d: %d animales\n", i + 1, ingresos[i]);
                }
                break;
            case 4:
                printf("Saliendo del programa...\n");
                break;
            default:
                printf("Opción inválida. Intente de nuevo.\n");
        }
    } while (opcion != 4);

    return 0;
}
```
