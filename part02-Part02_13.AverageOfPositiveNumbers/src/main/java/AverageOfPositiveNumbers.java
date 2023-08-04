
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int counter = 0;
        double avg;

        while (true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());

            if (num == 0) {
                break;
            }
            if (num > 0) {
                sum += num;
                counter += 1;
            }
            
        }
        if (counter == 0) {
            System.out.println("Cannot calculate the average");
        }
        avg = 1.0 * sum / counter;
        System.out.println("Average of the numbers: " + avg);
    }
}
