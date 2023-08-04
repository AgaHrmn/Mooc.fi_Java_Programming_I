
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<>();
        String name;
        String identifier;
        
        while (true) {
            System.out.println("Identifier? (empty will stop)");
            identifier = scanner.nextLine();
            if (identifier.isEmpty()) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            
            Item ob = new Item(identifier, name);
            
            if (!items.contains(ob)) {
                items.add(ob);
            }
        }
        
        //System.out.println("==Items==");
        for (Item i : items) {
            System.out.println(i);
        }
    }
}
