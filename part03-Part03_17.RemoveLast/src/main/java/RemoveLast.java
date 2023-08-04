
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        
        words.add("Ania");
        words.add("Ola");
        words.add("Kasia");
        
        removeLast(words);
        for (String w : words) {
            System.out.println(w);
        }
    }
    
    public static void removeLast(ArrayList<String> strings) {
        if (strings.size() != 0) {
            strings.remove(strings.size() - 1);
        }
    }

}
