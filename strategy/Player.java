package strategy;

import java.util.Random;

public abstract class Player {
    private String firstName;
    private String lastName;
    protected Behavior behavior;
    protected Random rand;
    protected PlayerType playerType;

    public Player(String firstName, String lastName, PlayerType playerType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.playerType = playerType;
        this.rand = new Random();
    }

    public abstract void setBehavior();

    public String play() {
        setBehavior();
        return firstName + " " + lastName + " " + behavior.play();
    }

    public PlayerType getPlayerType() {
        return playerType;
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

    @Override
    public String toString() {
        return firstName + " " + lastName + " (" + playerType.label + ")";
    }
}