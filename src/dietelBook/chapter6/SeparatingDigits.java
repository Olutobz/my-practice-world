/**
 * <p> Created by Onikoyi Damola Olutoba  18/03/19 </p>
 */


package dietelBook.chapter6;

import java.util.Scanner;

public class SeparatingDigits {
    private static int integerPartOfQuotient(int a, int b) {
        int quotient;
        quotient = a / b;
        return quotient;
    }

    private static int integerRemainder(int a, int b) {
        int remainder;
        remainder = a % b;
        return remainder;
    }

    private static void displayDigits(int number) {
        if (number >= 1 && number <= 99999) {
            int digit1, digit2, digit3, digit4, digit5;

            digit5 = integerRemainder(number, 10);
            digit4 = integerRemainder(integerPartOfQuotient(number, 10), 10);
            digit3 = integerRemainder(integerPartOfQuotient(number, 100), 10);
            digit2 = integerRemainder(integerPartOfQuotient(number, 1000), 10);
            digit1 = integerPartOfQuotient(number, 10000);
            System.out.printf("%d  %d  %d  %d  %d", digit1, digit2, digit3, digit4, digit5);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number less than 100,000 and greater than or equal to 1:  ");
        int number = input.nextInt();
        if (number >= 1 && number <= 99999) {
            displayDigits(number);
        } else System.out.println("Please enter a number in the specified range!!");

    }
}
