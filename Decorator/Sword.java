package decorator;

/**
 * Sword
 */
public class Sword extends GearAdder {
    // Constructor to initialize the Sword with a player and gear.
    public Sword(Player player) {
        super(player, FileReader.getLines("decorator/txt/sword.txt"));
    }
}
