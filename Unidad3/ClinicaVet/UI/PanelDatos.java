package USC.ClinicaVet.UI;

import java.awt.GridLayout;

import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelDatos extends JPanel {
	
	JLabel lblMedicos, lblFecha, lblNomMascota;
	JTextField txtFecha, txtNomMascota;
	JComboBox<String> cmbMedicos;
	
	public PanelDatos()
	{		
		//crear elementos de UI
		lblMedicos = new JLabel("Medicos");
		lblFecha = new JLabel("Fecha");
		lblNomMascota = new JLabel("Nombre Mascota");
		txtFecha = new JTextField();
		txtNomMascota = new JTextField();
		cmbMedicos = new JComboBox<String>();
		
		//establecer diagramación del panel:
		this.setLayout(new GridLayout(3,2));
		
		this.add(lblMedicos);
		this.add(cmbMedicos);
		this.add(lblFecha);
		this.add(txtFecha);
		this.add(lblNomMascota);
		this.add(txtNomMascota);			
	}
	
	

}
