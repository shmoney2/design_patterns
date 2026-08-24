package strategy;

public class Goalie extends Player {
    public Goalie(String firstName, String lastName, Behavior behavior, PlayerType playerType) {
        super(firstName, lastName, behavior, playerType);
    }

    @Override
public void setBehavior() {
		if (rand.nextInt(2) == 0) {
            behavior = new BlockGoalBehavior();
		} else {
			behavior = new PassBehavior();
		}
	}
}