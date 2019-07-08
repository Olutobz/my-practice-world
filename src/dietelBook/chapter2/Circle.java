/**
 * <p> Created by Onikoyi Damola Olutoba  12/02/19 </p>
 */

package dietelBook.chapter2;

import java.util.Scanner;

//An application that inputs from the user the radius of a circle
//as an integer and prints the circle’s diameter, circumference and area using the floating-point value
//3.14159 for π.
public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int radius;
        int diameter;
        double circumference;
        double area;

        System.out.print("Enter radius of circle: ");
        radius = input.nextInt(); //reads input from user

        diameter = 2 * radius;
        circumference = 2 * Math.PI * radius;
        area = (Math.PI) * radius * radius;

        System.out.println("The diameter of the circle is: " + diameter);
        System.out.printf("%s %.3f\n", "The circumference of the circle is: ", circumference);
        System.out.printf("%s %.3f\n", "The area of the circle is:", area);

    } //end method main
} //end class
