/**
 * Date: 30-09-2018
 * Author: Prudhvik
 * Module 4 - Assignment 2
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

    /* Fill the main function to print resultant of addition of matrices*/
    /**
     * main function.
     *
     * @param      args  command line arguments
     */
    public static void main(final String[] args) {

        Scanner input = new Scanner(System.in);

        int r1 = input.nextInt();
        int c1 = input.nextInt();
        input.nextLine();

        int[][] m1 = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                m1[i][j] = input.nextInt();
            }
            input.nextLine();
        }

        int r2 = input.nextInt();
        int c2 = input.nextInt();
        input.nextLine();

        int[][] m2 = new int[r2][c2];
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                m2[i][j] = input.nextInt();
            }
            input.nextLine();
        }

        if (r1 == r2 && c1 == c2) {
            String res = "";
            int[][] m = new int[r1][c1];
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    m[i][j] = m1[i][j] + m2[i][j];
                    res += m[i][j] + " ";
                }
                res = res.trim() + "\n";
            }
            System.out.print(res);
        } else {
            System.out.println("not possible");
        }


    }
}
