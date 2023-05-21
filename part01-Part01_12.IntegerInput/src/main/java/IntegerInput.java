
import java.util.Scanner;

public class IntegerInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        String value = scanner.nextLine();
        int number = Integer.valueOf(value);
        System.out.println("You gave the number " + number);

    }
}
