package iterator;

/**
 * @author Sahil Agarwal
 * TaskList is a class that represents a list of tickets. It provides methods to add, remove, and iterate over the tickets.
 */
public class TaskList {
    private Ticket[] tickets;
    private int count;
    private String name;
/**
 * Creates a task list with a name.
 * @param name the name of the task list
 */
    public TaskList(String name) {
        this.name = name;
        this.tickets = new Ticket[10];
        this.count = 0;
    }
/**
 * Adds a ticket to the task list
 * @param name the name of the ticket
 * @param teamMember the team member assigned to the ticket
 * @param difficulty the difficulty level of the ticket
 * no return
 */
    public void addTicket(String name, String teamMember, Difficulty difficulty) {
        addTicket(new Ticket(name, teamMember, difficulty));
    }
    /**
     * Adds a ticket to the task list.
     * @param ticket the ticket to add
     * no return
     */
    public void addTicket(Ticket ticket) {
        // if the array is full, make a bigger one and copy everything over
        if (count == tickets.length) {
            Ticket[] bigger = new Ticket[tickets.length * 2];
            for (int i = 0; i < tickets.length; i++) {
                bigger[i] = tickets[i];
            }
            tickets = bigger;
        }
        tickets[count] = ticket;
        count++;
    }
/**
 * Removes a ticket from the task list by name.
 * @param name the name of the ticket to remove
 * @return the removed ticket, or null if not found
 */
    public Ticket getTicket(String name) {
        for (int i = 0; i < count; i++) {
            if (tickets[i].getName().equalsIgnoreCase(name)) {
                Ticket found = tickets[i];
                // shift everything after it left by one to fill the gap
                for (int j = i; j < count - 1; j++) {
                    tickets[j] = tickets[j + 1];
                }
                tickets[count - 1] = null;
                count--;
                return found;
            }
        }
        return null;
    }
/**
 * Creates an iterator for the task list.
 * @return a TaskListIterator for the task list
 */
    public TaskListIterator createIterator() {
        return new TaskListIterator(tickets);
    }
/**
 * Returns the string for the tasklist board
 * @return the string representation of the task list
 */
    public String toString() {
        String result = name + ":\n";
        TaskListIterator iterator = createIterator();
        while (iterator.hasNext()) {
            result += "- " + iterator.next() + "\n";
        }
        return result;
    }
}