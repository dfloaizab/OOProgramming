package model;

public class Player {

    private boolean starter;
    private String name, country;
    private int playerNumber;

    public Player(String country, String name, int playerNumber) {
        this.country = country;
        this.name = name;
        this.playerNumber = playerNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    enum position
    {
        Goalkeeper,
        Defender,
        Middlefield,
        Striker
    }

    

    
    
}
