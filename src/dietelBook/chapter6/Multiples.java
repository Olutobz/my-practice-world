/**
 * <p> Created by Onikoyi Damola Olutoba  18/03/19 </p>
 */

package dietelBook.chapter6;

import java.util.Scanner;

public class Multiples {
    private static boolean isMultiple(int a, int b) {
        return a % b == 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number:");
        int a = input.nextInt();
        System.out.print("Enter second number:");
        int b = input.nextInt();

        System.out.println(isMultiple(a, b));
    }
}
