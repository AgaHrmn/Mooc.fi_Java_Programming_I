
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class UserInterface {

    private RecipesDB recipeDB;
    private Scanner scan;
    private boolean flag;
    private String file;

    public UserInterface(String file, Scanner scan) {
        this.scan = scan;
        this.file = file;
        this.flag = true;
        this.recipeDB = new RecipesDB(file);
    }

    public void start() {
        this.listCommands();
        this.performCommand();
    }

//    public String filePath() {
//        System.out.print("File to read: ");
//        String file = scan.nextLine();
//
//        return file;
//    }
    public void listCommands() {
        System.out.println("");
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
    }

    public String readCommand() {
        System.out.println("\nEnter command: ");
        String command = scan.nextLine();

        return command;
    }

    public void performCommand() {
        while (flag) {
            String command = readCommand();
            switch (command) {
                case "list":
                    System.out.println("\nRecipes:");
                    this.showRecipes();
                    break;
                case "stop":
                    flag = false;
                    break;
                case "find name":
                    System.out.println(this.findName());;
                    break;

            }
        }
    }

    public String findName() {
        System.out.println("Searched word: ");
        String name = scan.nextLine();

        for (Recipe r : recipeDB.getRecipes()){
            if (r.getName().contains(name)) {
                return r.toString(); 
            }
        }
        return "Could not find recipe.";
    }

    public void showRecipes() {
        for (Recipe r : recipeDB.getRecipes()) {
            System.out.println(r);
//            r.showIngredients();
        }
    }
}
