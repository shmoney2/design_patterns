package strategy;
 
public class PassBehavior implements Behavior {
 
	private static final String BLUE  = "\033[34m";
	private static final String RESET = "\033[0m";
 
	@Override
	public String play() {
		return "Passes the puck!!!\n"
			+ "   o                    o\n"
			+ BLUE + " -|-\\                 /-|-\n" + RESET
			+ " / \\ \\_        .      _/ / \\\n";
	}
}