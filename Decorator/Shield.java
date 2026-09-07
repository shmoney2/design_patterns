package decorator;

public class Shield extends GearAdder {
    /**
     * @param player
     */
    // creation of the Shield class that extends GearAdder class
    public Shield(Player player) {
        super(player, FileReader.getLines("decorator/txt/shield.txt"));
    }
}
