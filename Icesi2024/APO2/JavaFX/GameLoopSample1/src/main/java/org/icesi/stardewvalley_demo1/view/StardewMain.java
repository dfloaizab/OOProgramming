package org.icesi.stardewvalley_demo1.view;
import javafx.application.*;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.*;
import javafx.animation.*;

public class StardewMain extends Application {


    private double spriteX = 100; // Posición inicial del sprite
    private double spriteY = 100; // Posición inicial del sprite
    private double velocityX = 0;
    private double velocityY = 0;
    private Image map;
    private Image spriteSheet;
    private int spriteWidth = 32;  // Ancho del sprite
    private int spriteHeight = 32; // Alto del sprite
    private int spriteIndex = 0;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        // Crear un Canvas donde dibujar el mapa y el sprite
        Canvas canvas = new Canvas(800, 600);  // Tamaño de la ventana
        GraphicsContext gc = canvas.getGraphicsContext2D();

        // Cargar imágenes
        map = new Image("file:map.png");  // Reemplaza con la ruta a tu imagen de mapa
        spriteSheet = new Image("file:spritesheet.png");  // Reemplaza con tu sprite sheet

        // Crear un grupo y escena
        Group root = new Group();
        root.getChildren().add(canvas);
        Scene scene = new Scene(root);

        // Capturar la entrada del teclado
        scene.setOnKeyPressed(event -> getInput(event, true));
        scene.setOnKeyReleased(event -> getInput(event, false));

        stage.setTitle("Stardew Demo");
        stage.setScene(scene);
        stage.show();

        // Game loop
        AnimationTimer gameLoop = new AnimationTimer() {
            @Override
            public void handle(long currentNanoTime) {
                updateModel();
                draw(gc);
            }
        };
        gameLoop.start();
    }

    public void getInput(KeyEvent event, boolean isPressed)
    {
        switch (event.getCode()) {
            case W:
                velocityY = isPressed ? -2 : 0;  // Mover arriba
                break;
            case S:
                velocityY = isPressed ? 2 : 0;   // Mover abajo
                break;
            case A:
                velocityX = isPressed ? -2 : 0;  // Mover izquierda
                break;
            case D:
                velocityX = isPressed ? 2 : 0;   // Mover derecha
                break;
            default:
                break;
        }
    }

    public void updateModel()
    {
        spriteX += velocityX;
        spriteY += velocityY;

        // Actualización de animación
        spriteIndex = (spriteIndex + 1) % 3; // Cambiar frames (suponiendo 3 frames)
    }

    /**
     * Draw all actors on its own thread
     */
    public void draw(GraphicsContext gc)
    {
        // Limpiar pantalla
        gc.clearRect(0, 0, 800, 600);

        // Dibujar el mapa
        gc.drawImage(map, 0, 0);

        // Dibujar el sprite (usamos una parte del sprite sheet)
        gc.drawImage(spriteSheet, spriteIndex * spriteWidth, 0, spriteWidth, spriteHeight, spriteX, spriteY, spriteWidth, spriteHeight);
    }

}
