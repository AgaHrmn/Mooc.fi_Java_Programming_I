
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Which file should have its contents printed?");
        String ans = s.nextLine();

        try {
            Scanner file = new Scanner(Paths.get(ans));
            while (file.hasNext()) {
                System.out.println(file.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
