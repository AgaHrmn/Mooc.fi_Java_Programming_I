
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("File to read: ");
        String file = scanner.nextLine();

        UserInterface ui = new UserInterface(file, scanner);
        ui.start();

        //testing code:         
//        dataBase.showLines();
//        dataBase.createDB();
//        dataBase.showRecipes();
    }
}
