# Ejercicio Java: Inventario de Videojuegos

## Enunciado

Escribe un programa en Java que administre el inventario de una tienda de videojuegos. El programa debe manejar una lista fija de **6 videojuegos**, cada uno con nombre, precio y cantidad en stock.

---

## Tareas

### 1. Almacenamiento de datos
Guarda los datos de los videojuegos usando arreglos paralelos:
- `String[] nombres` → nombre del juego
- `double[] precios` → precio en dólares
- `int[] stock` → unidades disponibles

### 2. Función `calcularValorTotal`
Calcula el valor total de cada juego en inventario aplicando la fórmula:

```
valorTotal = precio × stock
```

### 3. Función `clasificarStock`
Determina la disponibilidad de cada juego según su stock:

| Condición         | Resultado      |
|-------------------|----------------|
| stock = 0         | `"Agotado"`    |
| stock entre 1 y 4 | `"Stock bajo"` |
| stock ≥ 5         | `"Disponible"` |

### 4. Reporte general
Muestra una tabla con toda la información de cada videojuego: nombre, precio, stock, clasificación y valor total.

### 5. Resumen final
Al terminar el reporte, muestra:
- El **juego más caro** y su precio
- El **valor total del inventario completo**

---

## Ejemplo de salida esperada

```
======== INVENTARIO DE VIDEOJUEGOS ========
Zelda: Tears of the Kingdom | $69.99 | Stock: 3 | Stock bajo  | Valor: $209.97
Elden Ring                  | $59.99 | Stock: 0 | Agotado     | Valor: $0.00
Minecraft                   | $29.99 | Stock: 8 | Disponible  | Valor: $239.92
Hades II                    | $24.99 | Stock: 5 | Disponible  | Valor: $124.95
God of War Ragnarok         | $69.99 | Stock: 2 | Stock bajo  | Valor: $139.98
Hollow Knight               | $14.99 | Stock: 0 | Agotado     | Valor: $0.00
===========================================
Juego más caro: Zelda: Tears of the Kingdom ($69.99)
Valor total del inventario: $714.82
```

---

## Requisitos técnicos

- Usar **arreglos paralelos** para almacenar los datos de los videojuegos
- Implementar al menos dos funciones:
  - `calcularValorTotal(double precio, int stock)`
  - `clasificarStock(int stock)`
- Usar un ciclo `for` para recorrer el inventario
- Usar condicionales `if / else if / else` dentro de `clasificarStock`

---

## Pistas

- Para encontrar el juego más caro, guarda el índice del máximo mientras recorres el arreglo.
- Acumula el valor total del inventario sumando el resultado de `calcularValorTotal` en cada iteración.
- Puedes usar `String.format("%.2f", valor)` para formatear los precios con dos decimales.
