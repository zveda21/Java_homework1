/**
 * write a program that takes as an input a
 * positive integer n and computes the natural
 * logarithm of  2 , by adding up to n terms in
 * the series: 1-1/2 + 1/3-1/4+1/5-.....1/n.
 */
public class Exercise11 {
    public static double computeLog2(int number) {
        double result = 0.0;
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                result -= 1.0 / i;
            } else {
                result += 1.0 / i;
            }
        }
        return result;
    }
}
