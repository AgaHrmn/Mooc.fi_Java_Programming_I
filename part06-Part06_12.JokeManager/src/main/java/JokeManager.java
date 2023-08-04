
import java.util.ArrayList;
import java.util.Random;

public class JokeManager {

    private ArrayList<String> jokes;
    

    public JokeManager() {
        this.jokes = new ArrayList<>();
    }

    public void addJoke(String joke) {
        this.jokes.add(joke);
    }

    public String drawJoke() {
        try {
            Random r = new Random();
            int num = r.nextInt(this.jokes.size());
            return jokes.get(num);
        } catch (Exception e) {
            return "Jokes are in short supply.";
        }
    }

    public void printJokes() {
        for (String j : this.jokes) {
            System.out.println(j);
        }
    }

}
