
/**
 * <p> Created by Onikoyi Damola Olutoba  12/02/19 </p>
 */

package dietelBook.chapter5;

import java.util.Scanner;

//Write an application that finds the smallest of several integers.
//Assume that the first value read specifies the number of values to input from the user.
public class SmallestValue {
    //main method begins program execution
    public static void main(String[] args) {
        int number, counter, smallest = Integer.MAX_VALUE;
        Scanner input = new Scanner(System.in); //program uses class Scanner
        System.out.print("How many numbers do you wanna input: ");
        counter = input.nextInt();

        for (int i = 0; i < counter; i++) {
            System.out.print("Enter a number: ");
            number = input.nextInt();

            if (number < smallest) {
                smallest = number;
            } //end if
        } //end for

        System.out.printf("Smallest number is: %d", smallest);
    } //end method main

} //end class
