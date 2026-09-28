package iterator;
/**
    @author Sahil Agarwal
    Ticket is a class that represents an individual ticket within th task list. It has a name, a team member assigned to it, and a difficulty level.
 */
public class Ticket {
    private String name;
    private String teamMember;
    private Difficulty difficulty;
 /**
     * Creates a ticket with a name, assigned team member, and difficulty.
     *
     * @param name the name or description of the ticket
     * @param teamMember the team member assigned to the ticket
     * @param difficulty the difficulty level of the ticket
     */
    public Ticket(String name, String teamMember, Difficulty difficulty) {
        this.name = name;
        this.teamMember = teamMember;
        this.difficulty = difficulty;
    }
 /**
     * Gets the name of this ticket.
     *
     * @return the ticket's name
    */

    public String getName(){
        return name;
    }
/**
     * Returns a string representation of the ticket.
     *
     * @return the string representation
    */
    public String toString(){
        return this.difficulty.ASCII + this.name + "(Difficulty: " + this.difficulty + ") - " + this.teamMember + "\u001B[0m";
    }
}
