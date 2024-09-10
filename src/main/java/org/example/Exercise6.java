package org.example;

/**
 * @author Zveda.Hayrapetyan on 10/09/24.
 * @project Homework1
 * Write a program which allows the user to enter as many numbers as they want and
 * at the end program should display the largest and the smallest numbers entered.
 */
public class Exercise6 {
    public static int[] checkTheLargestAndTheSmallestNumbers(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("The array cannot be null or empty.");
        }
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number < smallest) {
                smallest = number;
            }
            if (number > largest) {
                largest = number;
            }
        }

        return new int[]{smallest, largest};
    }
}
