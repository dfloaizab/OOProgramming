# Taller Recuperatorio — Unidad 1: Programación Estructurada en Java
**Algoritmos y Programación 2 — Actividad de recuperación**

**Valor total:** 5.0 puntos
**Plazo de entrega:** Septiembre 29 de 2026, Mediodía
**Modalidad:** Individual
**Entregable:** Un único archivo `.java` por punto (o un proyecto con las 5 clases), más una captura de pantalla o log de ejecución de cada programa que demuestre que funciona con al menos dos casos de prueba distintos.

---

## Instrucciones generales

- Cada punto debe resolverse en un archivo Java independiente, con la clase `public class` nombrada como se indica en cada ejercicio.
- El código debe compilar y ejecutarse sin errores. Un programa que no compila obtiene 0 en ese punto, sin importar qué tan cerca esté de la solución.
- Se evaluará: correctitud del resultado, uso adecuado de la estructura de control o técnica indicada, nombres de variables descriptivos y comentarios mínimos explicando la lógica.
- No se aceptan soluciones que resuelvan el problema "a mano" (valores fijos, sin ciclos ni funciones) cuando el ejercicio pide explícitamente un ciclo o una función.
- Se recomienda probar cada programa con al menos dos conjuntos de datos distintos antes de entregar.

---

## Punto 1 — Estructuras de control (1.0 punto)
**Clase:** `ClasificadorNotas`

Escriba un programa que:
1. Declare un arreglo de 8 calificaciones (valores `double` entre 0.0 y 5.0) definidos directamente en el código.
2. Recorra el arreglo con un ciclo `for` y, para cada nota, use `if-else if-else` para clasificarla e imprimir en el formato `Nota X.X: Categoría`, según:
   - `>= 4.5` → "Excelente"
   - `>= 3.5` → "Bueno"
   - `>= 3.0` → "Aprobado"
   - `< 3.0` → "Reprobado"
3. Al final, usando un ciclo `while` (no `for`), cuente cuántas notas son "Reprobado" e imprima el total.

**Se evalúa:** uso correcto de `if-else if`, uso de un `while` adicional (no basta con reutilizar el `for`), manejo correcto de los límites de las categorías.

---

## Punto 2 — Funciones (1.0 punto)
**Clase:** `ConversorTemperatura`

Implemente y utilice las siguientes funciones (con esas firmas exactas):

```java
public static double celsiusAFahrenheit(double celsius)
public static double fahrenheitACelsius(double fahrenheit)
public static String clasificarClima(double celsius)
```

- `celsiusAFahrenheit` y `fahrenheitACelsius` aplican las fórmulas de conversión estándar.
- `clasificarClima` recibe una temperatura en Celsius y retorna `"Frío"` si es menor a 15, `"Templado"` si está entre 15 y 25 (inclusive), y `"Caluroso"` si es mayor a 25.

En `main`, pida al programa (puede ser con valores fijos, no es obligatorio usar `Scanner`) procesar al menos 3 temperaturas distintas en Celsius, mostrando para cada una: el valor original, su equivalente en Fahrenheit (usando la función) y su clasificación (usando `clasificarClima`, que a su vez debe ser llamada desde dentro de la misma función o desde `main`, pero reutilizando el código, sin repetir la lógica de comparación).

**Se evalúa:** firmas correctas, cada función retorna un valor (ninguna es `void`), reutilización real de las funciones (no repetir la lógica de conversión o clasificación fuera de ellas).

---

## Punto 3 — Arreglos (1.0 punto)
**Clase:** `AnalisisVentas`

Dado un arreglo de 10 enteros con las ventas diarias de un producto (defínalo con valores fijos en el código, incluyendo al menos un valor negativo que represente una devolución neta), escriba un programa que calcule e imprima, usando ciclos (no métodos de librerías como `Arrays.stream`):

1. La suma total de ventas.
2. El valor máximo y el valor mínimo del arreglo.
3. El promedio de ventas (como `double`, con decimales correctos).
4. Cuántos días tuvieron ventas por encima del promedio.

**Se evalúa:** inicialización correcta del máximo/mínimo (no usar 0 como valor inicial, dado que hay negativos), uso correcto de división para obtener el promedio con decimales, un segundo recorrido del arreglo para comparar contra el promedio ya calculado.

---

## Punto 4 — Matrices (1.0 punto)
**Clase:** `RegistroAsistencia`

Se tiene una matriz de asistencia de 5 estudiantes (filas) a 6 clases (columnas), donde cada valor es `1` (asistió) o `0` (no asistió). Defina la matriz con valores fijos en el código, variando los datos entre estudiantes.

Escriba un programa que:
1. Recorra la matriz completa e imprima, para cada estudiante (fila), cuántas clases asistió, con el formato `Estudiante X: Y asistencias de 6`.
2. Recorra la matriz por columnas y, para cada clase (columna), imprima cuántos estudiantes asistieron, con el formato `Clase X: Y asistentes de 5`.
3. Identifique e imprima cuál fue la clase con menor asistencia (índice y cantidad).

**Se evalúa:** uso correcto de `matriz.length` y `matriz[i].length`, distinción clara entre el recorrido por fila (punto 1) y por columna (punto 2), lógica correcta para hallar el mínimo en el punto 3.

---

## Punto 5 — Integración: funciones sobre matrices (1.0 punto)
**Clase:** `AnalisisAsistencia`

Retome la matriz del Punto 4, pero ahora resuelva el mismo problema **usando funciones**, con estas firmas exactas:

```java
public static int asistenciasEstudiante(int[][] m, int fila)
public static int asistentesClase(int[][] m, int columna)
public static int claseMenorAsistencia(int[][] m)
```

- `asistenciasEstudiante` retorna cuántas clases asistió el estudiante en la fila dada.
- `asistentesClase` retorna cuántos estudiantes asistieron a la clase en la columna dada.
- `claseMenorAsistencia` retorna el índice de la columna con menor asistencia, y **debe llamar internamente a `asistentesClase`** para cada columna (no debe recorrer la matriz completa "a mano" dentro de esta función).

En `main`, use las tres funciones para imprimir el mismo reporte del Punto 4.

**Se evalúa:** que `claseMenorAsistencia` reutilice `asistentesClase` en lugar de repetir el recorrido, que los índices de fila y columna no se confundan, que las tres funciones retornen exactamente lo que su firma indica.

---

## Rúbrica resumida

| Punto | Tema | Valor |
|---|---|---|
| 1 | Estructuras de control (`if-else`, `for`, `while`) | 1.0 |
| 2 | Funciones con retorno y reutilización | 1.0 |
| 3 | Arreglos: recorrido, máximo/mínimo, promedio | 1.0 |
| 4 | Matrices: recorrido por fila y por columna | 1.0 |
| 5 | Integración: funciones aplicadas sobre matrices | 1.0 |
| **Total** | | **5.0** |

Cada punto se califica como todo o nada según compile y produzca el resultado correcto con los casos de prueba usados por el docente; no hay puntaje parcial dentro de un mismo punto salvo que el docente decida evaluarlo de forma diferenciada al momento de la corrección.
