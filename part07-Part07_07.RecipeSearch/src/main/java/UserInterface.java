
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

    public void listCommands() {
        System.out.println("");
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
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
                    this.showRecipes();
                    break;
                case "find name":
                    this.findName();
                    break;
                case "find cooking time":
                    this.findTime();
                    break;
                case "find ingredient": {
                    this.findIngredient();
                    break;
                }
                case "stop":
                    flag = false;
                    break;

            }
        }
    }

    public void findName() {
        System.out.println("Searched word: ");
        String name = scan.nextLine();

        System.out.println("\nRecipes:");
        for (Recipe r : recipeDB.getRecipes()) {
            if (r.getName().contains(name)) {
                System.out.println(r);
            }
        }
    }

    public void findTime() {
        System.out.println("Max cooking time: ");
        int time = Integer.valueOf(scan.nextLine());
        System.out.println("\nRecipes:");
        for (Recipe r : recipeDB.getRecipes()) {
            if (Integer.valueOf(r.getTime()) <= time) {
                System.out.println(r);
            }
        }
    }

    public void findIngredient() {
        System.out.println("Ingredient: ");
        String search = scan.nextLine();

        System.out.println("\nRecipes:");
        for (Recipe r : recipeDB.getRecipes()) {
            if (r.getIngredients().contains(search)) {
                System.out.println(r);
            }
        }
    }

    public void showRecipes() {
        System.out.println("\nRecipes:");
        for (Recipe r : recipeDB.getRecipes()) {
            System.out.println(r);
        }
    }
}
