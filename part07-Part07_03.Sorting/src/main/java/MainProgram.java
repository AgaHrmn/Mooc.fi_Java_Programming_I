import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
//        System.out.println("Smallest: " + MainProgram.smallest(array));
//        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(array));
//        System.out.println(MainProgram.indexOfSmallestFrom(array, 0));
//        System.out.println(MainProgram.indexOfSmallestFrom(array, 1));
//        System.out.println(MainProgram.indexOfSmallestFrom(array, 2));
//        MainProgram.swap(array, 0, 1);
//        for (int i : array) {
//            System.out.print(i);
//        }

        MainProgram.sort(array);
    }

    public static int smallest(int[] array) {
        int smallest = array[0];

        for (int i : array) {
            if (i < smallest) {
                smallest = i;
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {

        int min = MainProgram.smallest(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] == min) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int smallest = array[startIndex];
        int index = startIndex;

        for (int i = startIndex; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            
            int index = MainProgram.indexOfSmallestFrom(array, i);
            
            MainProgram.swap(array, i, index);
            
        }

    }

}
