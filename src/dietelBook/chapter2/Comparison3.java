/**
 * <p> Created by Onikoyi Damola Olutoba  12/02/19 </p>
 */
package dietelBook.chapter2;

import java.util.Scanner;

//An application that reads five integers and determines
//and prints the largest and smallest integers in the group.
public class Comparison3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3, num4, num5;

        System.out.print("Enter first integer: ");
        num1 = input.nextInt(); //reads input from user
        System.out.print("Enter second integer: ");
        num2 = input.nextInt();
        System.out.print("Enter third integer:");
        num3 = input.nextInt();
        System.out.print("Enter fourth integer: ");
        num4 = input.nextInt();
        System.out.print("Enter fifth integer: ");
        num5 = input.nextInt();

        if (num1 < num2 && num1 < num3 && num1 < num4 && num1 < num5)
            System.out.println("The smallest integer is: " + num1);
        else if (num2 < num1 && num2 < num3 && num2 < num4 && num2 < num5)
            System.out.println("The smallest integer is: " + num2);
        else if (num3 < num1 && num3 < num2 && num3 < num4 && num3 < num5)
            System.out.println("The smallest integer is: " + num3);
        else if (num4 < num1 && num4 < num2 && num4 < num3 && num4 < num5)
            System.out.println("The smallest integer is: " + num4);
        else if (num5 < num1 && num5 < num2 && num5 < num3 && num5 < num4)
            System.out.println("The smallest integer is; " + num5);

        if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5)
            System.out.println("The largest integer is: " + num1);
        else if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5)
            System.out.println("The largest integer is: " + num2);
        else if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5)
            System.out.println("The largest integer is: " + num3);
        else if (num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5)
            System.out.println("The largest integer is: " + num4);
        else if (num5 > num1 && num5 > num2 && num5 > num3 && num5 > num4)
            System.out.println("The largest integer is: " + num5);

        else
            System.out.println("The result are either equal or inconclusive");

    } //end method main

} //end class
