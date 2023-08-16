
import java.util.ArrayList;

public class Recipe {

    private String name;
    private String cookingTime;
    private ArrayList<String> ingredients;

    public Recipe(String name, String cookingTime) {
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredients = new ArrayList<>();
    }

    public void addIngredient(String ingredient) {
        this.ingredients.add(ingredient);
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getTime() {
        return this.cookingTime;
    }

    public void showIngredients() {
        for (int i = 0; i < ingredients.size(); i++) {
            System.out.println(i+1 + ". " + ingredients.get(i));
        }
    }

    public String toString() {
        return this.name + ", cooking time: " + this.cookingTime;
    }
}
