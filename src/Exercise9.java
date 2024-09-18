/**
 *write a program that finds and prints out
 * all Armstrong numbers between 1 and 500.
 * If the sum of cubes of each digit of the
 * number is equal to the number itself,
 * then the number is called an  Armstrong number.
 * Example : 153=(1*1*1)+(5*5*5)+(3*3*3)
 */

public class Exercise9 {
    public static boolean isNumberArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit * digit * digit;
            number /= 10;
        }
        return sum == originalNumber;
    }
}
