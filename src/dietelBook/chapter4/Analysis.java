
/**
 * <p> Created by Onikoyi Damola Olutoba  12/02/19 </p>
 */

package dietelBook.chapter4;

import java.util.Scanner; //program uses class Scanner

public class Analysis {
    //main method begins program execution
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //initializes variables in declaration
        int passes = 0; //number of passes
        int failures = 0; //number of failures
        int counter = 1; //student counter
        int result;

        while (counter <= 10) {
            System.out.print("Enter result (1 = pass, 2 = fail): ");
            result = input.nextInt();
            if (result == 1)
                passes += 1;
            else
                failures += 1;
            counter++;

        } //end while loop

        System.out.printf("passed: %d\nFailed: %d", passes, failures);

        //determine whether 8 or more passed
        if (passes > 8)
            System.out.println("\nBonus to the instructor!");
    } // end method main

} //end class
