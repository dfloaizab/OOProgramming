import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

/**
 * Esta clase corresponde a la vista (UI)
 * @author ASUS
 *
 */
public class MainWindow extends JFrame implements ActionListener{
	
	
	//Lista de elementos en Java
	JList<String> JListGames;
	JButton botonCargar;
	MainModel myModel = new MainModel();
	ArrayList<String> gamesList = new ArrayList<>();	
	
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
		
		setLayout(new GridLayout(2,1));		
		
		System.out.print(gamesList.toString());
		
		
		botonCargar = new JButton("Cargar lista");
		//vamos a adicionar al botón una función listener que responde por 
		//los eventos del usuario:
		botonCargar.addActionListener(this);
		JListGames = new JList(gamesList.toArray());
		
		add(JListGames);
		
		add(botonCargar);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		// TODO Auto-generated method stub
		myModel.loadData("./data/GamesList.dat");
		gamesList = myModel.queryAllGames();
		JListGames = new JList(gamesList.toArray());
		//this.remove(0);
		add(JListGames,0);
		
		
	}	

}
