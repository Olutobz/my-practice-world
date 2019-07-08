
/**
 * <p> Created by Onikoyi Damola Olutoba  12/02/19 </p>
 */

package dietelBook.chapter5;

//An application that calculates the product of the odd integers from 1 to 15.

public class OddIntegersProduct {
    //method main begins program execution
    public static void main(String[] args) {
        int product = 1; //product of the integers
        for (int i = 1; i <= 15; i += 2) {
            product *= i;
        } //end for
        System.out.println("Product of the odd integers is: " + product);

    }

}
