# Algoritmos y Programación 2
## Tutorial paso a paso: JFrame con BorderLayout y GridLayout en Java

Este tutorial te enseñará a crear una interfaz gráfica en Java utilizando **Swing**, con un `JFrame` principal y dos `JPanel`, uno diagramado con **BorderLayout** y otro con **GridLayout**.

---

### 1. Requisitos previos

Antes de comenzar, asegúrate de tener instalado:

- **Java JDK 8 o superior**
- **Un IDE** como IntelliJ IDEA, NetBeans, Eclipse o VS Code
- **Conocimientos básicos de programación en Java**

---

### 2. Estructura general del programa

Crearemos un solo archivo llamado `VentanaEjemplo.java` con la siguiente estructura:

```java
import javax.swing.*;
import java.awt.*;

public class VentanaEjemplo extends JFrame {

    public VentanaEjemplo() {
        // Configuración básica de la ventana
        setTitle("Ejemplo de JFrame con BorderLayout y GridLayout");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Crear los paneles
        JPanel panelSuperior = crearPanelSuperior();
        JPanel panelCentral = crearPanelCentral();

        // Agregar los paneles al JFrame
        add(panelSuperior, BorderLayout.NORTH);
        add(panelCentral, BorderLayout.CENTER);

        // Hacer visible la ventana
        setVisible(true);
    }

    private JPanel crearPanelSuperior() {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.LEFT));

        JLabel etiqueta = new JLabel("Ingrese su nombre:");
        JTextField campoTexto = new JTextField(15);
        JButton botonSaludar = new JButton("Saludar");

        // Acción del botón
        botonSaludar.addActionListener(e -> {
            String nombre = campoTexto.getText();
            JOptionPane.showMessageDialog(this, "¡Hola, " + nombre + "!");
        });

        panel.add(etiqueta);
        panel.add(campoTexto);
        panel.add(botonSaludar);

        return panel;
    }

    private JPanel crearPanelCentral() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2, 10, 10));

        JLabel etiquetaImagen = new JLabel("Imagen:");
        ImageIcon icono = new ImageIcon("ruta/a/tu/imagen.png"); // Cambia esta ruta
        JLabel imagen = new JLabel(icono);

        JLabel etiquetaLista = new JLabel("Selecciona tu color favorito:");
        String[] colores = {"Rojo", "Verde", "Azul", "Amarillo"};
        JComboBox<String> listaColores = new JComboBox<>(colores);

        panel.add(etiquetaImagen);
        panel.add(imagen);
        panel.add(etiquetaLista);
        panel.add(listaColores);

        return panel;
    }

    public static void main(String[] args) {
        // Ejecutar en el hilo de eventos de Swing
        SwingUtilities.invokeLater(VentanaEjemplo::new);
    }
}
```

---

### 3. Explicación paso a paso

#### Paso 1: Crear la ventana principal

Usamos `JFrame` para la ventana principal. Le asignamos un título, tamaño y el cierre automático al presionar la “X”.

#### Paso 2: Establecer BorderLayout

```java
setLayout(new BorderLayout());
```

Esto permite ubicar los paneles en regiones: `NORTH`, `SOUTH`, `EAST`, `WEST`, `CENTER`.

En este ejemplo usamos:

- `panelSuperior` → **NORTH**
- `panelCentral` → **CENTER**

#### Paso 3: Crear el panel superior

Usa `FlowLayout` para ubicar elementos en una sola fila: una etiqueta, una caja de texto y un botón.

```java
panel.add(new JLabel("Ingrese su nombre:"));
panel.add(new JTextField(15));
panel.add(new JButton("Saludar"));
```

El botón muestra un saludo personalizado usando `JOptionPane`.

#### Paso 4: Crear el panel central con GridLayout

GridLayout organiza los elementos en filas y columnas:

```java
panel.setLayout(new GridLayout(2, 2, 10, 10));
```

Aquí mostramos una **imagen** (usa tu propia ruta), un **combo box** y etiquetas.

#### Paso 5: Añadir una imagen

Para mostrar una imagen:

```java
ImageIcon icono = new ImageIcon("ruta/a/tu/imagen.png");
JLabel imagen = new JLabel(icono);
```

⚠️ Asegúrate de que el archivo de imagen esté en la misma carpeta del `.java` o en una ruta absoluta.

#### Paso 6: Agregar una lista desplegable (JComboBox)

```java
String[] colores = {"Rojo", "Verde", "Azul"};
JComboBox<String> lista = new JComboBox<>(colores);
```

Esto crea una lista desplegable simple.

---

### 4. Resultado esperado

Al ejecutar el programa verás:

- Una ventana con un campo para ingresar tu nombre y un botón que muestra un saludo.
- Una sección inferior con una imagen y una lista desplegable de colores.

---

### 5. Ejercicio adicional

Agrega un botón que cambie el color del fondo del `panelCentral` según el color elegido en el `JComboBox`.

Pista:

```java
String color = (String) listaColores.getSelectedItem();
switch (color) {
    case "Rojo": panel.setBackground(Color.RED); break;
    case "Verde": panel.setBackground(Color.GREEN); break;
    case "Azul": panel.setBackground(Color.BLUE); break;
}
```

---

### Conclusión

Has aprendido a:

- Crear una ventana con **JFrame**
- Organizar elementos con **BorderLayout** y **GridLayout**
- Usar componentes básicos de Swing como **JLabel**, **JTextField**, **JButton**, **JComboBox**, e **ImageIcon**
