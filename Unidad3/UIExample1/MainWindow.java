import java.awt.Color;
import java.awt.HeadlessException;

import javax.swing.*;

/**
 * Esta clase corresponde a la vista (UI)
 * @author ASUS
 *
 */
public class MainWindow extends JFrame {
	
	
	public static void main(String args[])
	{
		//Invocamos el método constructor:		
		MainWindow myWindow = new MainWindow();
		//Mostramos la ventana:		
		myWindow.setVisible(true);
	}

	//Método constructor de la ventana.
	public MainWindow() {
		super();
		//Establecemos las propiedades de la ventana:
		setSize(800, 600);
		setBackground(Color.ORANGE);
		setAlwaysOnTop(false);
	}	

}
