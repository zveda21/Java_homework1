package org.example;

import java.util.Arrays;

/**
 * @author ${USER} on ${DATE}.
 * @project ${PROJECT_NAME}
 */
public class Main {
    public static void main(String[] args) {

        //Exercise 5
        System.out.println(Exercise5.calculateNumberOfDigit(451));
        System.out.println(Exercise5.calculateNumberOfDigit(-451));
        System.out.println(Exercise5.calculateNumberOfDigit(0));

        //Exercise 6
        int[] num = {11,45,1,78,99,};
        System.out.println(Arrays.toString(Exercise6.checkTheLargestAndTheSmallestNumbers(num)));
    }
}