# Ejercicios de Programación Estructurada en C

## Ejercicio 1: Inventario de productos

### Objetivos
- Practicar el uso de arreglos unidimensionales de enteros.  
- Implementar ciclos para recorrer y actualizar datos.  
- Utilizar condicionales para validar y controlar el flujo del programa.  

### Enunciado
Escriba un programa en C que permita registrar la cantidad disponible de un número fijo de productos (máximo 10). El programa debe:  
1. Solicitar al usuario la cantidad inicial de cada producto (almacenando únicamente la cantidad en un arreglo de enteros, y utilizando índices para identificarlos).  
2. Mostrar un menú que permita:  
   - Incrementar o disminuir la cantidad de un producto, validando que no se generen valores negativos.  
   - Consultar el inventario completo.  
3. Utilizar estructuras de control como ciclos y condicionales para administrar las operaciones de actualización y consulta.  

### Plantilla de código
```c
#include <stdio.h>

int main() {
    int inventario[10];
    int n, opcion, id, cantidad;

    // Inicialización del inventario
    printf("Ingrese el número de productos (máximo 10): ");
    scanf("%d", &n);

    for (int i = 0; i < n; i++) {
        printf("Cantidad inicial del producto %d: ", i);
        scanf("%d", &inventario[i]);
    }

    // Menú principal
    do {
        printf("\n--- Menú Inventario ---\n");
        printf("1. Incrementar cantidad\n");
        printf("2. Disminuir cantidad\n");
        printf("3. Consultar inventario\n");
        printf("4. Salir\n");
        printf("Seleccione una opción: ");
        scanf("%d", &opcion);

        switch (opcion) {
            case 1:
                // Lógica para incrementar
                break;
            case 2:
                // Lógica para disminuir
                break;
            case 3:
                // Lógica para mostrar inventario
                break;
            case 4:
                printf("Saliendo...\n");
                break;
            default:
                printf("Opción inválida.\n");
        }
    } while (opcion != 4);

    return 0;
}
```

---

## Ejercicio 2: Horarios de trenes

### Objetivos
- Practicar el manejo de arreglos para almacenar datos numéricos.  
- Implementar ciclos para recorrer y analizar datos.  
- Usar condicionales para identificar valores mínimos, máximos y validar entradas.  

### Enunciado
Escriba un programa en C que gestione los horarios de salida de 5 trenes en un día. El programa debe:  
1. Solicitar al usuario las horas de salida de cada tren en formato de 24 horas (arreglo de enteros).  
2. Mostrar un menú que permita:  
   - Consultar el primer tren en salir (menor valor en el arreglo).  
   - Consultar el último tren en salir (mayor valor en el arreglo).  
   - Verificar si existe un tren programado a una hora específica ingresada por el usuario.  
3. Utilizar ciclos para recorrer el arreglo y condicionales para comparar y obtener los resultados solicitados.  

### Plantilla de código
```c
#include <stdio.h>

int main() {
    int trenes[5];
    int opcion, hora, encontrado;

    // Registro de horarios
    for (int i = 0; i < 5; i++) {
        printf("Hora de salida del tren %d (formato 24h): ", i + 1);
        scanf("%d", &trenes[i]);
    }

    // Menú principal
    do {
        printf("\n--- Menú Horarios ---\n");
        printf("1. Consultar primer tren en salir\n");
        printf("2. Consultar último tren en salir\n");
        printf("3. Verificar tren a una hora específica\n");
        printf("4. Salir\n");
        printf("Seleccione una opción: ");
        scanf("%d", &opcion);

        switch (opcion) {
            case 1:
                // Lógica para encontrar el menor valor
                break;
            case 2:
                // Lógica para encontrar el mayor valor
                break;
            case 3:
                // Lógica para verificar existencia de una hora
                break;
            case 4:
                printf("Saliendo...\n");
                break;
            default:
                printf("Opción inválida.\n");
        }
    } while (opcion != 4);

    return 0;
}
```
