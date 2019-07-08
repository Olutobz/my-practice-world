
/**
 * <p> Created by Onikoyi Damola Olutoba  12/02/19 </p>
 */

package dietelBook.chapter2;

import java.util.Scanner;

//An application that inputs one number consisting
//of five digits from the user, separates the number into its individual digits and prints the digits
//separated from one another by three spaces each.
public class SplitDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number; // number entered ny the user
        int digit1, digit2, digit3, digit4, digit5; //digits of the number entered

        System.out.print("Enter a number: ");
        number = input.nextInt(); //reads input from user
        digit5 = number % 10;
        digit4 = (number / 10) % 10;
        digit3 = (number / 100) % 10;
        digit2 = (number / 1000) % 10;
        digit1 = (number / 10000);
        System.out.printf("%d   %d   %d   %d   %d", digit1, digit2, digit3, digit4, digit5);
        System.out.println();
    }
}
