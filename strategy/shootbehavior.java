package strategy;
 
public class ShootBehavior implements Behavior {
 
	private static final String BLUE  = "\033[34m";
	private static final String RESET = "\033[0m";
 
	@Override
	public String play() {
		return "Shoots at the Goal!\n"
			+ "   o                 |\\\n"
			+ BLUE + " -|-\\                | \\\n" + RESET
			+ " / \\ \\_       .      |  \\\n";
	}
}