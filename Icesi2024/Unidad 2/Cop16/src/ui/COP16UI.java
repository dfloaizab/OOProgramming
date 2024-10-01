package ui;
import model.COP16Controller;

import java.util.Scanner;

public class COP16UI {

    COP16Controller myCop16Controller;

    public static void main(String[] args)
    {
        COP16UI myCop16Program = new COP16UI();
        myCop16Program.showMenu();

    }

    public COP16UI()
    {
        myCop16Controller = new COP16Controller();
    }

    public void showMenu()
    {

    }

    public void showPlaceWithMostSpecies()
    {
        //se hace impresión por consola:
        String[] places = myCop16Controller.getPlaceWithMostSpecies();
        for(int i=0; i < places.length; i++)
        {
            System.out.print(places[i]);
        }
    }
    
}
