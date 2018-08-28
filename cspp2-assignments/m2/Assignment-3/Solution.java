/**
 * Date: 28-08-2018
 * Author: Prudhvik
 * Area of circle
 */
import java.util.Scanner;

/**
 * Class for solution.
 */
public final class Solution {

    /**
     * Constructs the object.
     */
    private Solution() {
        // empty constructor
    }

    /**
     * power function.
     *
     * @param      base      The base
     * @param      exponent  The exponent
     *
     * @return     base power exponent
     */
    public static int power(final int base, final int exponent) {
        if (exponent == 0) {
            return 1;
        }
        return base * power(base, exponent - 1);
    }

    /**
     * main function.
     *
     * @param      args  is command line arguments
     */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int base = s.nextInt();
        int exponent = s.nextInt();
        int result = power(base, exponent);
        System.out.println(result);
    }
}
