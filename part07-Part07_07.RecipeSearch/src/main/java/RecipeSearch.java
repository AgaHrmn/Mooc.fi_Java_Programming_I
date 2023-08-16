import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("File to read: ");
        String file = scanner.nextLine();

        UserInterface ui = new UserInterface(file, scanner);
        ui.start();

    }
}
