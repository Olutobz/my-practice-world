/**
 * <p> Created by Onikoyi Damola Olutoba  18/03/19 </p>
 */

package dietelBook.chapter6;

import java.util.Locale;
import java.util.Scanner;
import java.text.NumberFormat;

/* A parking garage charges a $2.00 minimum fee to park for up to three
 hours. The garage charges an additional $0.50 per hour for each hour or part thereof in excess of three
 hours. The maximum charge for any given 24-hour period is $10.00. Assume that no car parks for
 longer than 24 hours at a time. Write an application that calculates and displays the parking charges
 for each customer who parked in the garage yesterday. You should enter the hours parked for each
 customer. The program should display the charge for the current customer and should calculate and
 display the running total of yesterday’s receipts. It should use the method calculate Charges to
 determine the charge for each customer.  */

public class ParkingCharges {
    //method main begins program execution
    public static void main(String[] args) {
        System.out.println(">>Enter number \"1\" if parking hour(s) is less than 3hrs\n" +
                ">>Enter number \"2\" if parking hours is 3 hrs exactly\n" +
                ">>Enter number \"3\" if parking hours is greater than 3hrs but less than 24hrs\n" +
                ">>Enter number \"4\" if parking hours is 24hrs exactly\n");
        calculateCharges(); //invokes this method to get customer's price

    }

    //method calculateCharges determines the parking charges of customers
    private static void calculateCharges() {
        NumberFormat dollar = NumberFormat.getCurrencyInstance(Locale.US);
        Scanner input = new Scanner(System.in); //program uses class Scanner
        final double minimumFee = 2.00; //if parking hours is 3
        double parkingCharges = 0.0; //price payed for parking
        int parkingHours; //hours taken for parking
        final double extraCharges = 0.50; //additional fee for extra hours of parking
        final double maxCharges = 10.00; //24hrs parking price
        double total = 0.0; //sum of the day's parking charges
        //prompt
        System.out.print("Enter any number for next customer or -1 to exit: ");
        int number = input.nextInt();

        if (number != 0) {
            //while the user has not entered the sentinel value
            while (number != -1) {
                System.out.print("Enter customer's hours of parking: ");
                parkingHours = input.nextInt();

                //determine how much the customer should be charged
                switch (parkingHours) {
                    case 1: //checks if parking hours is in range 1,2 but less than 3 hours
                        parkingCharges = 0.0; //no charges will be issued
                        total = parkingCharges;
                        break;
                    case 2: //checks if parking hours equals 3 hours exactly
                        parkingCharges += minimumFee;
                        total = parkingCharges;
                        break;
                    case 3: //checks if parking hours is above 3 but not up to 24 hours
                        parkingCharges = minimumFee + extraCharges;
                        total = parkingCharges;
                        break;
                    case 4: //checks if parking hours equals 24 hours exactly
                        parkingCharges += maxCharges;
                        total = parkingCharges;
                }
                //remind the user of the sentinel value
                System.out.print("Enter any number for next customer or -1 to exit: ");
                number = input.nextInt();
            }
            System.out.printf("Total parking charges for yesterday: %s\n", dollar.format(total));
        } else
            System.out.println("No customer was entered");
    }

}