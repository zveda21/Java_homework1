/**
 * write an program that takes as an input an integer
 * representing the year and determines whether it is
 * a leap year is exactly  divisible by 4 except foe
 * century years (years ending with 00).A century year
 * us leap year only if it  is perfectly divisible by 400.
 */
public class Exercise2 {

    public static String checkIfYearIsLeap(int year) {
//        boolean isLeapYear = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
//
//        if (isLeapYear) {
//            return year + " is a leap year.";
//        } else {
//            return year + " is not a leap year.";
//        }
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return year + " is a leap year.";
                } else {
                    return year + " is not a leap year.";
                }
            } else {
                return year + " is a leap year.";
            }
        } else {
            return year + " is not a leap year.";
        }
    }
}
