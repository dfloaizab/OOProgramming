package model;

public class Team {

    String country, name;
    final int NUM_PLAYERS = 20;
    int player_count;

    Player[] players;

    

    public Team(String country, String name) {
        this.country = country;
        this.name = name;
        this.players = new Player[NUM_PLAYERS];
        this.player_count = 0;
    }

    public Team() {
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    public boolean  addPlyer2(String country, String name, int
    playerNumber)
    {
        boolean result = false;
        if(player_count < NUM_PLAYERS)
        {
           players[player_count] = new Player(country, name, playerNumber);
           player_count++;
           result = true;
        }
        

        return result;
    }

    public void addPlayer(String country, String name, int
     playerNumber)
    {
        //Hay una mejor forma de hacerlo_ agregar elemento a la primera posición disponible        
        for(int i = 0; i < players.length;i++)
        {
            if(players[i] == null)
                players[i] = new Player(country,name,playerNumber);
        }
    }

    
}
