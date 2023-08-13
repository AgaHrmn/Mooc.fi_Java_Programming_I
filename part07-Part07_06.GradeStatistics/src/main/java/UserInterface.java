import java.util.Scanner;

public class UserInterface {
    private Point p;
    private Scanner s;
    
    public UserInterface(Point p, Scanner s){
        this.p = p;
        this.s = s;
    }
    
    public void start() {
        boolean flag = true;

        System.out.println("Enter point totals, -1 stops:");

        while (flag) {
            int input = Integer.valueOf(s.nextLine());
            if (input == -1) {
                flag = false;
            }
            p.add(input);
        }

        
        System.out.println("Passing: " + p.getPassingPoints());
        System.out.println("All: " + p.getAllPoints());
        System.out.println("Point average (all): " + p.avg(p.getAllPoints()));
        if (p.avg(p.getPassingPoints()) != -1) {
            System.out.println("Point average (passing): " + p.avg(p.getPassingPoints()));
        } else {
            System.out.println("Point average (passing): -");
        }
        System.out.println("Pass percentage: " + p.getPassProcentage());
        System.out.println("Grade distribution:");
        printDistribution();
    }
    
    
    public int countGrades(int limit) {
        int count = 0;

        for (int p : p.getAllPoints()) {
            if (p >= limit) {
                count++;
            }
        }
        return count;
    }

    public void printDistribution() {
        int grade = 5;
        while (grade >= 0) {
            int stars = this.numberOfGrades(grade);
            System.out.print(grade + ": ");
            printStars(stars);
            System.out.println("");

            grade = grade - 1;
        }
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : p.getAllGrades()) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public void printStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }
}
