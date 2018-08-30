/**
 * Date: 30-09-2018
 * Author: Prudhvik
 * Module 4 - Assignment 2
 * Given an String, Write a java method that returns the decimal value for the
 * given binary string.
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
     * to convert from binary to decimal.
     *
     * @param      s     the binary number
     *
     * @return     the decimal equivalent
     */
    static String binaryToDecimal(String s) {
        long sum = 0, pow = 1;
        for (int i = 0; i < s.length(); i++) {
            sum += (int)s.charAt(i) * pow;
            pow *= 2;
        }
        return sum + "";
    }

    /*
    Do not modify this main function.
    */
    /**
     * main function.
     *
     * @param      args  command line argument
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            String s = sc.nextLine();
            String res = binaryToDecimal(s); //Write binaryToDecimal function
            System.out.println(res);
        }
    }

}
