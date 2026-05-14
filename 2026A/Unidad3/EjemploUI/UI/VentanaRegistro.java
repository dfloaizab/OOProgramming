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

        //Agregar elementos de UI al Panel:
        panel.add(new JLabel("Nombre:"));
        txtNombre = new JTextField();
        panel.add(txtNombre);

        panel.add(new JLabel("Curso:"));
        cbCurso = new JComboBox<>(new String[]{"Programación", "Bases de Datos", "Redes"});
        panel.add(cbCurso);

        panel.add(new JLabel("Nota:"));
        txtNota = new JTextField();
        panel.add(txtNota);

        btnGuardar = new JButton("Guardar");
        btnCargar = new JButton("Cargar");
        panel.add(btnGuardar);
        panel.add(btnCargar);

        //Adicional el panel a la ventana principal:
        add(panel, BorderLayout.NORTH);

        areaDatos = new JTextArea();
        add(new JScrollPane(areaDatos), BorderLayout.CENTER);

        //Crear una función de gestión de eventos para el botón guardar:
        btnGuardar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                guardarArchivo();
            }
        });

         //Crear una función de gestión de eventos para el botón cargar:
        btnCargar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cargarArchivo();
            }
        });
    }

    private void guardarArchivo() {
        try {
            String nombre = txtNombre.getText();
            String curso = cbCurso.getSelectedItem().toString();
            double nota = Double.parseDouble(txtNota.getText());

            BufferedWriter bw = new BufferedWriter(new FileWriter("datos.txt", true));
            RegistroNotasApp registro = new RegistroNotasApp(nombre, curso, nota);
            bw.write(registro.toCSV());
            bw.newLine();
            bw.close();

            JOptionPane.showMessageDialog(this, "Datos guardados correctamente.");

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "La nota debe ser numérica.");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error al escribir archivo.");
        }
    }

    private void cargarArchivo() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("datos.txt"));
            String linea;
            areaDatos.setText("");

            while ((linea = br.readLine()) != null) {
                areaDatos.append(linea + "\n");
            }

            br.close();

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Archivo no encontrado.");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error al leer archivo.");
        }
    }

    public static void main(String args[])
    {
        VentanaRegistro miVentana = new VentanaRegistro();
        miVentana.setVisible(true);
    }


}
