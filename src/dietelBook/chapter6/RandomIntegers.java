/**
 * <p> Created by Onikoyi Damola Olutoba  18/03/19 </p>
 */


package dietelBook.chapter6;

import java.util.Random;

public class RandomIntegers {
    public static void main(String[] args) {
        Random randomNumbers = new Random(); //program uses class Random
        for (int i = 1; i <= 20; i++) {
            //pick a random number from 1 to 6
            int face = 1 + randomNumbers.nextInt(6);

            System.out.printf("%d ", face);

            //after 5 numbers already generated print a new line
            if (i % 5 == 0)
                System.out.println();
        }
    }
}
