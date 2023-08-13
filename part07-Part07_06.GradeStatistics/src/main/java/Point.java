
import java.util.ArrayList;

public class Point {

    private ArrayList<Integer> points;
    private ArrayList<Integer> passingPoints;
    private ArrayList<Integer> grades;

    public Point() {
        this.points = new ArrayList<>();
        this.passingPoints = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    public void add(int value) {
        if (value >= 0 && value <= 100) {
            points.add(value);
            this.grades.add(pointsToGrade(value));

            if (value >= 50) {
                passingPoints.add(value);
            }
        }
    }
    
    public static int pointsToGrade(int score) {

        int grade = 0;
        if (score < 50) {
            grade = 0;
        } else if (score < 60) {
            grade = 1;
        } else if (score < 70) {
            grade = 2;
        } else if (score < 80) {
            grade = 3;
        } else if (score < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }

    public double avg(ArrayList<Integer> points) {
        int sum = 0;
        if (!points.isEmpty()) {
            for (int p : points) {
                sum += p;
            }
            return 1.0 * sum / points.size();
        }
        return -1;
    }

    public ArrayList<Integer> getAllPoints() {
        return this.points;
    }
    
    public ArrayList<Integer> getAllGrades() {
        return this.grades;
    }

    public ArrayList<Integer> getPassingPoints() {
        return this.passingPoints;
    }

    public double getPassProcentage() {
        return 100.0 * this.getPassingPoints().size() / this.getAllPoints().size();
    }
}
