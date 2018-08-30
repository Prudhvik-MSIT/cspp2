/**
 * Date: 30-09-2018
 * Author: Prudhvik
 * Week 1 Exam Q 3
 * Write a java program,given two integer arrays compute
 * Intersection of both the arrays
 * Union of both the arrays
 */

import java.util.Scanner;

/**
 * Class for solution.
 */
public final class Q3 {

	/**
	 * Constructs the object.
	 */
	private Q3() {
		// empty constructor
	}

	/**
	 * resturns intersection of both arrays
	 *
	 * @param      arr1  The arr 1
	 * @param      arr2  The arr 2
	 *
	 * @return     intersection of both arrays
	 */
	static String intersectionOfBothArrays(final int[] arr1, final int[] arr2) {
		String res = "";
		for (int i = 0; i < arr1.length; i++) {
			int count = 0;
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					count++;
				}
			}
			if (count != 0) {
				res += arr1[i] + " ";
			}
		}
		return res.trim();
	}

	/**
	 * returns union of both arrays
	 *
	 * @param      arr1  The arr 1
	 * @param      arr2  The arr 2
	 *
	 * @return     union of both arrays
	 */
	static String unionOfBothArrays(final int[] arr1, final int[] arr2) {
		String res = "";
		for (int i = 0; i < arr1.length; i++) {
			res += arr1[i] + " ";
		}
		res += intersectionOfBothArrays(arr1, arr2);
		return res.trim();
	}
	/**
	 * main function.
	 *
	 * @param      args  command line argument
	 */
	public static void main(final String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n1 = input.nextInt();
		input.nextLine();
		int arr1[] = new int[n1];
		for (int i = 0; i < n1; i++) {
			arr1[i] = input.nextInt();
		}
		
		input.nextLine();
		
		int n2 = input.nextInt();
		input.nextLine();
		int arr2[] = new int[n2];
		for (int i = 0; i < n2; i++) {
			arr2[i] = input.nextInt();
		}
		
		System.out.println(intersectionOfBothArrays(arr1, arr2));
		System.out.println(unionOfBothArrays(arr1, arr2));
	}

}
