
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String name = scanner.nextLine();

        try {
            Scanner reader = new Scanner(Paths.get(name));
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] parts = line.split(",");
                String person = parts[0];
                int age = Integer.valueOf(parts[1]);

                if (age > 1 || age == 0) {
                    System.out.println(person + ", age: " + age + " years ");
                } else {
                    System.out.println(person + ", age: " + age + " year ");
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
