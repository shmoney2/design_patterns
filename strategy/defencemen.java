package strategy;

public Defenceman(String firstName, String lastName) {
		super(firstName, lastName, PlayerType.DEFENCE_MAN);
	}
 
	@Override
	public void setBehavior() {
		if (rand.nextInt(2) == 0) {
			behavior = new BlockBehavior();
		} else {
			behavior = new PassBehavior();
		}
	}
}