/**
 * Date: 30-09-2018
 * Author: Prudhvik
 * Week 1 Exam Q 1
 * Odd Composite Numbers.
 * Write a java program to find the odd composite numbers between 2 and n where n is given as an input.
 * Sample Input: n = 40
 * Sample Output: 9, 15, 21, 25, 27, 33, 35, 39
 * Explanation: Odd Composite numbers are, odd numbers which are not primes.
 */

import java.util.Scanner;

/**
 * Class for solution.
 */
public final class Q1 {

    /**
     * Constructs the object.
     */
    private Q1() {
        // empty constructor
    }

    /**
     * Determines if odd composite.
     *
     * @param      n     check on n
     *
     * @return     True if odd composite, False otherwise.
     */
    static boolean isOddComposite(int n) {
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                return true;
            }
        }
        return false;
    }

    /**
     * Odd Composites Below
     *
     * @param      n     all Odd Composites Below n
     */
    static void OddCompositesBelow(final int n) {
        for (int i = 3; i <= n; i += 2) {
            if (isOddComposite(i)) {
                System.out.println(i);
            }
        }
    }

    /**
     * main function.
     *
     * @param      args  command line argument
     */
    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        OddCompositesBelow(n);
    }

}
