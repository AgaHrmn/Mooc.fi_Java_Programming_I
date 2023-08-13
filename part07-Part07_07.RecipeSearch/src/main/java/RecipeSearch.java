import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RecipesDB dataBase = new RecipesDB("recipes.txt");

        
        //testing code:         
//        dataBase.showLines();
        dataBase.createDB();
        dataBase.showRecipes();
        
        
    }
}
