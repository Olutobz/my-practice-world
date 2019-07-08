/**
 * <p> Created by Onikoyi Damola Olutoba  18/03/19 </p>
 */


package dietelBook.chapter6;

import java.util.Scanner;

public class RoundingNumbers {
    //main method begins program execution
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double number = input.nextDouble();
        System.out.print("Enter second number: ");
        double number2 = input.nextDouble();

        //converting the floating-values to integers
        int result = (int) Math.floor(number);
        int result2 = (int) Math.floor(number2);

        //display headers for original number and the rounded numbers
        System.out.printf("\n%s %15s\n", "OriginalNumber", "RoundedNumber");
        System.out.printf("%f%10d \n%f%10d", number, result, number2, result2);
        System.out.println();

        System.out.printf("\n%s%f%s%f%s%d%s%d", "Nearest Integer for ", number, " and ",
                number2, " ==> ", roundToInteger(number), " and ", roundToInteger(number2));
        System.out.printf("\n%s%f%s%f%s%d%s%d", "Nearest tenths for ", number, " and ",
                number2, " ==> ", roundToTenths(number), " and ", roundToTenths(number2));
        System.out.printf("\n%s%f%s%f%s%d%s%d", "Nearest hundredths for ", number, " and ",
                number2, " ==> ", roundToHundredths(number), " and ", roundToHundredths(number2));
        System.out.printf("\n%s%f%s%f%s%d%s%d", "Nearest thousand for ", number, " and ",
                number2, " ==> ", roundToThousandths(number), " and ", roundToThousandths(number2));
        System.out.println(); //prints a new line
    }

    //method for rounding number to integer
    private static int roundToInteger(double number) {
        return (int) Math.floor(number + 0.5);
    }

    //method for rounding number to its tenths
    private static int roundToTenths(double number) {
        return (int) Math.floor(number * 10 + 0.5) / 10;
    }

    //method for rounding to its hundredths
    private static int roundToHundredths(double number) {
        return (int) Math.floor(number * 100 + 0.5) / 100;
    }

    //method for rounding number to its thousandths
    private static int roundToThousandths(double number) {
        return (int) Math.floor(number * 1000 + 0.5) / 1000;
    }

}
