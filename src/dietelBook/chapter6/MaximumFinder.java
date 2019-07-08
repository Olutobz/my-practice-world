
/**
 * <p> Created by Onikoyi Damola Olutoba  12/02/19 </p>
 */

package dietelBook.chapter6;

import java.util.Scanner;

public class MaximumFinder {
    //method to determine the largest of three numbers
    private static double maximum(double x, double y, double z) {
        double maximumValue = x; //assumes x is the largest
        //checks if y is greater than x
        if (y > maximumValue) {
            maximumValue = y;
        }
        //checks if z is greater than x or y
        if (z > maximumValue) {
            maximumValue = z;
        }
        return maximumValue;

        /* alternatively we can overwrite the entire body of method maximum with
           return Math.max(x, Math.max(y,z));   */
    }

    //method main begins program execution
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //program uses class Scanner
        System.out.print("Enter three floating-values separated by spaces: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();
        double result = maximum(number1, number2, number3);
        System.out.println("Maximum is: " + result);
        //test for another three sets of floating-values
        System.out.print("Enter another three floating-values separated by spaces: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
        System.out.print("Maximum is: " + Math.max(num1, Math.max(num2, num3)));
    }
}
