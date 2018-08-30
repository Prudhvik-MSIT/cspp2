/**
 * Date: 30-09-2018
 * Author: Prudhvik
 * Module 4 - Assignment 2
 */

import java.util.*;

/**
 * Class for solution.
 */
public class Solution {

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
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int r = input.nextInt();
        int c = input.nextInt();
        input.nextLine();
        
        int[][] m1 = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                m1[i][j] = input.nextInt();
            }
            input.nextLine();
        }
        
        int[][] m2 = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                m2[i][j] = input.nextInt();
            }
            input.nextLine();
        }
        
        int[][] m = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                m[i][j] = m1[i][j] + m2[i][j];
                System.out.print(m[i][j] + " ");
            } System.out.println("");
        }
    
    }
}