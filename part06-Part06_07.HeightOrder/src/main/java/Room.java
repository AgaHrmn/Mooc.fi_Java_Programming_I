import java.util.ArrayList;

public class Room {
    ArrayList<Person> people;
    
    public Room() {
        people = new ArrayList<>();
    }
    
    public void add(Person person) {
        people.add(person);
    }
    
    public boolean isEmpty() {
        if (people.isEmpty()) {
            return true;
        }
        return false;
    }
    
    public ArrayList<Person> getPersons() {
        return people;
    }
    
    public Person shortest() {
        if (people.isEmpty()) {
            return null;
        }
        
        Person shortest = people.get(0);
        for (Person p : people) {
            if (p.getHeight() < shortest.getHeight()) {
                shortest = p;
                
            }
        }
        return shortest;
    }
    
    public Person take() {
        if (people.isEmpty()) {
            return null;
        }
        
        Person taken = this.shortest();
        people.remove(taken);
        return taken;
    }
}
