
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;
        String name = null;
        String text = scanner.nextLine();

        while (!(text.equals(""))) {
            String[] lines = text.split(",");
            if (oldest < Integer.valueOf(lines[1])){
                oldest = Integer.valueOf(lines[1]);
                name = lines[0];
            }
            text = scanner.nextLine();
        }
        System.out.println("Name of the oldest: " + name);

    }
}
