package decorator;

import java.util.ArrayList;

// This class represents a player in the game. 
public class Player {
    protected String name;
    protected ArrayList<String> character;
// Constructor to initialize the player with a character and name.
    public Player(ArrayList<String> character, String name) {
        this.character = character;
        this.name = name;
}
public String getName() {
        return name;
    }
// Method to get the character representation of the player.
    @Override
    // Method to get the string representation of the player
    public String toString() {
        //String to Strong concatenation
        StringBuilder sb = new StringBuilder();
        sb.append("##### ").append(name).append(" #####\n");
        for (String line : character) {
            sb.append(line).append("\n");
        }
        return sb.toString();
    }
}