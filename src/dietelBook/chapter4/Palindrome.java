
/**
 * <p> Created by Onikoyi Damola Olutoba  12/02/19 </p>
 */

package dietelBook.chapter4;

import java.util.Scanner;

/* A palindrome is a sequence of characters that reads the same backward as for-
 ward. For example, each of the following five-digit integers is a palindrome: 12321, 55555, 45554
 and 11611. Write an application that reads in a five-digit integer and determines whether it’s a palindrome.
 If the number is not five digits long, display an error message and allow the user to enter
 a new value. */

public class Palindrome {
    //method main begins program execution
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //program uses class Scanner
        System.out.print("Enter any 5 digits to check if it's a palindrome: ");
        String digit = input.nextLine();
        int number = Integer.parseInt(digit); //converts the entered String to an integer


        StringBuilder reversed = new StringBuilder();
        //checks if number equals a length of 5 digits
        if (digit.length() == 5) {
            for (int i = digit.length() - 1; i >= 0; i--) {
                reversed.append(digit.charAt(i));
            }
            if (digit.equals(reversed.toString())) {
                System.out.printf("%d is a palindrome", number);
            } else System.out.printf("%d is NOT a palindrome", number);

        } //end if
        else System.out.println("It is not a 5 digit number, please enter 5 digits numbers");

    } //end main method


} //end class
