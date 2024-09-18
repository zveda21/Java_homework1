import java.util.List;

/**
 * write a program that takes as an input three numbers and
 * points 'increasing ' if the numbers are in  increasing order
 * ,'decreasing ' if the number are in decreasing order, and
 * 'neither' otherwise (use conditional operator) in java
 */
public class Exercise1 {

    public static String returnNumberOrderType(int firstNum, int secondNum, int thirdNum) {
//        return (firstNum < secondNum && secondNum < thirdNum) ? "increasing" :
//                (firstNum > secondNum && secondNum > thirdNum) ? "decreasing" : "neither";

        if (firstNum < secondNum && secondNum < thirdNum) {
            return "The numbers are in increasing order.";
        } else if (firstNum > secondNum && secondNum > thirdNum) {
            return "The numbers are in decreasing order.";
        } else {
            return "The numbers are neither in increasing nor decreasing order.";
        }

    }
}
