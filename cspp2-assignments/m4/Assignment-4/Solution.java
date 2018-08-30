/**
 * Date: 30-09-2018
 * Author: Prudhvik
 * Module 4 - Assignment 2
 * Given an String, Write a java method that returns the decimal value for the given binary string.
 */

import java.util.Scanner;

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

    /**
     * main function.
     *
     * @param      args  command line arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String reverse = reverseString(s);
        System.out.println(reverse);

    }

    /**
     * Write reverseString function.
     *
     * @param      s     input string
     *
     * @return     reverse of s
     */
    static String reverseString(final String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        return rev;
    }

}
