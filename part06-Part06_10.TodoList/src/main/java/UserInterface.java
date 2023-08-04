
import java.util.Scanner;

public class UserInterface {

    private Scanner scan;
    private TodoList list;

    public UserInterface(TodoList list, Scanner scan) {
        this.list = list;
        this.scan = scan;
    }

    public void start() {
        System.out.println("Command: ");
        String command = scan.nextLine();

        while (!"stop".equals(command)) {
            switch (command) {
                case "add":
                    System.out.println("To add: ");
                    String task = scan.nextLine();
                    list.add(task);
                    break;
                case "list":
                    list.print();
                    break;
                case "remove":
                    System.out.println("Which one is removed? ");
                    int index = Integer.valueOf(scan.nextLine());
                    list.remove(index);
                    break;
            }
            System.out.println("Command: ");
            command = scan.nextLine();

        }
    }
}
