package strategy;

import java.util.ArrayList;

public class Team {
    private String teamName;
	private ArrayList<Player> players;

public Team(String teamName) {
		this.teamName = teamName;
		this.players = new ArrayList<Player>();
	}

public void addTeamMember(String firstName, String lastName, PlayerType playerType) {
		if (playerType == PlayerType.GOALIE) {
			players.add(new Goalie(firstName, lastName));
		} else if (playerType == PlayerType.FORWARD) {
			players.add(new Forward(firstName, lastName));
		} else {
			players.add(new Defenceman(firstName, lastName));
		}
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