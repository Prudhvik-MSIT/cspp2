/**
 * Date: 29-08-2018.
 * Author: Prudhvik.
 */

import java.util.Scanner;
/*
Do not modify this main function.
*/

/**
 * Class for solution.
 */
public final class Solution {
/* Fill the main function to print the number of 7's between 1 to n*/

    /**
     * Constructs the object.
     */
    private Solution() {
        // empty constructor
    }
    /**
     * constant ONE
     */
    static final int ONE = 1;

    /**
     * computes and returns GCD of a and b
     *
     * @param      a     first argument
     * @param      b     second argument
     *
     * @return     gcd of a and b
     */
    static int gcd(final int a, final int b) {
        int min = 0;
        if(a < b) {
            min = a;
        } else {
            min = b;
        }

        for (int i = min; i > 1; i--) {
            if(a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return ONE;
    }

    public static void main(final String[] args) {

        Scanner s = new Scanner(System.in);      
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        System.out.println(gcd(n1, n2));
    }
}
