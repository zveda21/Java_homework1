package org.example;

/**
 * @author Zveda.Hayrapetyan on 10/09/24.
 * @project Homework1
 * Write a program that takes as an input a positive integer
 * and counts the number of digits the number has.
 */
public class Exercise5 {
    public static String calculateNumberOfDigit(int number) {
        int count = 0;
        if (number < 0) {
            return "The number should be positive";
        }
        if (number == 0) {
            return "The count = 0";
        } else {
            while (number > 0) {
                number /= 10;
                count++;
            }
            return "The count = " + count;
        }
    }
}
