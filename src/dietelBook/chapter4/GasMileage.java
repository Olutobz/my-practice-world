
/**
 * <p> Created by Onikoyi Damola Olutoba  12/02/19 </p>
 */

package dietelBook.chapter4;

import java.util.Scanner;

/*Develop a Java application that will input the miles driven and gallons
used (both as integers) for each trip. */
public class GasMileage {
    //method main begins program execution
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int noOfTrips; //number of trip(s) to be taken
        int milesDriven; //number of the miles
        int gallonsUsed; //number of gallons consumed
        double milesPerGallon; //number of miles/gallon consumed
        double total = 0;

        System.out.print("Enter number of trip(s) taken or -1 to quit: ");
        noOfTrips = input.nextInt();

        //loops a certain number of times and watchs out for the sentinel input
        while (noOfTrips != -1) {
            System.out.print("Enter miles driven: ");
            milesDriven = input.nextInt();
            System.out.print("Enter gallon(s) used: ");
            gallonsUsed = input.nextInt();
            milesPerGallon = (double) milesDriven / gallonsUsed;
            System.out.printf("The miles per gallon used for the trip(s) is: %.2f", milesPerGallon);
            System.out.print("\nEnter number of trip(s) to be taken or -1 to quit:  ");
            noOfTrips = input.nextInt();
            total += milesPerGallon;
        } //end while loop

        System.out.printf("\nThe total miles per gallon used for the trip(s) entered: %.2f", total);
        System.out.println();

    } //end method main

} //end class
