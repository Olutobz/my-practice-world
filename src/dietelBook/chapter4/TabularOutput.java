
/**
 * <p> Created by Onikoyi Damola Olutoba  12/02/19 </p>
 */
package dietelBook.chapter4;

/* Write a Java application that uses looping to print the following table of values:
 * N 10*N 100*N 1000*N
 * 1 10   100   1000
 * 2 20  200   2000
 * 3 30  300   3000
 * 4 40  400   4000
 * 5 50  500   5000
 */
public class TabularOutput {
    //method main begins program execution
    public static void main(String[] args) {
        System.out.println("N\t 10*N\t 100*N\t 1000*N");
        int N = 1;
        int N1, N2, N3;
        while (N <= 5) {
            System.out.print(N);
            N1 = N * 10;
            N2 = N * 100;
            N3 = N * 1000;
            System.out.printf(" \t %d   \t %d   \t %d", N1, N2, N3);
            System.out.println();
            N++;
        } //end while

    } //end method main

} //end class
