
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        while (!(text.equals(""))) {
            String[] lines = text.split(" ");

            System.out.println(lines[0]);

            text = scanner.nextLine();
        }

    }
}
