
/**
 * <p> Created by Onikoyi Damola Olutoba  12/02/19 </p>
 */

package dietelBook.chapter6;

import java.util.Scanner;

public class Hypotenuse {
    private static double hypotenuse(double side1, double side2) {
        return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));

        /*Alternatively we could use class Math and its method hypot
         * i.e Math.hypot(double side1, double side2) */
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of side1: ");
        double side1 = input.nextDouble();
        System.out.print("Enter value of side2: ");
        double side2 = input.nextDouble();
        System.out.printf("The hypotenuse of the right triangle is: %.2f \n", hypotenuse(side1, side2));

    }
}