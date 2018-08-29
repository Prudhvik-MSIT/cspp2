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
     * constant value SEVEN.
     */
    static final int SEVEN = 7;
    /**
     * constant value TEN.
     */
    static final int TEN = 10;

    /**
     * returns no. of 7s in the numbers below n
     *
     * @param      n integer variable below which we have to calculate no. of 7s
     *
     * @return     no. of 7s
     */
    static int noOf7s(final int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            int temp = i;
            while (temp != 0) {
                if (temp % TEN == SEVEN) {
                    count++;
                }
                temp = temp / TEN;
            }
        }
        return count;
    }

    /**
     * main function.
     *
     * @param      args  command line arguments
     */
    public static void main(final String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        System.out.println(noOf7s(n));

    }
}
