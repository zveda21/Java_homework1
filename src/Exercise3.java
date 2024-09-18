/**
 * write a program that takes as an input a character
 * representing an operator and two integers.
 * it performs a calculation based on the numbers
 * and the operator entered(program should use switch statement)
 */
public class Exercise3 {
    public static String numbersCalculationBasedOnChar(char operator, int firstNum, int secondNum) {
        double result;

        switch (operator) {
            case '+':
                result = firstNum + secondNum;
                return "The result of " + firstNum + " + " + secondNum + " is: " + result;

            case '-':
                result = firstNum - secondNum;
                return "The result of " + firstNum + " - " + secondNum + " is: " + result;

            case '*':
                result = firstNum * secondNum;
                return "The result of " + firstNum + " * " + secondNum + " is: " + result;

            case '/':
                if (secondNum != 0) {
                    result = (double) firstNum / secondNum;
                    return "The result of " + firstNum + " / " + secondNum + " is: " + result;
                } else {
                    return "Error: Division by zero is not allowed.";
                }

            default:
                return "Error: Invalid operator.";
        }
    }
}
