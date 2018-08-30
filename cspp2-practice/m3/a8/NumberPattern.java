/**
 * Date: 29-08-2018.
 * Author: Prudhvik.
 */

import java.util.Scanner;

/**
 * Number Pattern.
 */
public final class NumberPattern {
	/**
	 * Constructs the object.
	 */
	private NumberPattern() {
		// empty construtor
	}

	/**
	 * main function.
	 *
	 * @param      args  command line arguments
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter n:");
		int n = input.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
	}
}