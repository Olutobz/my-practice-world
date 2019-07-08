/**
 * <p> Created by Onikoyi Damola Olutoba  18/03/19 </p>
 */

package dietelBook.chapter6;

import java.util.Scanner;

public class PointsDistance {
    private static double distance(double x1, double x2, double y1, double y2) {
        double result = Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2);
        return Math.sqrt(result);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter coordinate for point x1: ");
        double x1 = input.nextDouble();
        System.out.print("Enter coordinate for point x2: ");
        double x2 = input.nextDouble();
        System.out.print("Enter coordinate for point  y1: ");
        double y1 = input.nextDouble();
        System.out.print("Enter coordinate for point y2: ");
        double y2 = input.nextDouble();
        System.out.printf("The distance between the points %.2f", distance(x1, x2, y1, y2));
    }
}
