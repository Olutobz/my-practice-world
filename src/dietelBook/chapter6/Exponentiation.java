
/**
 * <p> Created by Onikoyi Damola Olutoba  12/02/19 </p>
 */

package dietelBook.chapter6;

import java.util.Scanner;

public class Exponentiation {
    private static int integerPower(int base, int exponent) {
        int number = 1;
        for (int i = 1; i <= exponent; i++) {
            number *= base;
        }
        return number;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your base number: ");
        int baseNum = input.nextInt();
        System.out.print("Enter the exponent value: ");
        int expNum = input.nextInt();
        System.out.println("The exponential is: " + integerPower(baseNum, expNum));
    }
}
