/**
 * <p> Created by Onikoyi Damola Olutoba  12/02/19 </p>
 */
package dietelBook.chapter2;

import java.util.Scanner; //program uses class scanner

//Write an application that inputs three integers from the
//user and displays the sum, average, product, smallest and largest of the numbers.
public class Comparison2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3;
        int sum, average, product;

        System.out.print("Enter first integer: ");
        num1 = input.nextInt(); //reads first input from user
        System.out.print("Enter second integer: ");
        num2 = input.nextInt(); //reads second input from user
        System.out.print("Enter third integer: ");
        num3 = input.nextInt(); //reads third input from user

        sum = num1 + num2 + num3; //gets total integers
        average = (num1 + num2 + num3) / 3; //get the average of the integers
        product = num1 * num2 * num3; //gives the product of the integers

        System.out.println("Sum of the integers is " + sum);
        System.out.println("The average is " + average);
        System.out.println("Their product is " + product);

        if (num1 < num2 && num1 < num3)
            System.out.println("The smallest integer is " + num1);
        else if (num2 < num1 && num2 < num3)
            System.out.println("The smallest integer is " + num2);
        else if (num3 < num1 && num3 < num2)
            System.out.println("The smallest integer is " + num3);

        if (num1 > num2 && num1 > num3)
            System.out.println("The largest integer is " + num1);
        else if (num2 > num1 && num2 > num3)
            System.out.println("The largest integer is " + num2);
        else if (num3 > num1 && num3 > num2)
            System.out.println("The largest integer is " + num3);

        else
            System.out.println("The result are either equal or inconclusive");


    } // end method main

} // end class
