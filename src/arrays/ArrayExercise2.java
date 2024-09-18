package arrays;

/**
 * write a program that removes the given element from an array
 * example
 * initial array - [1][2][3][4]
 * remove 2
 * final array - [1][3][4][]
 */
public class ArrayExercise2 {

    public static int[] removeElement(int[] array, int elementToRemove) {
        int indexToRemove = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elementToRemove) {
                indexToRemove = i;
                break;
            }
        }

        if (indexToRemove == -1) {
            System.out.println("Element not found in the array.");
            return array;
        }

        int[] newArray = new int[array.length];

        for (int i = 0, j = 0; i < array.length; i++) {
            if (i != indexToRemove) {
                newArray[j++] = array[i];
            }
        }
        return newArray;
    }
}
