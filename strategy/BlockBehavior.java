package strategy;
 
public class BlockBehavior implements Behavior {
 
	private static final String RED   = "\033[31m";
	private static final String RESET = "\033[0m";
 
	@Override
	public String play() {
		return "Blocks his opponent!!!\n"
			+ "            o        o\n"
			+ RED + "          /-|-     -|-\\\n" + RESET
			+ "   .      _// \\     _/ / \\\n";
	}
}
