
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        String name = null;
        int year;
        int i = 0;
        int sum = 0;
        double avg;
        String longestName = "";
        
        String input = scanner.nextLine();
        while (!(input.equals(""))) {
            String[] lines = input.split(",");
            name = lines[0];
            if (name.length() > longestName.length()) {
                longestName = name;
            }
            year = Integer.valueOf(lines[1]);
            sum += year;
            i++;
            input = scanner.nextLine();
        }
        avg = (double) sum / i;
        

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + avg);
    }
}
