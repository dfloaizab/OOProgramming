package biblioteca.UI;

import java.awt.*;
import javax.swing.*;

public class VentanaMain extends JFrame {

    public VentanaMain()
    {
           // Configuración básica de la ventana
        setTitle("Gestion de coleccion de musica");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JButton btnAgregarArtista = new JButton("Agregar Artista");
        JButton btnAgregarCancion = new JButton("Agregar Cancion");
        JButton btnAConsultar = new JButton("Consultar");

        add(btnAgregarArtista, BorderLayout.NORTH);
        add(btnAgregarCancion, BorderLayout.CENTER);
        add(btnAConsultar, BorderLayout.SOUTH);

        btnAgregarArtista.addActionListener(e->{
            VentanaArtista ventanaArtista = new VentanaArtista();
            ventanaArtista.setVisible(true);
        });
    }

    public static void main(String[] args) {
        {
            VentanaMain miVentana = new VentanaMain();
            miVentana.setVisible(true);
        }
    }
    
}
