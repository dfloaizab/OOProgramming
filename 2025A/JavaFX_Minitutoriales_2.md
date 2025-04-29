
---

### 📄 `tutorial_javafx_ui_simple.md` – *Mini tutorial 2: Interfaz con campos y botón*

```markdown
# Tutorial JavaFX: UI Sencilla con Campos y Botón

Este tutorial le enseña a construir una pequeña interfaz donde el usuario puede ingresar su nombre y recibir un saludo.

---

## ✅ Objetivo
- Crear una ventana con:
  - Un `TextField` para ingresar nombre
  - Un `Button` para saludar
  - Un `Label` para mostrar el saludo

---

## Paso 1: Código de la clase principañ

```java
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SaludoApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        Label mensaje = new Label("Escribe tu nombre:");
        TextField campoNombre = new TextField();
        Button botonSaludar = new Button("Saludar");
        Label resultado = new Label();

        botonSaludar.setOnAction(e -> {
            String nombre = campoNombre.getText();
            resultado.setText("Hola, " + nombre + "!");
        });

        VBox root = new VBox(10, mensaje, campoNombre, botonSaludar, resultado);
        root.setStyle("-fx-padding: 20px; -fx-alignment: center;");

        Scene scene = new Scene(root, 300, 200);
        primaryStage.setTitle("Saludo Personalizado");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
