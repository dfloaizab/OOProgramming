# Mini Tutorial de JavaFX

## Requisitos Previos

- JDK 17 o superior
- JavaFX SDK (descargar desde [gluonhq.com](https://gluonhq.com/products/javafx/))
- IDE recomendado: IntelliJ IDEA o Eclipse con soporte JavaFX

## Estructura Básica de una Aplicación JavaFX

```java
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("Hola JavaFX");
        StackPane root = new StackPane(label);
        Scene scene = new Scene(root, 300, 200);
        primaryStage.setTitle("Ejemplo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
