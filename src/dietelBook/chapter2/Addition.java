
/**
 * <p> Created by Onikoyi Damola Olutoba  12/02/19 </p>
 */

package dietelBook.chapter2;

import java.util.Scanner; //program uses class Scanner

// Addition program that displays the sum of two numbers collected from user
public class Addition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, //first number to add
                num2, //second number to add
                sum; //addition of first and second number

        System.out.print("Enter first number: "); //prompt
        num1 = input.nextInt(); //reads first input from user
        System.out.print("Enter second number: "); //prompt
        num2 = input.nextInt(); //reads second input from user
        sum = num1 + num2; //total of both numbers

        System.out.printf("%s %d\n", "sum is", sum); //output the aggregate numbers
    } // end method main
}// end class
