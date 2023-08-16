import java.util.ArrayList;
import java.util.Scanner;

public class BirdsDB {
    private ArrayList<Bird> birds;
    private Scanner scan;
    
    public BirdsDB(Scanner scan) {
        this.birds = new ArrayList<>();
        this.scan = scan;
    }
    
    public void addBird(String name, String latinName) {
        Bird b = new Bird(name, latinName);
        birds.add(b);
    }
    
    public ArrayList<Bird> getBirds() {
        return this.birds;
    }
}
