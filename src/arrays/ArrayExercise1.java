package arrays;

/**
 * write a program that finds the maximum
 * and the minimum value of an integer array
 */
public class ArrayExercise1 {
    public static void findMinMax(int[] array) {
        if (array.length == 0) {
            System.out.println("The array is empty.");
            return;
        }

        int min = array[0];
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}
