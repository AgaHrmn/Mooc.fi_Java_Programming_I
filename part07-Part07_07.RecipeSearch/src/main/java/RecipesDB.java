
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class RecipesDB {

    private ArrayList<Recipe> recipesDB;
    private ArrayList<String> lines;
    private Scanner scan;

    public RecipesDB(String file) {
        this.recipesDB = new ArrayList<>();
        this.lines = new ArrayList<>();
        try {
            this.scan = new Scanner(Paths.get(file));
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        this.createDB();
    }

    public int findNextIndex(int beginingIndex) {
        for (int i = beginingIndex; i < lines.size(); i++) {
            if (lines.get(i).isEmpty()) {
                return i + 1;
            }
        }
        return -1;
    }

    public void addIngredients(int index, Recipe r) {
        int bound = findNextIndex(index + 1);
        int a = index + 2;
        do {
            if (bound < 0) {
                bound = lines.size();
                continue;
            }
            if (!lines.get(a).isEmpty()) {
                r.addIngredient(lines.get(a));
            }
            a++;
        } while (a < bound);
    }

    public void createDB() {
        int index = 0;
        String name = "";
        String cookingTime = "";
        
        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            lines.add(line);
        }

        for (int i = 0; i < lines.size(); i++) {
            while (true) {
                if (index > lines.size() || index < 0) {
                    break;
                }

                name = lines.get(index);
                cookingTime = lines.get(index + 1);
                Recipe r = new Recipe(name, cookingTime);
                this.addIngredients(index, r);

                recipesDB.add(r);
                index = findNextIndex(index + 1);
            }
        }
    }
    
    public ArrayList<Recipe> getRecipes() {
        return recipesDB;
    }
}
