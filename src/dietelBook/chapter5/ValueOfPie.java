
/**
 * <p> Created by Onikoyi Damola Olutoba  12/02/19 </p>
 */
package dietelBook.chapter5;

/*Calculate the value of π from the infinite series
 π = 4 - 4/3 + 4/5 - 4/7 + 4/9 - 4/11 + ...
 Print a table that shows the value of π approximated by computing the first 200,000 terms of this
 series. How many terms do you have to use before you first get a value that begins with 3.14159? */

public class ValueOfPie {
    //method main begins program execution
    public static void main(String[] args) {
        int noOfTerms = 1; //represent the number of terms
        int counter = 0; //number of times to loop
        double pie = 0; //represent the value of pie

        while (noOfTerms <= 200000) {
            pie += 4 / ((2 * noOfTerms - 1) * Math.pow(-1, noOfTerms + 1));
            System.out.printf("The value of pie is: %.5f\n", pie);
            System.out.printf("Number of terms added is: %d\n", counter);
            if (pie == 3.14159) {
                System.out.println("Number of terms used is: " + counter);
            }
            counter++;
            noOfTerms++;

        }

    }
}
