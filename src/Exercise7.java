/**
 * write a do-while loop that asks the user to enter the numbers.
 * The numbers should be added and the sum should be displayed.
 * The loop should ask the user whether they wish to perform the
 * operation again .If so, the loop should repeat ;
 * otherwise the program should terminate.
 */
public class Exercise7 {

    public static void calculateSumOfNumber(int[] numbers) {
        boolean continueOperation;
        do {
            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }
            System.out.println("The sum of the entered numbers is: " + sum);

            continueOperation = isRepeat();

        } while (continueOperation);

        System.out.println("Program terminated.");
    }

    private static boolean isRepeat() {
        return false;
    }
}
