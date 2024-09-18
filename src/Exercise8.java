/**
 * write a program that takes as an input an
 * integer n and an integer k and calculate n
 * to the power  of k, (usage of Math.pow is not allowed)
 */
public class Exercise8 {
    public static long calculateMathPow(int n, int k) {
        if (k == 0) {
            return 1;
        }
        long result = 1;
        for (int i = 0; i < k; i++) {
            result *= n;
        }
        return result;
    }
}
