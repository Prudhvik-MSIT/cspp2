/**
 * Date: 30-09-2018
 * Author: Prudhvik
 * Week 1 Exam Q 2
 * Write a java program to round the elements of a matrix to the nearest multiple of 100.
 * Note:
 * 1. Multiples of 100 are 0,100,200,.....
 * 2. If the difference between the multiples is same,consider the highest multiple.
 * Example: 50
 * Consider 100 instead of 0.
 *
 * Sample Input:
 * 3
 * 3
 * 2	98		17
 * 71	101		202
 * 199	50		100

 * Sample Output:
 * 0	100		0
 * 100	100		200
 * 200	100		100
 */

import java.util.Scanner;

/**
 * Class for solution.
 */
public final class Q2 {

	/**
	 * Constructs the object.
	 */
	private Q2() {
		// empty constructor
	}

	static int[][] roundMatrix(final int[][] m) {
		int[][] rm = new int[m.length][m[0].length];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (m[i][j] % 100 >= 50) {
					rm[i][j] = (m[i][j] / 100) * 100 + 100;
				} else {
					rm[i][j] = (m[i][j] / 100) * 100;
				}
			}
		}
		return rm;
	}

	/**
	 * main function.
	 *
	 * @param      args  command line argument
	 */
	public static void main(final String[] args) {
		Scanner input = new Scanner(System.in);

		int r = input.nextInt();
		int c = input.nextInt();
		input.nextLine();

		int[][] m = new int[r][c];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				m[i][j] = input.nextInt();
			}
			input.nextLine();
		}

		int[][] mround = roundMatrix(m);
		String res = "";
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				res += mround[i][j] + " ";
			}
			res = res.trim() + "\n";
		}
		System.out.println(res);
	}

}
