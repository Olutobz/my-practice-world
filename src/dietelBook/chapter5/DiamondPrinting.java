
/**
 * <p> Created by Onikoyi Damola Olutoba  12/02/19 </p>
 */

package dietelBook.chapter5;

import java.util.Scanner;


/* (Q1) Write an application that prints the following diamond
 shape. You may use output statements that print a single asterisk (*), a single space or a single new-
 line character. Maximize your use of repetition (with nested for statements), and minimize the
 number of output statements.

                 *
                ***
               *****
              *******
             *********
              *******
               *****
                ***
                 *

 (Q2) Modify the application you wrote above to read an odd number
 in the range 1 to 19 to specify the number of rows in the diamond. Your
 program should then display a diamond of the appropriate size.

 */
public class DiamondPrinting {
    //method main begins program execution
    public static void main(String[] arg) {
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k < (i * 2); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //to print diamond reverse
        for (int i = 4; i >= 1; i--) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k < (i * 2); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println(); //prints a new blank line

        //modifying the program to allow user specify the number of rows to be shown
        int number; //the number rows entered by the user
        Scanner input = new Scanner(System.in); //program uses class Scanner
        System.out.print("Enter any odd number in the range (1-19): ");
        number = input.nextInt();
        if (number % 2 == 1 && number <= 19) {
            for (int i = 1; i <= number; i++) {
                for (int j = i; j < number; j++) {
                    System.out.print(' ');
                }
                for (int k = 1; k < (i * 2); k++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            //to print diamond in the reverse form
            for (int i = number - 1; i >= 1; i--) {
                for (int j = number; j > i; j--) {
                    System.out.print(" ");
                }
                for (int k = 1; k < (i * 2); k++) {
                    System.out.print('*');
                }
                System.out.println();
            }
            System.out.println();
        } else if (number % 2 == 0) {
            System.out.println(number + " is not an odd number");
        } else if (number > 19) {
            System.out.println("==>Odd number should be in range of 1-19!!!");
        } else
            System.out.println("No number was entered");

    } //end method main
}