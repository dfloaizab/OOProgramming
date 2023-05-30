package USC.ClinicaVet.UI;

import java.util.ArrayList;

import javax.swing.JFrame;
import USC.ClinicaVet.Model.*;

public class VentanaPpal extends JFrame {
	
	PanelDatos miPanelDatos;
	ClinicaVet miClinica;
	ArrayList<String> especialistas;
	
	public VentanaPpal()
	{
		miClinica = new ClinicaVet("888","Clínica Pinky y Cerebro");
		miClinica.cargarDatos("./data/especialistas.csv");
		
		especialistas = miClinica.getStrEspecialistas();
		
		this.setSize(800, 600);
		this.setTitle("Clinica Vet - Reserva de Citas");
		
		miPanelDatos = new PanelDatos(especialistas);	
		this.add(miPanelDatos);
	}
	
	
	public static void main(String args[])
	{
		VentanaPpal miVentana = new VentanaPpal();
		miVentana.setVisible(true);
	}
	

}
