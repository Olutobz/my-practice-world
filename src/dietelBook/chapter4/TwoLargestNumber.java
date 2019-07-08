
/**
 * <p> Created by Onikoyi Damola Olutoba  12/02/19 </p>
 */

package dietelBook.chapter4;

import java.util.Scanner; //program uses class scanner

//Application to find the two largest values of the 10 values entered
public class TwoLargestNumber {
    //method main begins program execution
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number; //The recently input integer by user
        int secondLargest = 0; //The second largest number found so far
        int largest = 0; //The largest number found so far
        int counter = 0; //keeps track of number of repetition

        //loop allows user to enter 10 numbers
        while (counter < 10) {
            System.out.print("Enter number: ");
            number = input.nextInt(); //reads input from command window
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } //end if
            if (number < secondLargest && secondLargest < largest) {
                secondLargest = number;
            } // end if
            counter++;
        } //end while loop

        System.out.println("The largest number is: " + largest);
        System.out.println("The second largest number is: " + secondLargest);

    } //end method main

} //end class
