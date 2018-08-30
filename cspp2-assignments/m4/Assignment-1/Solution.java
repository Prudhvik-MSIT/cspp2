/**
 * Date: 30-09-2018
 * Author: Prudhvik
 * Module 4 - Assignment 1
 */

import java.util.Scanner;

/**
 * Class for solution.
 */
public class Solution {
	/*
	Fill this main function to print maximum of given array
	*/

	/**
	 * Constructs the object.
	 */
	private Solution() {
		// empty constructor
	}

	/**
	 * function to find maximum in a given array.
	 *
	 * @param      arr   The array
	 *
	 * @return     maximum value in the array
	 */
	static int max(int[] arr) {
		int maximum = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (maximum < arr[i]) {
				maximum = arr[i];
			}
		}
		return maximum;
	}

	/**
	 * main function.
	 *
	 * @param      args  command line arguments
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); sc.nextLine();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt(); sc.nextLine();
		}
		System.out.println(max(arr));
	}
}
