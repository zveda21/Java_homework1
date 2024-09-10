import arrays.ArrayExercise1;
import arrays.ArrayExercise2;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        //Exercise 1
        System.out.println(Exercise1.returnNumberOrderType(3, 4, 7));
        System.out.println(Exercise1.returnNumberOrderType(3, 2, 7));
        System.out.println(Exercise1.returnNumberOrderType(3, 2, 1));

        //Exercise 2
        System.out.println(Exercise2.checkIfYearIsLeap(1900));
        System.out.println(Exercise2.checkIfYearIsLeap(2012));
        System.out.println(Exercise2.checkIfYearIsLeap(400));

        //Exercise 3
        System.out.println(Exercise3.numbersCalculationBasedOnChar('-', 3, 5));
        System.out.println(Exercise3.numbersCalculationBasedOnChar('+', 3, 5));
        System.out.println(Exercise3.numbersCalculationBasedOnChar('/', 5, 3));
        System.out.println(Exercise3.numbersCalculationBasedOnChar('*', 3, 5));

        //Exercise 4
        System.out.println(Exercise4.getRequiredCourses("spring", "ec"));
        System.out.println(Exercise4.getRequiredCourses("spring", "cs"));
        System.out.println(Exercise4.getRequiredCourses("fall", "cs"));
        System.out.println(Exercise4.getRequiredCourses("fall", "ec"));

        //Exercise 7
        int[] numbers = {3, 4, 6};
        Exercise7.calculateSumOfNumber(numbers);

        //Exercise 8
        System.out.println(Exercise8.calculateMathPow(3, 2));

        //Exercise 9
        for (int number = 1; number <= 500; number++) {
            if (Exercise9.isNumberArmstrong(number)) {
                System.out.println(number);
            }
        }

        //Fibonacci
        Fibonacci.generateFibonacci(8);

        //Exercise 11
        System.out.println(Exercise11.computeLog2(4));

        //Exercise 12
        Exercise12.drawDiamond(3);

        //Array Exercise  1
        int[] array = {12,4,67,54,22};
        ArrayExercise1.findMinMax(array);


        //Array Exercise  2
        int[] array1 = {1,4,67,22};
        System.out.println(Arrays.toString(ArrayExercise2.removeElement(array1, 4)));;
    }
}