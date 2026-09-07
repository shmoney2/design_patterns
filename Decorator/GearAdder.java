package decorator;

import java.util.ArrayList;

public abstract class GearAdder extends Player {
// Constructor to initialize the GearAdder with a player and gear.
    public GearAdder(Player player, ArrayList<String> gear) {
        super(new ArrayList<String>(player.character), player.getName());
        addGear(gear);
  
    }
// Method to add gear to the player's character representation.
    protected void addGear(ArrayList<String> gear) {
        for (int i = 0; i < gear.size(); i++) {
            String gearLine = gear.get(i);
// Ensure the character has enough lines to accommodate the gear
            while (character.size() <= i) {
                character.add("");
            }
// Create a StringBuilder for the current line of the character
            StringBuilder base = new StringBuilder(character.get(i));
            while (base.length() < gearLine.length()) {
                base.append(' ');
            }
// Overlay the gear onto the character line
            for (int j = 0; j < gearLine.length(); j++) {
                char c = gearLine.charAt(j);
                if (c != ' ') {
                    base.setCharAt(j, c);
                }
            }
// Update the character line with the new gear
            character.set(i, base.toString());
        }
    }
}