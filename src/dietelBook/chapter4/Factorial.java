
/**
 * <p> Created by Onikoyi Damola Olutoba  12/02/19 </p>
 */

package dietelBook.chapter4;

import java.util.Scanner;

/*  The factorial of a non-negative integer n is written as n! (pronounced “n factorial”)
 * and is defined as follows:
 n! = n · (n – 1) · (n – 2) · … · 1 (for values of n greater than or equal to 1)
 and n! = 1 (for n = 0)
 For example, 5! = 5 · 4 · 3 · 2 · 1, which is 120.
 a) Write an application that reads a non-negative integer and computes and prints its factorial.
 b) Write an application that estimates the value of the mathematical constant e by using
 the following formula. Allow the user to enter the number of terms to calculate.
                 e = 1 + 1/1! + 1/2! +1/3! + ...
 c) Write an application that computes the value of e^x by using the following formula. Al-
 low the user to enter the number of terms to calculate.
                  e^x = 1 + x/1! + x^2/2! + x^3/3! + ...
 */

public class Factorial {
    private void factorial() {
        int number; //number entered by the user
        Scanner input = new Scanner(System.in);
        long product = 1;
        System.out.print("Enter a number to find its factorial: ");
        number = input.nextInt(); //reads input from user

        if (number >= 0) {
            for (int i = 1; i <= number; i++) {
                product *= i;
            }
            System.out.printf("The factorial of %d is: %d\n", number, product);

        } //end if
        else System.out.printf("%d %s %s", number, "is not a positive number",
                "\nPlease enter a non-negative number!!!\n\n");

    } //end method factorial

    //Gets the value of exponential number
//    private double exponentialTerm () {
//        double exponent;
//        long factorial = 0;
//        int counter = 1;
//
//        while (counter >=1 ) {
//            factorial += 1/factorial;
//            counter++;
//
//        }
//        exponent = 1 + factorial;
//        return exponent;
//    } //end method exponential
//
//    private int findPower(int number, int power) {
//        int counter = 0;
//        int result = 1;
//        while (power > counter) {
//            result *= number;
//            counter++;
//        }
//        return result;
//    }
//
//    private double exponentialPower(int power, int terms) {
//        double result;
//        double loop = 0;
//        int counter = 1;
//        while (counter <= terms) {
//            loop += (double) findPower(power, counter) / factorial();
//            counter++;
//        }
//        result = 1 + loop;
//        return result;
//
//
//    } //end method exponentialPower


    //Method main begins program execution
    public static void main(String[] args) {
        Factorial test = new Factorial();
        test.factorial();


    } //end method main


} //end class
