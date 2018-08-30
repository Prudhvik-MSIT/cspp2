/**
 * Date: 29-08-2018.
 * Author: Prudhvik.
 */

import java.util.Scanner;

/**
 * Sum of N natural numbers
 */
public final class SumOfNNaturalNumbers {
	/**
	 * Constructs the object.
	 */
	private SumOfNNaturalNumbers() {
		// empty constructor
	}
	/**
	 * main function.
	 *
	 * @param      args  command line arguments
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter n:");
		int n = input.nextInt(), sum = 0;
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}
