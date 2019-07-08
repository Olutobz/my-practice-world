
/**
 * <p> Created by Onikoyi Damola Olutoba  12/02/19 </p>
 */

package dietelBook.chapter5;

import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

/*An online retailer sells five products whose retail prices are as follows:
 Product 1, $2.98; product 2, $4.50; product 3, $9.98; product 4, $4.49 and product 5, $6.87.
 Write an application that reads a series of pairs of numbers as follows:
 a) product number
 b) quantity sold
 Your program should use a switch statement to determine the retail price for each product. It
 should calculate and display the total retail value of all products sold. Use a sentinel-controlled
 loop to determine when the program should stop looping and display the final results. */

public class Sales {
    //method main begins program execution
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //program uses class Scanner
        //program uses american dollar sign
        NumberFormat dollar = NumberFormat.getCurrencyInstance(Locale.US);

        //the product numbers of the online retailer
        double product1;
        double product2;
        double product3;
        double product4;
        double product5;
        int productNo, bookingNo; //the number entered by user
        int quantity; //number of quantity required
        double qtySold = 0; //the amount of the product sold


        System.out.print("==>Enter any number to buy products or -1 to quit: ");
        bookingNo = input.nextInt();

        if (bookingNo != 0) {
            while (bookingNo != -1) {
                System.out.print("Enter product number:  ");
                productNo = input.nextInt();
                if (productNo >= 1 && productNo <= 5) {
                    System.out.print("Enter number of quantity needed: ");
                    quantity = input.nextInt();

                    System.out.print("Enter any number to buy products or -1 to quit: ");
                    bookingNo = input.nextInt();

                    switch (productNo) {
                        case 1:
                            product1 = 2.98;
                            qtySold += product1 * quantity;
                            break;
                        case 2:
                            product2 = 4.50;
                            qtySold += product2 * quantity;
                            break;
                        case 3:
                            product3 = 9.98;
                            qtySold += product3 * quantity;
                            break;
                        case 4:
                            product4 = 4.49;
                            qtySold += product4 * quantity;
                            break;
                        case 5:
                            product5 = 6.87;
                            qtySold = product5 * quantity;
                            break;
                    } //end switch
                } else
                    System.out.println(" Please enter a product number in range 1-5");

            }

        } else System.out.println("No product number was entered");

        System.out.printf("%s%s", "==>The total retail value of all products sold is: ", dollar.format(qtySold));

    }

}
