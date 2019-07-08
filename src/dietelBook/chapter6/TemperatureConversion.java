/**
 * <p> Created by Onikoyi Damola Olutoba  18/03/19 </p>
 */


package dietelBook.chapter6;

import java.util.Scanner;

public class TemperatureConversion {
    private static double celsius(double fahrenheit) {
        return 5.0 / 9.0 * (fahrenheit - 32);
    }

    private static double fahrenheit(double celsius) {
        return 9.0 / 5.0 * celsius + 32;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in fahrenheit: ");
        double fah = input.nextDouble();
        System.out.printf("The celsius equivalent of %.2f fahrenheit is %.2f \n", fah, celsius(fah));

        System.out.print("Enter temperature in celsius: ");
        double cel = input.nextDouble();
        System.out.printf("The fahrenheit equivalent of %.2f celsius is %.2f ", cel, fahrenheit(cel));
        System.out.println();

    }
}
