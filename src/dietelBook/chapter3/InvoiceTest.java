
/**
 * <p> Created by Onikoyi Damola Olutoba  12/02/19 </p>
 */

package dietelBook.chapter3;

import java.util.Scanner;

public class InvoiceTest {
    //main method begins program execution
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Invoice invoice1 = new Invoice("", "", 0, 0.0);
        int quantity;
        double item;

        System.out.print("Enter quantity of item being purchased: ");
        quantity = input.nextInt();
        invoice1.setItemPurchased(quantity);
        System.out.printf("\nTotal number of quantities enter: %d\n", invoice1.getItemPurchased());
        System.out.print("\nEnter price of each item being purchased: ");
        item = input.nextDouble();
        invoice1.setPricePerItem(item);
        System.out.printf("Price of quantity enter is: $%.2f\n\n", invoice1.getPricePerItem());
        invoice1.setInvoiceAmount();

    } //end method main

} //end class
