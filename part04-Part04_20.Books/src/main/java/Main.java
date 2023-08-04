
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> books = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        while (true) {
            //System.out.println("Title: ");
            String title = s.nextLine();

            if (title.isEmpty()) {
                break;
            }

            //System.out.println("Pages: ");
            int pages = Integer.valueOf(s.nextLine());

            //System.out.println("Publication year: ");
            int year = Integer.valueOf(s.nextLine());

            books.add(new Book(title, pages, year));
        }

        //System.out.println("What information will be printed?");
        String ans = s.nextLine();

        if (ans.equals("everything")) {
            for (Book b : books) {
                System.out.println(b);
            }
        }

        if (ans.equals("name")) {
            for (Book b : books) {
                System.out.println(b.getName());
            }
        }
    }
}
