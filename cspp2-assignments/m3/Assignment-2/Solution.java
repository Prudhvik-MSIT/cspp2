/**
 * Date: 29-08-2018.
 * Author: Prudhvik.
 */

import java.util.Scanner;
/*
Do not modify this main function.
*/

/**
 * Class for solution.
 */
public class Solution {
/* Fill the main function to print the number of 7's between 1 to n*/
    
    /**
     * Constructs the object.
     */
    private Solution() {
    	// empty constructor
    }

    /**
     * returns no. of 7s in the numbers below n
     *
     * @param      n integer variable below which we have to calculate no. of 7s
     *
     * @return     no. of 7s
     */
    static int noOf7s(int n) {
    	int count = 0;
    	for (int i=0; i<=n; i++) {
    		int temp = i;
    		while (temp != 0) {
    			if (count%10 == 7) count++;
    			temp = temp/10;
    		}
    	}
    	return count;
    }

    /**
     * main function.
     *
     * @param      args  command line arguments
     */
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);      
        int n = s.nextInt();
        
		System.out.println(noOf7s(n));
        
    }
}