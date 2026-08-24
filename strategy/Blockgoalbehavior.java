package strategy;
 
public class BlockGoalBehavior implements Behavior {
 
	private static final String RED   = "\033[31m";
	private static final String RESET = "\033[0m";
 
	@Override
	public String play() {
		return "Blocks the goal!!!\n"
			+ "        o\n"
			+ RED + "      \\ | /\n" + RESET
			+ "       _/ \\_\n";
	}
}