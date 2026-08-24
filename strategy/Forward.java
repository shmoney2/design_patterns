package strategy;

public class Forward extends Player { String firstName, lastName; Behavior behavior; PlayerType playerType; Random rand;

    public Forward(String firstName, String lastName, Behavior behavior, PlayerType playerType) {
        super(firstName, lastName, behavior, playerType);
    }

    @Override
    public void setBehavior() {
        if (rand.nextInt(2) == 0) {
            behavior = new ShootBehavior();
        } else {
            behavior = new PassBehavior();
        }
    }
} {
    
}
