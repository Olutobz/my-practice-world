/**
 * <p> Created by Onikoyi Damola Olutoba  06/04/19 </p>
 */

package dietelBook.chapter7;

import java.util.Random;

public class RollDie {

    public static void main(String[] args) {
        Random randomNumbers = new Random(); //generates random numbers from 0 to 1
        int[] frequency = new int[7]; //array of frequency counters

        //display column headers
        System.out.printf("%s%10s\n", "Face", "Frequency");

        //roll dice 6 million times
        for (int i = 1; i <= 6000000; i++) {
            //determines which frequency of range 1-6 in the element to increment
            ++frequency[1 + randomNumbers.nextInt(6)];
        }
        //output each array's element value
        for (int i = 1; i < frequency.length; i++) {
            System.out.printf("%4s%10d\n", i, frequency[i]);
        }
    }
}
