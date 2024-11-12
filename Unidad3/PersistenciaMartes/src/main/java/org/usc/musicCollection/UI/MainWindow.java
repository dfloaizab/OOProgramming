package org.usc.musicCollection.UI;

import java.awt.*;

public class MainWindow  extends javax.swing.JFrame   {

    PanelCargaInfo cargarArchivo;
    PanelInfo panelInfo;

    public MainWindow() {
        //En el método constructor se establecen las propiedades
        //visuales de la ventana:
        this.setSize(800, 600);
        this.setTitle("Music Collection");

        //diagramación o layout de la ventana principal:
        this.setLayout(new GridLayout(1,2));


        this.add(new PanelCargaInfo());
        this.add(new PanelInfo(this));

    }
}
