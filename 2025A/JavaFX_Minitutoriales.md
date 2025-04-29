# Mini Tutorial 1: "Hola Mundo" en JavaFX

## Requisitos
- Java 11 o superior
- IDE como IntelliJ IDEA, Eclipse o VS Code
- JavaFX SDK descargado e integrado al proyecto

## Paso 1: Crear la clase principal

```java
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HolaMundoJavaFX extends Application {
    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("¡Hola, JavaFX!");
        StackPane root = new StackPane(label);
        Scene scene = new Scene(root, 300, 200);

        primaryStage.setTitle("Mi primera app JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
```

## Paso 2: Configuración del entorno

### En IntelliJ IDEA:
1. Crea un nuevo proyecto Java.
2. Agrega el JavaFX SDK desde `File > Project Structure > Libraries`.
3. Ve a "Run > Edit Configurations" y en VM options agrega:

```
--module-path "ruta/a/javafx/lib" --add-modules javafx.controls,javafx.fxml
```

Reemplaza `"ruta/a/javafx/lib"` con la ruta local en tu equipo donde descargaste JavaFX.

## Paso 3: Ejecutar el proyecto

Cuando ejecutes la aplicación, verás una ventana con el mensaje:  
**"¡Hola, JavaFX!"**

Este es el programa más básico para comenzar a trabajar con interfaces gráficas en Java usando JavaFX.

## Bibliografía

- [Documentación oficial de JavaFX](https://openjfx.io/openjfx-docs/)
- [Configuración paso a paso](https://openjfx.io/openjfx-docs/#IDE-Intellij)
