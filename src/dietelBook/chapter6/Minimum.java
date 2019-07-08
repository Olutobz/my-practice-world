
/**
 * <p> Created by Onikoyi Damola Olutoba  18/03/19 </p>
 */

package dietelBook.chapter6;

import java.util.Scanner;

public class Minimum {
    private static double minimum3(double a, double b, double c) {
        return Math.min(Math.min(a,b), c);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double a = input.nextDouble();
        System.out.print("Enter the second number: ");
        double b = input.nextDouble();
        System.out.print("Enter the third number: ");
        double c = input.nextDouble();
        System.out.println("The smallest of the numbers is: " + minimum3(a,b,c));
    }
}
