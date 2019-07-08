package dietelBook.chapter4;

import java.util.Scanner; //program uses class Scanner

/*A Java application that inputs a series of 10 integers and determines
and prints the largest integer. */
public class LargestNumber {
    //method main begins program execution
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number; //The recently input integer by user
        int largest = 0; //The largest number found so far
        int counter = 0; //keeps track of numbers inputted.

        //loop allows user to enter 10 numbers
        while (counter < 10) {
            System.out.print("Enter number: ");
            number = input.nextInt(); //reads input from user
            //checks and updates largest number
             if (number > largest) {
                 largest = number;
             } //end if
            counter++;
        } //end while loop

        System.out.println("The largest number will be : "+ largest);
    } //end method main

} //end class
