
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        GradeRegister gr = new GradeRegister();
        Scanner scan = new Scanner(System.in);
        UserInterface ui = new UserInterface(gr, scan);
        
        ui.start();
    }
}
