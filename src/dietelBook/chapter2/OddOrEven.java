
/**
 * <p> Created by Onikoyi Damola Olutoba  12/02/19 </p>
 */
package dietelBook.chapter2;

import java.util.Scanner; //program uses class Scanner

//An application that reads an integer and determines and prints whether
//it’s odd or even
public class OddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Enter an integer: ");
        number = input.nextInt(); //reads input from user
        if (number % 2 == 0)
            System.out.println(number + " is an even number: ");
        else
            System.out.println(number + " is a odd number ");

    } //end method main

} //end class
