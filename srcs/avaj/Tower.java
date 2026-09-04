package avaj;
import java.util.LinkedList;

public class Tower {
    private LinkedList<Flyable> observers = new LinkedList<Flyable>();

    public void register(Flyable p_flyable){
        for (Flyable t : observers)
            if (t.getId() == p_flyable.getId())
                return;
        observers.add(p_flyable);
    }

    public void unregister(Flyable p_flyable) {
        for (Flyable t : observers)
            if (t.getId() == p_flyable.getId())
                observers.remove(t);
    }

    public void showAll() {
        for (Flyable t : observers)
            System.out.println("Flyable : " + t.getId());
    }
    protected void conditionsChanged(){

    }
}
