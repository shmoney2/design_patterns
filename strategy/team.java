package strategy;

import java.util.ArrayList;

public class Team {
    private String teamName;
    private ArrayList<Player> players;

    public Team(String teamName) {
        this.teamName = teamName;
        players = new ArrayList<>();
    }

    public void addTeamMember(String firstName, String lastName, PlayerType playerType) {
        Player newPlayer;

        if (playerType == PlayerType.GOALIE) {
            newPlayer = new Goalie(firstName, lastName);
        } else if (playerType == PlayerType.FORWARD) {
            newPlayer = new Forward(firstName, lastName);
        } else {
            newPlayer = new Defenceman(firstName, lastName);
        }

        players.add(newPlayer);
    }

    public void executePlay(PlayerType playerType) {
        for (Player player : players) {
            if (player.getPlayerType() == playerType) {
                System.out.println(player.play());
            }
        }
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public String getName() {
        return teamName;
    }
}