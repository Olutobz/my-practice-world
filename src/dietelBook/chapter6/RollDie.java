/**
 * <p> Created by Onikoyi Damola Olutoba  18/03/19 </p>
 */

package dietelBook.chapter6;

import java.util.Random;

public class RollDie {

    public static void main(String[] args) {
        Random randomNumbers = new Random(); //program uses class Random
        int frequency1 = 0; //maintains count of 1s rolled
        int frequency2 = 0; //maintains count of 2s rolled
        int frequency3 = 0; //maintains count of 3s rolled
        int frequency4 = 0; //maintains count of 4s rolled
        int frequency5 = 0; //maintains count of 5s rolled
        int frequency6 = 0; //maintains count of 6s rolled
        int face; //most recently rolled value

        //tally count for 6 million rolls of a die
        for (int i = 1; i <= 6000000; i++) {
            face = 1 + randomNumbers.nextInt(6);
            //determine the rolled-value from 1-6 and increment the appropriate value by 1
            switch (face) {
                case 1:
                    ++frequency1;
                    break;
                case 2:
                    ++frequency2;
                    break;
                case 3:
                    ++frequency3;
                    break;
                case 4:
                    ++frequency4;
                    break;
                case 5:
                    ++frequency5;
                    break;
                case 6:
                    ++frequency6;
            }
        }
        //print headers for the face and frequency
        System.out.println("Face\tFrequency");
        System.out.printf("1\t\t%d\n2\t\t%d\n3\t\t%d\n4\t\t%d\n5\t\t%d\n6\t\t%d\n", frequency1, frequency2,
                frequency3, frequency4, frequency5, frequency6);
    }
}
