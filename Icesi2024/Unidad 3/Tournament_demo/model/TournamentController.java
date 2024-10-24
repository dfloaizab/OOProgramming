package model;

public class TournamentController
{
    final int NUM_TEAMS = 8, NUM_REFEREES=12;
    private int team_counter,referee_counter;

    Team[] teams;
    Referee[] referees;

    public TournamentController() {
        teams = new Team[NUM_TEAMS];
        team_counter = 0;
        referee_counter=0;
    }


    //FUNCIONES DE CONTROLADORA PARA REQUERIMIENTOS FUNCIONALES
    public boolean addTeam(String name, String country)
    {
        boolean result = false;
        if(team_counter < NUM_TEAMS)
        {
            teams[team_counter] = new Team(country, name);
            team_counter++;
            result = true;
        }
        return result;
    } 

    public boolean addReferee(String id, String name, String country)
    {
        boolean result = false;
        if(referee_counter < NUM_REFEREES)
        {
            referees[referee_counter] = new Referee(country, id, name);
            referee_counter++;
            result = true;
        }
        return result;
    }


    public void addPlayerToTeam(String teamName, String playerCountry, String playerName, int playerNumber)
    {
        //buscar el equipo en el arreglo Teams:
        for(Team t: teams)
        {
            //una vez encontrado, agregar el jugador al equipo
            if(t.getName().equals(teamName))
                t.addPlayer(playerCountry, teamName, playerNumber);
        }

        
    }

    public void preloadInfo()
    {
        addTeam("Isótopos de Springfield", "USA");
        addTeam("River PLate","Argentina");
    }

    public void setRefereeToMatch()
    {

    }

    public void calculateFixture()
    {

    }

    public void setScoreToMatch(int idPartido, int team1Goals, int team2Goals)
    {

    }

}