package UI;

//elementos de UI
import javax.swing.*;
import java.awt.*;
//manejo de eventos
import java.awt.event.*;
//manejo de archivos:
import java.io.*;

import Model.RegistroNotasApp;

/**
 * JFrame es una clase abstracta para modelar contenedores de UI de primer nivel:
 */
public class VentanaRegistro extends JFrame {

    //Elementos de UI que vamos a agregar a la ventana:
    private JTextField txtNombre, txtNota;
    private JComboBox<String> cbCurso;
    private JTextArea areaDatos;
    private JButton btnCargar, btnGuardar;

    /**
     * EL método constructor establece las características visuales de la ventana, agrega los elementos
     * de UI y la muestra:
     */
    public VentanaRegistro()
    {
        //Características de la ventana:
        setTitle("Ventana de registro de notas");
        setSize(600,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        //contenedora de 2o nivel:
        //(va dentro del JFrame)
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2, 5, 5));
    }

    public static void main(String args[])
    {
        VentanaRegistro miVentana = new VentanaRegistro();
        miVentana.setVisible(true);
    }


}
