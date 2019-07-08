
/**
 * <p> Created by Onikoyi Damola Olutoba  12/02/19 </p>
 */

package dietelBook.chapter6;

import java.util.Scanner;

public class EvenOrOdd {
    private static boolean isEven(int a) {
        return a % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        //returns true if number is even and false when number is odd
        System.out.println(isEven(number));

    }
}
