
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            for (int c = 1; c <= num; c++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

}
