
/**
 * <p> Created by Onikoyi Damola Olutoba  12/02/19 </p>
 */

package dietelBook.chapter6;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        double radius = input.nextDouble();
        System.out.printf("The area of the circle is: %.2f\n", circleArea(radius));

    }

    private static double circleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

}
