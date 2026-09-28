package iterator;

public class Ticket {
    private String name;
    private String teamMember;
    private Difficulty difficulty;

    public Ticket(String name, String teamMember, Difficulty difficulty) {
        this.name = name;
        this.teamMember = teamMember;
        this.difficulty = difficulty;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return this.difficulty.ASCII + this.name + "(Difficulty: " + this.difficulty + ") - " + this.teamMember + "\u001B[0m";
    }
}
