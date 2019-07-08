/**
 * <p> Created by Onikoyi Damola Olutoba  12/02/19 </p>
 */

package dietelBook.chapter2;

import java.util.Scanner; //program uses class Scanner

// Compare integers using if statements, relational operators and equality operators
public class Comparison {
    public static void main(String[] args) {
        //create scanner to obtain input from command line
        Scanner input = new Scanner(System.in);
        int number1; //first number to be compared
        int number2; //second number to be compared

        System.out.print("Enter the first number1: ");
        number1 = input.nextInt(); //reads input from user
        System.out.print("Enter the second integer: ");
        number2 = input.nextInt();

        //conditional statement
        if (number1 == number2)
            System.out.printf("%d %s %d\n", number1, "is equal to ", number2);
        if (number1 != number2)
            System.out.printf("%d %s %d\n", number1, "is not equal to ", number2);
        if (number1 < number2)
            System.out.printf("%d %s %d\n", number1, "is less than ", number2);
        if (number1 > number2)
            System.out.printf("%d %s %d\n", number1, "is greater than ", number2);
        if (number1 <= number2)
            System.out.printf("%d %s %d\n", number1, "is less than or equal to ", number2);
        if (number1 >= number2)
            System.out.printf("%d %s %d\n", number1, "is greater than or equal to ", number2);

    } //end method main
} //end class
