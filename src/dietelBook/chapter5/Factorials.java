
/**
 * <p> Created by Onikoyi Damola Olutoba  12/02/19 </p>
 */
package dietelBook.chapter5;

// Factorials are used frequently in probability problems. The factorial of a positive
//integer n (written n! and pronounced “n factorial”) is equal to the product of the positive integers from
//1 to n. Write an application that calculates the factorials of 1 through 20. Use type long. Display the
//results in tabular format. What difficulty might prevent you from calculating the factorial of 100?

public class Factorials {
    //method main begins program execution
    public static void main(String[] args) {
        long product = 1; //stores the factorial equivalence of the numbers

        System.out.printf("%s %15s", "Number", "Factorials");

        for (int number = 1; number <= 20; number++) {
            product *= number;
            System.out.printf("\n%d %11d! = %d", number, number, product);
            System.out.print("   (Where \"!\" stands for factorial i.e n!) ");
        }
        System.out.println();

    }

    //Answer to last statement question is written below
    //==>The difficult faced was that variable product of type long
    // ==>could not contain all the numbers greater than its limit

}
