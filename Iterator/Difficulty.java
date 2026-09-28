package iterator;
/**
 * @author: Sahil Agarwal
 * Difficulty is an enum that represents the difficulty of a ticket.
 * It has three values: EASY, MEDIUM, and HARD.
 * Each value has an associated ASCII color code.
 */
public enum Difficulty {
    EASY("\u001B[33m"), MEDIUM("\u001B[32m"), HARD("\u001B[31m");

    public String ASCII;
/*
@returns the ASCII color code associated with the difficulty level.
 */
    private Difficulty(String ascii) {
        this.ASCII = ascii;
    }
}
