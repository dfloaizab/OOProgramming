package USC.ClinicaVet.UI;

import java.awt.Color;

import javax.swing.JFrame;

public class VentanaPpal extends JFrame {
	
	PanelDatos miPanelDatos;
	
	public VentanaPpal()
	{
		this.setSize(800, 600);
		this.setTitle("Mi primer JFrame");
		this.setBackground(Color.BLACK);
		miPanelDatos = new PanelDatos();
		this.add(miPanelDatos);
	}	
	
	public static void main(String[] args)
	{
		VentanaPpal miAplicacion = new VentanaPpal();
		miAplicacion.setVisible(true);		
	}	

}
