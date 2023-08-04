
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private JokeManager jm;
    private Scanner scan;

    public UserInterface(JokeManager jm, Scanner scan) {
        this.jm = jm;
        this.scan = scan;
    }

    public void start() {
        showCommands();
        String command = scan.nextLine();

        while (!"X".equals(command)) {
            switch (command) {
                case "1":
                    System.out.println("Write the joke to be added:");
                    String joke = scan.nextLine();
                    jm.addJoke(joke);
                    break;
                case "2":
                    System.out.println("Drawing a joke.");
                    System.out.println(jm.drawJoke());
                    break;
                case "3":
                    System.out.println("Printing the jokes.");
                    jm.printJokes();
                    break;
            }
            showCommands();
            command = scan.nextLine();

        }

    }

    public void showCommands() {
        System.out.println("Commands:");
        System.out.println(" 1 - add a joke");
        System.out.println(" 2 - draw a joke");
        System.out.println(" 3 - list jokes");
        System.out.println(" X - stop");
    }

}
