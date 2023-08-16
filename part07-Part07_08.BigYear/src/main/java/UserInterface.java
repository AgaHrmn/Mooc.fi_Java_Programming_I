
import java.util.Scanner;

public class UserInterface {

    private BirdsDB data;
    private Scanner scan;
    private boolean flag;

    public UserInterface(BirdsDB data, Scanner scan) {
        this.data = data;
        this.scan = scan;
        this.flag = true;
    }

    public void start() {
        while (flag) {
            String command = readCommand();

            switch (command) {
                case "Add":
                    newBird();
                    break;
                case "Observation":
                    newObservation();
                    break;
                case "All":
                    showBirds();
                    break;
                case "One":
                    System.out.println("Bird?");
                    String name = scan.nextLine();
                    showBirds(name);
                    break;
                case "Quit":
                    flag = false;
                    break;
            }
        }

    }

    public String readCommand() {
        System.out.println("?");
        return scan.nextLine();
    }

    public void newBird() {
        System.out.println("Name:");
        String name = scan.nextLine();
        System.out.println("Name in Latin:");
        String latinName = scan.nextLine();

        data.addBird(name, latinName);
    }

    public void newObservation() {
        System.out.println("Bird?");
        String name = scan.nextLine();

        if (!data.getBirds().contains(name)) {
            System.out.println("Not a bird!");
        }

        for (Bird b : data.getBirds()) {
            if (b.getName().equals(name)) {
                b.addObservation();
            } else {
                System.out.println("Not a bird!");
            }
        }
    }

    public void showBirds() {
        for (Bird b : data.getBirds()) {
            System.out.println(b);
        }
    }

    public void showBirds(String name) {
        for (Bird b : data.getBirds()) {
            if (b.getName().equals(name)) {
                System.out.println(b);
            }
        }
    }
}
