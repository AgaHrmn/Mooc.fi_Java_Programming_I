
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(-1);
        list.add(1);
        list.add(3);
        
        sum(list);
    }
    
    public static int sum(ArrayList<Integer> numbers) {
        int sum = 0;
        
        for (int n : numbers) {
            sum += n;
        }
        return sum;
    }

}
