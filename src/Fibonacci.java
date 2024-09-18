/**
 * The fibonacci  sequence is a series of numbers
 * where a number is the sum of previous two numbers.
 * Starting with 0 and 1, the sequence goes 0,1,2,3,5,8,13,21
 * and so on. Write a program that takes as an input an integer
 * n and generates n numbers of Fibonacci sequence.
 */
public class Fibonacci {
    public static void generateFibonacci(int number) {
        if (number <= 0) {
            System.out.println("Number should be a positive.");
            return;
        }
        int first = 0;
        int second = 1;
        System.out.println("Fibonacci Sequence:");
        for (int i = 0; i < number; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println(" ");
    }
}
