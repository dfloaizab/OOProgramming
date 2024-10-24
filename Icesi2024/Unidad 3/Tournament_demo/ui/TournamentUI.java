package ui;

import model.TournamentController;

public class TournamentUI {

    TournamentController myTournamentController;

    public static void main(String[] args)
    {
        TournamentUI myTournamentApp = new TournamentUI();
        myTournamentApp.menu();
    }

    
    public TournamentUI() {
        myTournamentController = new TournamentController();
    }

    //Manejo de las opciones de usuario
    public void menu()
    {

    }

    public void addTeam(String name, String country)
    {
        myTournamentController.addTeam(name, country);
    }
    
}
