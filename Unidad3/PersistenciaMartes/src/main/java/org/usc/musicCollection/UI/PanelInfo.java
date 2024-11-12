package org.usc.musicCollection.UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelInfo extends JPanel implements ActionListener {

    MainWindow miVentanaMadre;
    JTextArea txtLista;
    JTextField txtElemento;
    JButton btnCambiar;

    public PanelInfo(MainWindow ventanaMadre)
    {
        this.miVentanaMadre = ventanaMadre;
        txtLista = new JTextArea();
        txtElemento = new JTextField();

        btnCambiar = new JButton("Cambiar");

        //definir diagramación antes de agregar los elementos:
        this.setLayout(new GridLayout(3,1));
        this.add(txtLista);
        this.add(txtElemento);
        this.add(btnCambiar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
