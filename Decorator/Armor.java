package decorator;
/**
 * Armor
 */
// method of adding ARMOR
public class Armor extends GearAdder {
    public Armor(Player player) {
        super(player, FileReader.getLines("decorator/txt/armor.txt"));
    }
}
