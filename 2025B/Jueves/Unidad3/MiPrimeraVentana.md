# Algoritmos y Programación 2, 2025B
## Creación de una ventana sencilla con AWT y Swing en Java

Este ejercicio muestra paso a paso cómo construir una interfaz gráfica sencilla con **AWT** y **Swing** en Java.  
Incluye una **caja de selección (JComboBox)** y un **botón (JButton)**, además de la gestión de eventos.

---

## Paso 1: Importar las librerías necesarias

```java
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
```

Estas librerías contienen:
- **javax.swing** → componentes gráficos modernos (botones, menús, cuadros de texto, etc.).
- **java.awt** → herramientas básicas de interfaz y manejo de layouts.
- **java.awt.event** → clases para capturar y manejar eventos del usuario.

---

## Paso 2: Crear la clase principal y el constructor

```java
public class VentanaEjemplo extends JFrame implements ActionListener {

    private JComboBox<String> comboOpciones;
    private JButton botonAceptar;

    public VentanaEjemplo() {
        // Título de la ventana
        setTitle("Ejemplo con AWT y Swing");

        // Tamaño de la ventana
        setSize(300, 200);

        // Operación al cerrar la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Layout simple
        setLayout(new FlowLayout());

        // Crear componentes
        comboOpciones = new JComboBox<>();
        comboOpciones.addItem("Opción 1");
        comboOpciones.addItem("Opción 2");
        comboOpciones.addItem("Opción 3");

        botonAceptar = new JButton("Aceptar");

        // Agregar los componentes al contenedor
        add(comboOpciones);
        add(botonAceptar);

        // Registrar el manejador de eventos
        botonAceptar.addActionListener(this);

        // Hacer visible la ventana
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Obtener la opción seleccionada
        String seleccion = (String) comboOpciones.getSelectedItem();
        JOptionPane.showMessageDialog(this, "Seleccionaste: " + seleccion);
    }

    public static void main(String[] args) {
        new VentanaEjemplo();
    }
}
```

---

## Paso 3: Explicación del manejo de eventos

1. La clase implementa la interfaz **`ActionListener`**, que obliga a definir el método `actionPerformed()`.
2. Al presionar el botón, se ejecuta ese método automáticamente.
3. Dentro del método, se obtiene el elemento seleccionado del combo con:
   ```java
   comboOpciones.getSelectedItem()
   ```
4. Finalmente, se muestra un cuadro de diálogo con el resultado usando:
   ```java
   JOptionPane.showMessageDialog(this, "Seleccionaste: " + seleccion);
   ```

---

## Paso 4: Compilación y ejecución

1. Guarde el archivo como `VentanaEjemplo.java`
2. Abra una terminal en la carpeta donde lo guardaste.
3. Compile:
   ```bash
   javac VentanaEjemplo.java
   ```
4. Ejecute:
   ```bash
   java VentanaEjemplo
   ```

Debería ver una pequeña ventana con una caja de selección y un botón funcional.

---

## Resumen

| Concepto | Descripción |
|-----------|--------------|
| `JFrame` | Ventana principal |
| `JComboBox` | Caja de selección desplegable |
| `JButton` | Botón interactivo |
| `ActionListener` | Interfaz para manejar eventos de acción |
| `JOptionPane` | Cuadro de diálogo para mostrar mensajes |

---

> **Consejo:** Swing es una biblioteca más moderna y flexible que AWT.  
> Aunque AWT sigue siendo útil, se recomienda usar Swing o JavaFX en proyectos actuales.
