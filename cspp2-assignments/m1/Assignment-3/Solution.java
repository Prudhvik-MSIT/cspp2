/**
 * Date: 28-08-2018
 * Author: Prudhvik
 * Degrees to Farenheit
 */
import java.util.Scanner;

/**
 * Solution class
 */
public final class Solution {

    /**
     * Calculates from degrees to farenheit.
     *
     * @param      celcius is tempeature in celcius
     */
    public static void calculateFromDegreesToFarenheit(double celcius) {
        System.out.println(1.8*celcius + 32);
    }

    /**
     * Main method
     *
     * @param      args  command line arguments
     */
    public static void main(String[] args) {
        final Scanner scan = new Scanner(System.in);
        double degreesCelsius = scan.nextDouble();
        calculateFromDegreesToFarenheit(degreesCelsius);
    }
}