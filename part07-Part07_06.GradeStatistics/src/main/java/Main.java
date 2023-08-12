import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        Point p = new Point();
        UserInterface ui = new UserInterface(p, s);
        
        ui.start();

    }
}
