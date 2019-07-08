/**
 * <p> Created by Onikoyi Damola Olutoba  18/03/19 </p>
 */


package dietelBook.chapter6;

import java.util.Scanner;

public class ReversingDigits {
    /**
     * This method takes in a parameter and returns the reverse of the given number
     *
     * @param digit
     * @return reverse
     */
    private static int reverseDigit(int digit) {
        int reverse = 0;
        while (digit != 0) {
            reverse = reverse * 10;
            reverse = reverse + digit % 10;
            digit /= 10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to find its reverse: ");
        int number = input.nextInt();
        System.out.println("The reverse of " + number + " is "
                + reverseDigit(number));
    }
}
