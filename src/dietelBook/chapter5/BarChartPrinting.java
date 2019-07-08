package dietelBook.chapter5;


/**
 * <p> Created by Onikoyi Damola Olutoba  12/02/19 </p>
 */

import java.util.Scanner;

/*One interesting application of computers is to display
 graphs and bar charts. Write an application that reads five numbers between 1 and 30. For each
 number that’s read, your program should display the same number of adjacent asterisks. For exam-
 ple, if your program reads the number 7, it should display*******. Display the bars of asterisks after
 you read all five numbers. */

public class BarChartPrinting {
    //method main begins program execution
    public static void main(String[] args) {
        int number; //The number entered by the user
        int counter; //keeps track of the number of repetition

        Scanner input = new Scanner(System.in); //program uses class Scanner
        for (counter = 1; counter <= 5; counter++) {
            System.out.print("Enter a number between 1-30: ");
            number = input.nextInt();

            //checks if number is in the range required
            if (number <= 30) {
                for (int i = 1; i <= number; i++) {
                    System.out.printf("%c", '*');
                }
                System.out.println(); //prints a blank line

            } else System.out.println("==>Please entered a number between 1-30 !!");

        } //end for
    }
}
