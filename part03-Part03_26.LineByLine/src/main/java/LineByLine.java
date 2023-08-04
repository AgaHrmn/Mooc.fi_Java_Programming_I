
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        while (!(text.equals(""))) {
            String[] lines = text.split(" ");

            for (int i = 0; i < lines.length; i++) {
                System.out.println(lines[i]);
            }
            text = scanner.nextLine();
        }
    }
}
