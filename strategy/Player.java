package strategy;

public class Player {
    private String firstName;
    private String lastName;
    protected Behavior behavior;
    protected Random rand;
    protected PlayerType playerType;

}
public Player(String firstName, String lastName, Behavior behavior, PlayerType playerType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.behavior = behavior;
        this.playerType = playerType;
        this.rand = new Random();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Behavior getBehavior() {
        return behavior;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }
}