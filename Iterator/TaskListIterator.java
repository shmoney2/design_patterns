package iterator;

import java.util.Iterator;

public class TaskListIterator implements Iterator<Ticket> {
    private Ticket[] tickets;
    private int position;

    public TaskListIterator(Ticket[] tickets){
        this.tickets = tickets;
        this.position = 0;
    }
    public boolean hasNext(){
        if (position < tickets.length && tickets[position] != null){
            return true;
        }
        else{
            return false;
        }
    }

    public Ticket next(){
        if (hasNext()){
            return tickets[position++];
        }
        else{
            return null;
        }
    }
}
