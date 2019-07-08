/**
 * <p> Created by Onikoyi Damola Olutoba  12/02/19 </p>
 */

package dietelBook.chapter2;

import java.util.Scanner;

//An application that reads two integers, determines whether the first is a
//multiple of the second and prints the result
public class Multiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1, number2;

        System.out.print("Enter first integer: ");
        number1 = input.nextInt();
        System.out.print("Enter second integer: ");
        number2 = input.nextInt();

        if (number1 % number2 == 0) {
            System.out.println(number1 + " is a multiple of " + number2);
        } else System.out.println(number1 + " is not a multiple of " + number2);

    } // end method main

} //end class
