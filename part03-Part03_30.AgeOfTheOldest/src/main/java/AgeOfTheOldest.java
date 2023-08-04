
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        String text = scanner.nextLine();

        while (!(text.equals(""))) {
            String[] lines = text.split(",");
            if (oldest < Integer.valueOf(lines[1])){
                oldest = Integer.valueOf(lines[1]);
            }
            text = scanner.nextLine();
        }
        System.out.println("Age of the oldest: " + oldest);
    }
}
