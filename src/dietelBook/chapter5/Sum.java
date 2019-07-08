
/**
 * <p> Created by Onikoyi Damola Olutoba  12/02/19 </p>
 */

package dietelBook.chapter5;

public class Sum {
    public static void main(String[] args) {
        int total = 0;
        for (int counter = 2; counter <= 20; counter += 2) {
            System.out.printf("%d ", counter);
            total += counter;
        } //end for
        System.out.println("\nThe sum of the even numbers is: " + total);

    } //end method main

} //end class
