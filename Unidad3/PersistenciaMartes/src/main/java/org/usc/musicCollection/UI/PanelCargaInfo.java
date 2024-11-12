package org.usc.musicCollection.UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PanelCargaInfo extends JPanel implements ActionListener {

    JButton botonCargaArchivo;
    JButton botonGuardarArchivo;

    public PanelCargaInfo(){
        botonCargaArchivo = new JButton("Carga Archivo");
        botonCargaArchivo.addActionListener(this);
        botonCargaArchivo.setActionCommand("CARGAR");

        botonGuardarArchivo = new JButton("Guardar Archivo");
        botonGuardarArchivo.addActionListener(this);
        botonGuardarArchivo.setActionCommand("GUARDAR");

        this.setLayout(new GridLayout(2,1));

        this.add(botonCargaArchivo);
        this.add(botonGuardarArchivo);
    }

    public void guardarInfo(String ruta)
    {

        String[] arreglo_lineas = new String[]{"Algoritmos","Y","Programación 2","2024B","Universidad Santiago de Cali"};
        Scanner lectorConsola = new Scanner(System.in);
        try {
            BufferedWriter escritor = new BufferedWriter(new FileWriter(ruta));
            //iterador sobre un arreglo:
            //1. l es cada elemento
            //2. arreglo_lineas es el arreglo
            for(String l:arreglo_lineas)
            {
                escritor.write(l);
                //salto de línea:
                escritor.newLine();
            }
            escritor.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    /**
     * este método responde por los eventos de todos los elementos del
     * panel
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        String accion = e.getActionCommand();
        switch(accion)
        {
            case "CARGAR":
                break;
            case "GUARDAR":
                guardarInfo("src/main/resources/nuevoArchivo.txt");
        }

    }
}
